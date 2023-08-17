package controller;

import DAO.ExceptionMVC;
import java.util.ArrayList;
import model.Autor;

public class ControllerAutor {
    
    public boolean cadastrarAutor(String nome, String nacionalidade) throws ExceptionMVC{
        if(nome !=null && nacionalidade != null){
            Autor autor = new Autor(nome, nacionalidade);
            autor.cadastrarAutor(autor);
            return true;
        }
        return false;
    }
    
    public ArrayList<Autor> listarAutores() throws ExceptionMVC{
        return new Autor().listarAutores();
    }
    
    public boolean alterarAutor(int codAutor, String nome, String nacionalidade) throws ExceptionMVC{
        if(nome !=null && nacionalidade != null){
            Autor autor = new Autor(nome, nacionalidade);
            autor.setCodAutor(codAutor);
            autor.alterarAutor(autor);
            return true;
        }
        return false;
    }
    
    public boolean excluirAutor(int codAutor) throws ExceptionMVC{
        if(codAutor==0)
            return false;
        else{
            Autor autor = new Autor();
            autor.setCodAutor(codAutor);
            autor.excluirAutor(autor);
            return true;
        }
    }
    
}
