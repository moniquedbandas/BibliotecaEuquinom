package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDAO {

   
     public void cadastrarCliente(Cliente cliente) throws ExceptionMVC {
        String sql = "INSERT INTO cliente (cpf, nome, telefone, endereco, email) VALUES (?,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getCpf());
            pStatement.setString(2, cliente.getNome());
            pStatement.setString(3, cliente.getTelefone());
            pStatement.setString(4, cliente.getEndereco());
            pStatement.setString(5, cliente.getEmail());
            //para datas é assim:
            //pStatement.setDate(5, new Date(cliente.getDtNascimento().getTime()));
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar cliente: "+ e);
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
     
     public void alterarCliente(Cliente cliente) throws ExceptionMVC {
        String sql = "UPDATE cliente SET cpf=?, nome=?, telefone=?, endereco=?, email=? WHERE codCliente=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getCpf());
            pStatement.setString(2, cliente.getNome());
            pStatement.setString(3, cliente.getTelefone());
            pStatement.setString(4, cliente.getEndereco());
            pStatement.setString(5, cliente.getEmail());
            pStatement.setInt(6, cliente.getCodCliente());
            //para datas é assim:
            //pStatement.setDate(5, new Date(cliente.getDtNascimento().getTime()));
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao alterar o cliente: "+ e);
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
     
     public void excluirCliente(Cliente cliente) throws ExceptionMVC{         
        String sql = "DELETE FROM cliente WHERE codCliente=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, cliente.getCodCliente());            
            pStatement.execute();
            
        } catch(SQLException e){
            throw new ExceptionMVC("Erro ao excluir cliente: " + e);
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

