package controller;
import DAO.ExceptionMVC;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Monique
 */
public class ControllerCliente {
    
    public boolean cadastrarCliente (String cpf, String nome, String telefone, String endereco, String email) throws ExceptionMVC{
        if(validarCPF(cpf) && nome !=null  && telefone !=null && telefone.length()>13 && endereco !=null && email != null){
        Cliente cliente = new Cliente(cpf, nome, telefone, endereco, email);
        cliente.cadastrarCliente(cliente);
        return true;
        }
        return false;
    }
    
    public ArrayList<Cliente> listarCliente(String nome) throws ExceptionMVC{
        return new Cliente().listarCliente(nome);
    }
    
    public boolean validarCPF(String cpf){
        for(int i=0;i<cpf.length();i++){
            if(! Character.isDigit(cpf.charAt(i))){
                if(!( i==3||i==7||i==11)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean alterarCliente (int codCliente, String cpf, String nome, String telefone, String endereco, String email) throws ExceptionMVC{
        if(validarCPF(cpf) && nome !=null  && telefone !=null && telefone.length()>13 && endereco !=null && email != null){
        Cliente cliente = new Cliente(cpf, nome, telefone, endereco, email);
        cliente.setCodCliente(codCliente);
        cliente.alterarCliente(cliente);
        return true;
        }
        return false;
    }
    
    public boolean excluirCliente(int codCliente) throws ExceptionMVC{
        if(codCliente==0)
            return false;
        else{
            Cliente cliente = new Cliente();
            cliente.setCodCliente(codCliente);
            cliente.excluirCliente(cliente);
            return true;
        }
    }
}
