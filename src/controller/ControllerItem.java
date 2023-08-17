package controller;

import DAO.ExceptionMVC;
import java.util.ArrayList;
import model.Item;


public class ControllerItem {
    
    public boolean cadastrarItem(int codLivros, String tipo) throws ExceptionMVC{
        if(codLivros>0 && tipo != null){
        Item item = new Item(codLivros, tipo);
        item.cadastrarItem(item);
        return true;
        } else{
            return false;
        }
    }
    
    public ArrayList<Item> listarItens(String titulo) throws ExceptionMVC{
        return new Item().listarItens(titulo);
    }
    
    public boolean alterarItem(int codItem, int codLivros, String tipo) throws ExceptionMVC{
        if(codLivros>0 && tipo != null){
            Item item = new Item(codLivros, tipo);
            item.setCodItem(codItem);
            item.alterarItem(item);
            return true;
        } else{
            return false;
        }
    }
    public boolean excluirItem(int codItem) throws ExceptionMVC{
        if(codItem==0)
            return false;
        else{
            Item item = new Item();
            item.setCodItem(codItem);
            item.excluirItem(item);            
            return true;
        }
    }
}
