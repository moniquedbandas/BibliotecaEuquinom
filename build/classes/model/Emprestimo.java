package model;

import java.util.ArrayList;

public class Emprestimo {
    private int codPedido, codItem, codCliente;
    private String dataLocacao, dataDevolucao;
    private Cliente cliente;
    private ArrayList<Item> itens = new ArrayList<>();

    public Emprestimo(int codPedido, int codItem, int codCliente, String dataLocacao, String dataDevolucao) {
        this.codPedido = codPedido;
        this.codItem = codItem;
        this.codCliente = codCliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodPedido() {
        return codPedido;
    }
    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
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
    public String getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
   
    
}
