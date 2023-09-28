package view;
import DAO.ExceptionMVC;
import controller.ControllerLivros;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Livros;

public class TelaConsultaLivros extends javax.swing.JFrame {

    private JFrame telaCadastros;
     
    public TelaConsultaLivros() {
        initComponents();
    }
    public TelaConsultaLivros(JFrame telaCadastros){
        this.telaCadastros = telaCadastros;
        initComponents();
        
    }
    private int codLivros=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAreaPesquisa = new javax.swing.JLabel();
        jLabelLogoPes = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        consultarLivros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        editarLivros = new javax.swing.JButton();
        deletarLivros = new javax.swing.JButton();
        sairLivros = new javax.swing.JButton();
        limparLivros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de consulta de livros");
        setResizable(false);

        jLabelAreaPesquisa.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabelAreaPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAreaPesquisa.setText("Consultar livros");

        jLabelLogoPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        jTextFieldPesquisa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldPesquisa.setToolTipText("Informe o nome do livro");

        consultarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        consultarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        consultarLivros.setText("Consultar");
        consultarLivros.setContentAreaFilled(false);
        consultarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLivros(evt);
            }
        });

        jTablePesquisa.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Sinopse", "Nº Paginas", "Ano"
            }
        ));
        jTablePesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePesquisa.getTableHeader().setReorderingAllowed(false);
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);
        if (jTablePesquisa.getColumnModel().getColumnCount() > 0) {
            jTablePesquisa.getColumnModel().getColumn(0).setResizable(false);
            jTablePesquisa.getColumnModel().getColumn(1).setResizable(false);
            jTablePesquisa.getColumnModel().getColumn(2).setResizable(false);
            jTablePesquisa.getColumnModel().getColumn(3).setResizable(false);
            jTablePesquisa.getColumnModel().getColumn(4).setResizable(false);
            jTablePesquisa.getColumnModel().getColumn(5).setResizable(false);
        }

        editarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        editarLivros.setText("Editar");
        editarLivros.setContentAreaFilled(false);
        editarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLivrosActionPerformed(evt);
            }
        });

        deletarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deletarLivros.setText("Deletar");
        deletarLivros.setContentAreaFilled(false);
        deletarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarLivrosActionPerformed(evt);
            }
        });

        sairLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sairLivros.setText("Sair");
        sairLivros.setContentAreaFilled(false);
        sairLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sairLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairLivrosActionPerformed(evt);
            }
        });

        limparLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        limparLivros.setText("Limpar");
        limparLivros.setContentAreaFilled(false);
        limparLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextFieldPesquisa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 155, Short.MAX_VALUE)
                        .addComponent(jLabelAreaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editarLivros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletarLivros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparLivros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairLivros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultarLivros)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAreaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarLivros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletarLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limparLivros)
                        .addGap(65, 65, 65)
                        .addComponent(sairLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarLivros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarLivros
        String nome = jTextFieldPesquisa.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTablePesquisa.getModel();
        tableModel.setRowCount(0);
        ControllerLivros controllerLivros = new ControllerLivros();
        try{
            ArrayList<Livros> livros =  controllerLivros.listarLivros(nome);
            livros.forEach((Livros livro) -> {tableModel.addRow
        (new Object[]{livro.getCodLivros(),livro.getTitulo(),livro.getGenero(),
                      livro.getSinopse(),livro.getnPaginas(),livro.getAno()});                    
            });
            jTablePesquisa.setModel(tableModel);
        }catch (ExceptionMVC e){
            Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_consultarLivros

    private void sairLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairLivrosActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTablePesquisa.getModel();
        int selectedRow = jTablePesquisa.getSelectedRow();
        
        if (selectedRow == -1) {            
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {    
            int codLivros = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String titulo = (String) model.getValueAt(selectedRow, 1);
            //String autor = (String) model.getValueAt(selectedRow, 2);
            String genero = (String) model.getValueAt(selectedRow, 2);            
            String sinopse = (String) model.getValueAt(selectedRow, 3);
            int nPaginas = Integer.parseInt(model.getValueAt(selectedRow, 4).toString());
            int ano = Integer.parseInt(model.getValueAt(selectedRow, 5).toString());
           
            int selectedTabIndex = ((TelaCadastros) telaCadastros).getJTabbedPaneCadastro().getSelectedIndex();
        if (selectedTabIndex == 1) { // Guia 'Livros'
            TelaCadastros telaCadastros = (TelaCadastros) this.telaCadastros;
            telaCadastros.buscarLivros(codLivros, titulo, genero, sinopse, nPaginas, ano);
            telaCadastros.setVisible(true);
        } else if (selectedTabIndex == 3) { // Guia 'Itens'
            TelaCadastros telaCadastrosItens = (TelaCadastros) this.telaCadastros;
            telaCadastrosItens.buscarLivrosItem(codLivros, titulo);
            telaCadastrosItens.selecionarGuia(3); // Índice da guia 'Itens'
            telaCadastrosItens.setVisible(true);
        }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_sairLivrosActionPerformed

    private void limparLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparLivrosActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTablePesquisa.getModel();
        model.setRowCount(0);
        jTextFieldPesquisa.setText("");
    }//GEN-LAST:event_limparLivrosActionPerformed

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        /*if(evt.getClickCount()==2){
            Integer codLivros = (Integer) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 0);
            String titulo = (String) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 1);
            String autor = (String) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 2);
            String genero = (String) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 3);
            String tipo = (String) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 4);
            String sinopse = (String) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 5);
            Integer nPaginas = (Integer) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 6);
            Integer ano = (Integer) jTablePesquisa.getModel().getValueAt(jTablePesquisa.getSelectedRow(), 7);
            
            this.telaCadastros.buscarLivros(codLivros, titulo, autor, genero, tipo, sinopse, nPaginas, ano);
            this.telaCadastros.setVisible(true);
            this.dispose();
        
            //esse aqui nao esta funcionando pq a tabela nao pode ser Editavel, mas eu quero que ela seja editavel
            //para quando eu for dar update nos dados.
        }*/
    }//GEN-LAST:event_jTablePesquisaMouseClicked

    private void editarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLivrosActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTablePesquisa.getModel();
        int selectedRow = jTablePesquisa.getSelectedRow();
        boolean sucesso;
        
        if (selectedRow == -1) {            
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para editar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {    
            int codLivros = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String titulo = (String) model.getValueAt(selectedRow, 1);            
            String genero = (String) model.getValueAt(selectedRow, 2);            
            String sinopse = (String) model.getValueAt(selectedRow, 3);
            int nPaginas = Integer.parseInt(model.getValueAt(selectedRow, 4).toString());
            int ano = Integer.parseInt(model.getValueAt(selectedRow, 5).toString());
            ControllerLivros controllerLivros = new ControllerLivros();
            sucesso = controllerLivros.alterarLivros(codLivros,titulo, genero, sinopse, nPaginas, ano);
            if(sucesso){               
                model.setValueAt(titulo, selectedRow, 1);                
                model.setValueAt(genero, selectedRow, 2);                
                model.setValueAt(sinopse, selectedRow, 3);
                model.setValueAt(String.valueOf(nPaginas), selectedRow, 4);
                model.setValueAt(String.valueOf(ano), selectedRow, 5);
                JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
                
                selectedRow = jTablePesquisa.getSelectedRow();
                
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro"+e);
        }
        
    }//GEN-LAST:event_editarLivrosActionPerformed

    private void deletarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarLivrosActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTablePesquisa.getModel();
        int selectedRow = jTablePesquisa.getSelectedRow();
        boolean sucesso;
        if (selectedRow == -1) { 
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para deletar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return; 
        }
            try {
                int codLivros = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
                ControllerLivros controllerLivros = new ControllerLivros();
                sucesso = controllerLivros.excluirLivros(codLivros);
                if(sucesso){
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!");
                } else 
                    JOptionPane.showMessageDialog(null, "Erro ao excluir livro");
            } catch (ExceptionMVC e) {
                Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, e);
            }
        
    }//GEN-LAST:event_deletarLivrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarLivros;
    private javax.swing.JButton deletarLivros;
    private javax.swing.JButton editarLivros;
    private javax.swing.JLabel jLabelAreaPesquisa;
    private javax.swing.JLabel jLabelLogoPes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JButton limparLivros;
    private javax.swing.JButton sairLivros;
    // End of variables declaration//GEN-END:variables
}
