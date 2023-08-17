/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ExceptionMVC;
import controller.ControllerCliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class TelaConsultaCliente extends javax.swing.JFrame {
    private TelaEmprestimo telaEmprestimo;
    private TelaCadastros telaCadastros;
    private Object telaOrigem;
    
    public TelaConsultaCliente() {
        initComponents();
    }   
    public TelaConsultaCliente(TelaCadastros telaCadastros){
        this.telaCadastros = telaCadastros;
        initComponents();        
    }
    public TelaConsultaCliente(TelaEmprestimo telaEmprestimo){
        this.telaEmprestimo=telaEmprestimo;
        initComponents();
    }
    private int codCliente=0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelConsultaCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldConsultaCliente = new javax.swing.JTextField();
        consultarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaCliente = new javax.swing.JTable();
        editarCliente = new javax.swing.JButton();
        deletarCliente = new javax.swing.JButton();
        limparCliente = new javax.swing.JButton();
        sairCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de consulta de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabelConsultaCliente.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabelConsultaCliente.setText("Consultar cliente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabelConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConsultaCliente)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTextFieldConsultaCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldConsultaCliente.setToolTipText("Informe o nome do cliente");

        consultarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        consultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        consultarCliente.setText("Consultar");
        consultarCliente.setContentAreaFilled(false);
        consultarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliente(evt);
            }
        });

        jTableConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "CPF", "Nome", "Telefone", "Endereco", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsultaCliente);

        editarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editarCliente.setText("Editar");
        editarCliente.setContentAreaFilled(false);
        editarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        deletarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deletarCliente.setText("Deletar");
        deletarCliente.setContentAreaFilled(false);
        deletarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarClienteActionPerformed(evt);
            }
        });

        limparCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        limparCliente.setText("Limpar");
        limparCliente.setContentAreaFilled(false);
        limparCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparClienteActionPerformed(evt);
            }
        });

        sairCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sairCliente.setText("Sair");
        sairCliente.setContentAreaFilled(false);
        sairCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairCliente(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldConsultaCliente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limparCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(deletarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(limparCliente)
                        .addGap(40, 40, 40)
                        .addComponent(sairCliente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCliente
        String nome = jTextFieldConsultaCliente.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaCliente.getModel();
        tableModel.setRowCount(0);
        ControllerCliente controllerCliente = new ControllerCliente();
        try{
            ArrayList<Cliente> clientes = controllerCliente.listarCliente(nome);
            clientes.forEach((Cliente cliente) -> {tableModel.addRow(new Object[] {cliente.getCodCliente(),cliente.getCpf(),cliente.getNome(),
                                                                                   cliente.getTelefone(),cliente.getEndereco(),cliente.getEmail()});  
            });
            jTableConsultaCliente.setModel(tableModel);            
        }
        catch (ExceptionMVC e){
            Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_consultarCliente

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();
        //this.telaCadastros.setVisible(true);
    }//GEN-LAST:event_fecharJanela

    private void sairCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairCliente
        DefaultTableModel model = (DefaultTableModel) jTableConsultaCliente.getModel();
        int selectedRow = jTableConsultaCliente.getSelectedRow();
        
        if (selectedRow == -1) {            
        JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        Integer codCliente = (Integer) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 0);
        String cpf = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 1);
        String nome = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 2);
        String telefone = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 3);
        String endereco = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 4);
        String email = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(), 5);
        if (telaOrigem instanceof TelaCadastros) {
            TelaCadastros telaCadastros = (TelaCadastros) telaOrigem;
            telaCadastros.buscarCliente(codCliente, cpf, nome, telefone, endereco, email);
            telaCadastros.setVisible(true);
        } else if (telaOrigem instanceof TelaEmprestimo) {
            TelaEmprestimo telaEmprestimo = (TelaEmprestimo) telaOrigem;
            telaEmprestimo.atualizarCamposCliente(codCliente, nome);
            telaEmprestimo.setVisible(true);
        }
        this.dispose();
    }
    
    public void setTelaOrigem(Object telaOrigem) {
        this.telaOrigem = telaOrigem;
    }//GEN-LAST:event_sairCliente

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaCliente.getModel();
        int selectedRow = jTableConsultaCliente.getSelectedRow();
        boolean sucesso;
        if (selectedRow == -1) {            
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para editar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {    
            int codCliente = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String cpf = (String) model.getValueAt(selectedRow, 1);
            String nome = (String) model.getValueAt(selectedRow, 2);
            String telefone = (String) model.getValueAt(selectedRow, 3);
            String endereco = (String) model.getValueAt(selectedRow, 4);
            String email = (String) model.getValueAt(selectedRow, 5);
            
            ControllerCliente controllerCliente = new ControllerCliente();
            sucesso = controllerCliente.alterarCliente(codCliente, cpf, nome, telefone, endereco, email);
            if(sucesso){               
                model.setValueAt(cpf, selectedRow, 1);
                model.setValueAt(nome, selectedRow, 2);
                model.setValueAt(telefone, selectedRow, 3);
                model.setValueAt(endereco, selectedRow, 4);
                model.setValueAt(email, selectedRow, 5);
                
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                selectedRow = jTableConsultaCliente.getSelectedRow();
                
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro"+e);
        }
    }//GEN-LAST:event_editarClienteActionPerformed

    private void deletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarClienteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaCliente.getModel();
        int selectedRow = jTableConsultaCliente.getSelectedRow();
        boolean sucesso;
        if (selectedRow == -1) { 
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para deletar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return; 
        }
            try {
                int codCliente = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
                ControllerCliente controllerCliente = new ControllerCliente();
                sucesso = controllerCliente.excluirCliente(codCliente);
                if(sucesso){
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
                } else 
                    JOptionPane.showMessageDialog(null, "Erro ao excluir cliente.");
            } catch (ExceptionMVC e) {
                Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
            }
    }//GEN-LAST:event_deletarClienteActionPerformed

    private void limparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparClienteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaCliente.getModel();
        model.setRowCount(0);
        jTextFieldConsultaCliente.setText("");
    }//GEN-LAST:event_limparClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarCliente;
    private javax.swing.JButton deletarCliente;
    private javax.swing.JButton editarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsultaCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaCliente;
    private javax.swing.JTextField jTextFieldConsultaCliente;
    private javax.swing.JButton limparCliente;
    private javax.swing.JButton sairCliente;
    // End of variables declaration//GEN-END:variables
}
