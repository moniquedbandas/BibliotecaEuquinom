package model;

import java.util.ArrayList;

public class Item {
    private int codItem, codLivro;
    private String tipoMidia;
    private Livros livros;
    private Emprestimo emprestimo;
    
    public Item(int codItem, int codLivro, String tipoMidia) {
        this.codItem = codItem;
        this.codLivro = codLivro;
        this.tipoMidia = tipoMidia;
    }

    public int getCodItem() {
        return codItem;
    }
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }
    public int getCodLivro() {
        return codLivro;
    }
    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }
    public String getTipoMidia() {
        return tipoMidia;
    }
    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    
    
}
