
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Emprestimo;
import model.Item;
import model.Livros;

public class EmprestimoDAO {
    
    public ArrayList<Cliente> listarCliente(String nome) throws ExceptionMVC{
        String sql = "SELECT * FROM cliente WHERE nome like '%" +nome+ "%' ORDER BY nome ";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Cliente> clientes = null;   
         
         try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);            
            if(rs!=null){
                  clientes = new ArrayList<Cliente>();
                  while(rs.next()){
                      Cliente cliente = new Cliente();
                      cliente.setCodCliente(rs.getInt("codCliente"));
                      cliente.setCpf(rs.getString("cpf"));
                      cliente.setNome(rs.getString("nome"));
                      cliente.setTelefone(rs.getString("telefone"));
                      cliente.setEndereco(rs.getString("endereco"));
                      cliente.setEmail(rs.getString("email"));
                      clientes.add(cliente);                                         
                }
            }
         } catch(SQLException e){
            throw new ExceptionMVC("Erro ao consultar cliente: "+ e);
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
        }return clientes;
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
    
     public void cadastrarEmprestimo(Emprestimo emprestimo) throws ExceptionMVC {
        String sql = "INSERT INTO emprestimo (codItem, codCliente, dataEmprestimo ) VALUE (?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, emprestimo.getCodItem());
            pStatement.setInt(2, emprestimo.getCodCliente());
            pStatement.setString(3, emprestimo.getDataEmprestimo());
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar emprestimo: "+ e);
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
