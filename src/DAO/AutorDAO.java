package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Autor;

public class AutorDAO {
     public void cadastrarAutor(Autor autor) throws ExceptionMVC {
        String sql = "INSERT INTO autor (nome, nacionalidade) VALUE (?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, autor.getNome());
            pStatement.setString(2, autor.getNacionalidade());
            
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar autor: "+ e);
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
     
     public ArrayList<Autor> listarAutores() throws ExceptionMVC{
        String sql = "SELECT * FROM autor ORDER BY nome";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Autor> autores = null;        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);            
            if(rs!=null){
                  autores = new ArrayList<Autor>();
                  while(rs.next()){
                      Autor autor = new Autor();
                      autor.setCodAutor(rs.getInt("codAutor"));
                      autor.setNome(rs.getString("nome"));
                      autor.setNacionalidade(rs.getString("nacionalidade"));
                      autores.add(autor);                    
                }
            }            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao consultar autor: "+ e);
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
        }return autores;
    }  

     public void alterarAutor(Autor autor) throws ExceptionMVC{
        String sql = "UPDATE autor SET nome=?, nacionalidade=? WHERE codAutor=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, autor.getNome());
            pStatement.setString(2, autor.getNacionalidade());
            pStatement.setInt(3, autor.getCodAutor());
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao alterar o autor: "+ e);
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
     
     public void excluirAutor(Autor autor) throws ExceptionMVC{         
        String sql = "DELETE FROM autor WHERE codAutor=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, autor.getCodAutor());            
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao excluir autor: "+ e);
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
