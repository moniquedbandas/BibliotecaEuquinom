package view;

import DAO.ExceptionMVC;
import controller.ControllerAutor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Autor;

/**
 *
 * @author Monique
 */
public class TelaConsultaAutor extends javax.swing.JFrame {

    private TelaCadastros telaCadastros;
    
    public TelaConsultaAutor() {
        initComponents();
    }
    
    public TelaConsultaAutor(TelaCadastros telaCadastros){
        this.telaCadastros=telaCadastros;
        initComponents();
    }
    private int codAutor = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelConsultaAutor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaAutor = new javax.swing.JTable();
        jTextFieldConsultaAutor = new javax.swing.JTextField();
        consultarAutor = new javax.swing.JButton();
        editarAutor = new javax.swing.JButton();
        deletarAutor = new javax.swing.JButton();
        limparAutor = new javax.swing.JButton();
        sairAutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de consulta de autor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        jLabelConsultaAutor.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabelConsultaAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelConsultaAutor.setText("Consultar autor");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabelConsultaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelConsultaAutor)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTableConsultaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsultaAutor);

        jTextFieldConsultaAutor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldConsultaAutor.setToolTipText("Informe o nome do autor");

        consultarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        consultarAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        consultarAutor.setText("Consultar");
        consultarAutor.setContentAreaFilled(false);
        consultarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAtor(evt);
            }
        });

        editarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editarAutor.setText("Editar");
        editarAutor.setContentAreaFilled(false);
        editarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAutorActionPerformed(evt);
            }
        });

        deletarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deletarAutor.setText("Deletar");
        deletarAutor.setContentAreaFilled(false);
        deletarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarAutorActionPerformed(evt);
            }
        });

        limparAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        limparAutor.setText("Limpar");
        limparAutor.setContentAreaFilled(false);
        limparAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparAutorActionPerformed(evt);
            }
        });

        sairAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sairAutor.setText("Sair");
        sairAutor.setContentAreaFilled(false);
        sairAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sairAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairConsultaAutor(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextFieldConsultaAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultarAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletarAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limparAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sairAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConsultaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarAutor))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(deletarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(limparAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairAutor)))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAtor
        String nome = jTextFieldConsultaAutor.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaAutor.getModel();
        tableModel.setRowCount(0);
        ControllerAutor controllerAutor = new ControllerAutor();
        try{
            ArrayList<Autor> autores = controllerAutor.listarAutores();
            autores.forEach((Autor autor) -> {tableModel.addRow(new Object[] {autor.getCodAutor(),autor.getNome(),autor.getNacionalidade()});  
            });
            jTableConsultaAutor.setModel(tableModel);            
        }
        catch (ExceptionMVC e){
            Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_consultarAtor

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
//        this.dispose();
//        this.telaCadastros.setVisible(true);
        
    }//GEN-LAST:event_fecharJanela

    private void SairConsultaAutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairConsultaAutor
        DefaultTableModel model = (DefaultTableModel) jTableConsultaAutor.getModel();

        int selectedRow = jTableConsultaAutor.getSelectedRow();
        if (selectedRow == -1) {            
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
        Integer codAutor = (Integer) jTableConsultaAutor.getModel().getValueAt(jTableConsultaAutor.getSelectedRow(), 0);
        String nome = (String) jTableConsultaAutor.getModel().getValueAt(jTableConsultaAutor.getSelectedRow(), 1);
        String nacionalidade = (String) jTableConsultaAutor.getModel().getValueAt(jTableConsultaAutor.getSelectedRow(), 2);
        
        this.telaCadastros.buscarAutor(codAutor, nome, nacionalidade);
        this.telaCadastros.setVisible(true);
        
        this.dispose();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_SairConsultaAutor

    private void editarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAutorActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaAutor.getModel();
        int selectedRow = jTableConsultaAutor.getSelectedRow();
        boolean sucesso;
        if (selectedRow == -1) {            
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para editar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {    
            int codAutor = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String nome = (String) model.getValueAt(selectedRow, 1);
            String nacionalidade = (String) model.getValueAt(selectedRow, 2);
            
            ControllerAutor controllerAutor = new ControllerAutor();
            sucesso = controllerAutor.alterarAutor(codAutor, nome, nacionalidade);
            if(sucesso){               
                model.setValueAt(nome, selectedRow, 1);
                model.setValueAt(nacionalidade, selectedRow, 2);
                
                JOptionPane.showMessageDialog(null, "Autor alterado com sucesso!");
                selectedRow = jTableConsultaAutor.getSelectedRow();
                
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro"+e);
        }
    }//GEN-LAST:event_editarAutorActionPerformed

    private void deletarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarAutorActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaAutor.getModel();
        int selectedRow = jTableConsultaAutor.getSelectedRow();
        boolean sucesso;
        if (selectedRow == -1) { 
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para deletar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return; 
        }
            try {
                int codAutor = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
                ControllerAutor controllerAutor = new ControllerAutor();
                sucesso = controllerAutor.excluirAutor(codAutor);
                if(sucesso){
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Autor excluido com sucesso!");
                } else 
                    JOptionPane.showMessageDialog(null, "Erro ao excluir autor");
            } catch (ExceptionMVC e) {
                Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
            }
    }//GEN-LAST:event_deletarAutorActionPerformed

    private void limparAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparAutorActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableConsultaAutor.getModel();
        model.setRowCount(0);
        jTextFieldConsultaAutor.setText("");
    }//GEN-LAST:event_limparAutorActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarAutor;
    private javax.swing.JButton deletarAutor;
    private javax.swing.JButton editarAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsultaAutor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaAutor;
    private javax.swing.JTextField jTextFieldConsultaAutor;
    private javax.swing.JButton limparAutor;
    private javax.swing.JButton sairAutor;
    // End of variables declaration//GEN-END:variables
}
