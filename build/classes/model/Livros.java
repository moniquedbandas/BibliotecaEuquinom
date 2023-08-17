package model;

import java.util.ArrayList;

public class Livros {
    private String titulo, autor, genero, sinopse;
    private int codLivro, nPaginas, ano;
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>();

    public Livros(String titulo, String autor, String genero, String sinopse, int codLivro, int nPaginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.codLivro = codLivro;
        this.nPaginas = nPaginas;
        this.ano = ano;
    }
    
    public int getCodLivro() {
        return codLivro;
    }
    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
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

    
    
}
