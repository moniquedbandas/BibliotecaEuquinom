package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Livros;

public class LivrosDAO {
    public void cadastrarLivros(Livros livros) throws ExceptionMVC {
    String sql = "INSERT INTO livros (titulo, autor, genero, sinopse, nPaginas, ano) VALUES (?, ?, ?, ?, ?, ?)";
    String sqlLivrosAutor = "INSERT INTO livros_autor (codAutor, codLivros) VALUES (?, ?)";
    Connection connection = null;
    PreparedStatement pStatement = null;
    
    try {
        connection = new ConnectionMVC().getConnection();        
        pStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pStatement.setString(1, livros.getTitulo());
        pStatement.setString(2, livros.getAutor());
        pStatement.setString(3, livros.getGenero());
        pStatement.setString(4, livros.getSinopse());
        pStatement.setInt(5, livros.getnPaginas());
        pStatement.setInt(6, livros.getAno());
        pStatement.executeUpdate();

        int codLivros;
        try (ResultSet generatedKeys = pStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                codLivros = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Falha ao recuperar o código do livro recém-cadastrado.");
            }
        }
        
        AutorDAO autorDAO = new AutorDAO();
        int codAutor = autorDAO.buscarCodAutorPorNome(livros.getAutor());
        try (PreparedStatement pStatementLivrosAutor = connection.prepareStatement(sqlLivrosAutor)) {
            pStatementLivrosAutor.setInt(1, codAutor);
            pStatementLivrosAutor.setInt(2, codLivros);
            pStatementLivrosAutor.executeUpdate();
        }
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar livro: "+ e);
        } finally{
            
            try{
                if(pStatement != null){
                    pStatement.close();
                } 
            }catch(SQLException e){
              throw new ExceptionMVC("Erro ao fechar statement: "+ e);
            } try {
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
               throw new ExceptionMVC("Erro ao fechar a conexao: "+ e);
                }
        }
    }
    
    public ArrayList<Livros> listarLivros(String nome) throws ExceptionMVC{
        String sql = "SELECT * FROM livros WHERE titulo like '%" + nome + "%' ORDER BY titulo";        
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Livros> livrosLista = null;        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs!=null){
                livrosLista = new ArrayList<Livros>();
                
                while(rs.next()){
                    Livros livro = new Livros();
                    livro.setCodLivros(rs.getInt("codLivros"));
                    livro.setTitulo(rs.getString("titulo"));
                    livro.setAutor(rs.getString("autor"));
                    livro.setGenero(rs.getString("genero"));                    
                    livro.setSinopse(rs.getString("sinopse"));
                    livro.setnPaginas(rs.getInt("nPaginas"));
                    livro.setAno(rs.getInt("ano"));
                    livrosLista.add(livro);                            
                }
            }            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao consultar livro: "+ e);
        }finally{
            try{
                if(pStatement != null){
                    pStatement.close();
                } 
            }catch(SQLException e){
              throw new ExceptionMVC("Erro ao fechar statement: "+ e);
            } try {
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
               throw new ExceptionMVC("Erro ao fechar a conexao: "+ e);
            }
        }
        return livrosLista;
    }
    
    public void alterarLivros(Livros livros) throws ExceptionMVC{
        String sql = "UPDATE livros SET titulo=?, autor=?, genero=?, sinopse=?, nPaginas=?, ano=? WHERE codLivros=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, livros.getTitulo());
            pStatement.setString(2, livros.getAutor());
            pStatement.setString(3, livros.getGenero());
            pStatement.setString(4, livros.getSinopse());
            pStatement.setInt(5, livros.getnPaginas());
            pStatement.setInt(6, livros.getAno());
            pStatement.setInt(7, livros.getCodLivros());
            pStatement.execute();
            
                    
        }catch(SQLException e){
            throw new ExceptionMVC("Erro ao alterar livro: " + e);
        } finally{
            
            try{
                if(pStatement != null){
                    pStatement.close();
                } 
            }catch(SQLException e){
              throw new ExceptionMVC("Erro ao fechar statement: " + e);
            } try {
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
               throw new ExceptionMVC("Erro ao fechar a conexao: " + e);
                }
        }
    }
    
    public void excluirLivros(Livros livros) throws ExceptionMVC {
        String sql = "DELETE FROM livros WHERE codLivros=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, livros.getCodLivros());            
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao excluir livro: "+ e);
        } finally{            
            try{
                if(pStatement != null){
                    pStatement.close();
                } 
            }catch(SQLException e){
              throw new ExceptionMVC("Erro ao fechar statement: "+ e);
            } try {
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
               throw new ExceptionMVC("Erro ao fechar a conexao: "+ e);
                }
        }
    }
}
    

