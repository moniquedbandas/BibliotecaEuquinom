package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;
import model.Livros;


public class ItemDAO {
    
     public void cadastrarItem(Item item) throws ExceptionMVC {
        String sql = "INSERT INTO item (codLivros, tipo) VALUE (?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getLivros().getCodLivros());
            pStatement.setString(2, item.getTipo());
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar item: "+ e);
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
     
     public ArrayList<Item> listarItens(String titulo) throws ExceptionMVC{
        String sql = "SELECT it.codItem, it.tipo , il.codLivros, il.titulo "
                + "FROM item it, livros il WHERE it.codLivros = il.codLivros AND "
                + " il.titulo like '%" + titulo + "%' ORDER BY il.titulo";
               
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Item> itemLista = null;        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs!=null){
                itemLista = new ArrayList<Item>();
                
                while(rs.next()){
                    Item item = new Item();
                    item.setCodItem(rs.getInt("codItem"));
                    item.setTipo(rs.getString("tipo"));
                    Livros livro = new Livros();
                    livro.setCodLivros(rs.getInt("codLivros"));
                    livro.setTitulo(rs.getString("titulo"));
                    item.setLivros(livro);
                    itemLista.add(item);                            
                }
            }            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao consultar item: "+ e);
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
        return itemLista;
    }
    
     public void alterarItem(Item item) throws ExceptionMVC{
        String sql = "UPDATE item SET codLivros=?, tipo=? WHERE codItem=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getLivros().getCodLivros());
            pStatement.setString(2, item.getTipo());
            pStatement.setInt(3, item.getCodItem());            
            pStatement.execute();       
                    
        }catch(SQLException e){
            throw new ExceptionMVC("Erro ao alterar item: " + e);
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
     
     public void excluirItem(Item item) throws ExceptionMVC {
        String sql = "DELETE FROM item WHERE codItem=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, item.getCodItem());            
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao excluir item: "+ e);
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
