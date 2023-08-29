package controller;

import DAO.EmprestimoDAO;
import DAO.ExceptionMVC;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Emprestimo;


public class ControllerEmprestimo {
    
//    public boolean cadastrarEmprestimo(int codItem, int codCliente, String dataEmprestimo) throws Exception{
//       System.out.println("Cadastrando empréstimo: codItem=" + codItem + ", codCliente=" + codCliente);
//        if(codItem!=0 && codCliente!=0 && dataEmprestimo!=null){
//        Emprestimo emprestimo = new Emprestimo(codItem, codCliente, dataEmprestimo);
//        emprestimo.cadastrarEmprestimo(emprestimo);
//        return true;
//    }
//        return false;
//    }
    public boolean cadastrarEmprestimo(int codItem, int codCliente, String dataEmprestimo) {
        System.out.println("Cadastrando empréstimo: codItem=" + codItem + ", codCliente=" + codCliente);
        if (codItem != 0 && codCliente != 0 && dataEmprestimo != null) {
            try {
                Emprestimo emprestimo = new Emprestimo(codItem, codCliente, dataEmprestimo);
                return emprestimo.cadastrarEmprestimo();
            } catch (ExceptionMVC e) {
                System.err.println("Erro ao cadastrar empréstimo: " + e);
            }
        } else {
            System.err.println("Dados inválidos para cadastro de empréstimo.");
        }
        return false;
    }
    
    public boolean cadastrarTabelaEmprestimo(ArrayList<Emprestimo> emprestimos) {
        try {
            EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
            for (Emprestimo emprestimo : emprestimos) {
//                boolean sucesso = cadastrarEmprestimo(
//                    emprestimo.getCodItem(),
//                    emprestimo.getCodCliente(),
//                    emprestimo.getDataEmprestimo()
//                );
//                if (!sucesso) {       
//                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar empréstimo: " + emprestimo);
//                    return false;
//                }
//            }
//            return true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao cadastrar tabela com os dados do empréstimo: " + e);
//            return false;
            emprestimoDAO.cadastrarEmprestimo(emprestimo); // Chama o método diretamente
            }
            JOptionPane.showMessageDialog(null, "Empréstimos cadastrados com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar empréstimos: " + e);
            return false;
        }
    }
}