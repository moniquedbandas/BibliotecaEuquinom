package model;

import DAO.ExceptionMVC;
import DAO.ItemDAO;
import java.util.ArrayList;

public class Item {
    private int codItem;
    private String tipo;
    private Livros livros;
    private Emprestimo emprestimo;
    

    public Item() {
    }
    
    public Item(int codLivros, String tipo) {     
        this.tipo = tipo;
        Livros livros = new Livros();
        livros.setCodLivros(codLivros);
        this.livros = livros;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    public int getCodItem() {
        return codItem;
    }
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }
   
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cadastrarItem(Item item) throws ExceptionMVC{
        new ItemDAO().cadastrarItem(item);
    }
    public ArrayList<Item> listarItens(String titulo) throws ExceptionMVC{
        return new ItemDAO().listarItens(titulo);
    }
    public void alterarItem(Item item) throws ExceptionMVC{
        new ItemDAO().alterarItem(item);
    }
    public void excluirItem(Item item) throws ExceptionMVC{
        new ItemDAO().excluirItem(item);
    }
}
