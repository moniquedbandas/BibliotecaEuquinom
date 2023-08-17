package controller;

import model.Emprestimo;

public class ControllerEmprestimo {
    
    public boolean cadastrarEmprestimo(int codItem, int codCliente, String dataEmprestimo) throws Exception{
        if(codItem!=0 && codCliente!=0 && dataEmprestimo!=null){
        Emprestimo emprestimo = new Emprestimo(codItem, codCliente, dataEmprestimo);
        emprestimo.cadastrarEmprestimo(emprestimo);
        return true;
    }
        return false;
    }
}
