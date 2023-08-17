package model;

import java.util.ArrayList;

public class Autor {
    private int codAutor;
    private String nome, nacionalidade;
    private ArrayList<Livros> livros = new ArrayList<>();

    public Autor(int codAutor, String nome, String nacionalidade) {
        this.codAutor = codAutor;
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
    
}
