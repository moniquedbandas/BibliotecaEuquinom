package model;
import DAO.ExceptionMVC;
import DAO.AutorDAO;
import java.util.ArrayList;

public class Autor {
    private int codAutor;
    private String nome, nacionalidade;
    private ArrayList<Livros> livros = new ArrayList<>();

    public Autor(){};
    
    public Autor(String nome, String nacionalidade) {       
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public int getCodAutor() {
        return codAutor;
    }
    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void cadastrarAutor(Autor autor) throws ExceptionMVC{
        new AutorDAO().cadastrarAutor(autor);
    }
    
    public ArrayList<Autor> listarAutores() throws ExceptionMVC{
        return new AutorDAO().listarAutores();
    }
    @Override
    public String toString() {
        return this.getNome();
    }
    public void alterarAutor(Autor autor) throws ExceptionMVC{
        new AutorDAO().alterarAutor(autor);
    }
    
    public void excluirAutor(Autor autor) throws ExceptionMVC{
        new AutorDAO().excluirAutor(autor);
    }

}
