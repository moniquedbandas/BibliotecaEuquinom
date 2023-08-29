package model;

import DAO.ClienteDAO;
import DAO.EmprestimoDAO;
import DAO.ExceptionMVC;
import DAO.ItemDAO;
import java.util.ArrayList;

public class Emprestimo {
    private int  codItem, codCliente;
    private String dataEmprestimo;
    private Cliente cliente;
    private ArrayList<Item> itens = new ArrayList<>();

    public Emprestimo() {
    }
    
    public Emprestimo(int codItem, int codCliente, String dataEmprestimo) {        
        this.codItem = codItem;
        this.codCliente = codCliente;
        this.dataEmprestimo = dataEmprestimo;        
    }

   

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<Cliente> listarCliente(String nome) throws ExceptionMVC{
        return new ClienteDAO().listarCliente(nome);
    }
    public ArrayList<Item> listarItens(String titulo) throws ExceptionMVC{
        return new ItemDAO().listarItens(titulo);
    }
    
//    public void cadastrarEmprestimo(Emprestimo emprestimo) throws ExceptionMVC{
//        new EmprestimoDAO().cadastrarEmprestimo(emprestimo);
//    }
    public boolean cadastrarEmprestimo() throws ExceptionMVC {
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        try {
            emprestimoDAO.cadastrarEmprestimo(this);
            return true;
        } catch (ExceptionMVC e) {
            System.err.println("Erro ao cadastrar empréstimo: " + e);
            return false;
        }
    }
}
