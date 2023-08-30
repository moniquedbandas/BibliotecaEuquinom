package controller;

import DAO.EmprestimoDAO;
import java.awt.List;
import java.util.ArrayList;
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
    
    public boolean cadastrarTabelaEmprestimo(ArrayList<Emprestimo> emprestimos) {
        try {
            EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
            for (Emprestimo emprestimo : emprestimos) {
                boolean sucesso = cadastrarEmprestimo(
                    emprestimo.getCodItem(),
                    emprestimo.getCodCliente(),
                    emprestimo.getDataEmprestimo()
                );
                if (!sucesso) {                    
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
}
