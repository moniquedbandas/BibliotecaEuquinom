package controller;

import DAO.ExceptionMVC;
import java.util.ArrayList;
import model.Livros;

/**
 *
 * @author Monique
 */
public class ControllerLivros {
    
    public boolean cadastrarLivros(String titulo, ArrayList<String> autores, String genero, String sinopse, int nPaginas, int ano) throws Exception{
        if(titulo != null && !autores.isEmpty() && genero != null && sinopse != null  && nPaginas != 0 && ano >999 && ano<10000 ){
        Livros livros = new Livros(titulo, genero, sinopse, nPaginas, ano);
        livros.setAutores(autores);
        livros.cadastrarLivros(livros);
        return true;
    }
        return false;
    }
    
    public ArrayList<Livros> listarLivros(String nome) throws ExceptionMVC{
        return new Livros().listarLivros(nome);
    }
    
    public boolean alterarLivros(int codLivros, String titulo, String autor, String genero,String sinopse, int nPaginas, int ano) throws Exception{
        if(titulo != null && autor !=null && genero != null &&  sinopse != null  && nPaginas != 0 && ano != 0 ){
        Livros livros = new Livros(titulo, genero, sinopse, nPaginas, ano);
        livros.setCodLivros(codLivros);
        livros.alterarLivros(livros);
        return true;
    }
        return false;
    }
    
    public boolean excluirLivros(int codLivros) throws ExceptionMVC{
        if(codLivros==0)
            return false;
        else{
            Livros livros = new Livros();
            livros.setCodLivros(codLivros);
            livros.excluirLivros(livros);
            return true;
        }
    }
}
