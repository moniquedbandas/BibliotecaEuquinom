package model;

import DAO.ExceptionMVC;
import DAO.LivrosDAO;
import java.util.ArrayList;

public class Livros {
    private String titulo, autor, genero, sinopse;
    private int codLivros, nPaginas, ano;
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>();

    public Livros(){        
    }
    public Livros(String titulo, String autor, String genero, String sinopse, int nPaginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;   
        this.sinopse = sinopse;
        this.nPaginas = nPaginas;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }    
    public int getCodLivros() {
        return codLivros;
    }
    public void setCodLivros(int codLivros) {
        this.codLivros = codLivros;
    }
    public int getnPaginas() {
        return nPaginas;
    }
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void cadastrarLivros(Livros livros) throws ExceptionMVC{
        new LivrosDAO().cadastrarLivros(livros);
    }
    public ArrayList<Livros> listarLivros(String nome) throws ExceptionMVC{
        return new LivrosDAO().listarLivros(nome);
    }
    
    public void alterarLivros(Livros livros) throws ExceptionMVC{
        new LivrosDAO().alterarLivros(livros);
    }
    
    public void excluirLivros(Livros livros) throws ExceptionMVC{
        new LivrosDAO().excluirLivros(livros);
    }
    
}
