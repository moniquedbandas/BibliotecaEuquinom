
package view;

import controller.ControllerEmprestimo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaEmprestimo extends javax.swing.JFrame {

    public TelaEmprestimo() {
        initComponents();
    }
    public void atualizarCamposCliente(int codCliente, String nome) {
        jTextFieldCodClienteEmp.setText(Integer.toString(codCliente));
        jTextFieldNomeClienteEmp.setText(nome);
    }
    public void atualizarCamposItem(int codItem, String titulo){
        jTextFieldCodLivroEmp.setText(String.valueOf(codItem));
        jTextFieldTituloEmpr.setText(titulo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloEmp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cadastrarEmp = new javax.swing.JButton();
        jButtonBotaoLimparEmp = new javax.swing.JButton();
        jButtonBotaoSairEmp = new javax.swing.JButton();
        jPanelClienteEmprestimo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodClienteEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeClienteEmp = new javax.swing.JTextField();
        pesqClienteEmp = new javax.swing.JButton();
        jPanelLivroEmprestimo = new javax.swing.JPanel();
        jLabelCodLivEmp = new javax.swing.JLabel();
        jTextFieldCodLivroEmp = new javax.swing.JTextField();
        jLabelTituloEmpr = new javax.swing.JLabel();
        jTextFieldTituloEmpr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pesqItemEmp = new javax.swing.JButton();
        jFormattedTextFieldDataEmp = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmprestimo = new javax.swing.JTable();
        salvarTabelaEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTituloEmp.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabelTituloEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloEmp.setText("Área de empréstimo");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        cadastrarEmp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cadastrarEmp.setText("Cadastrar");
        cadastrarEmp.setContentAreaFilled(false);
        cadastrarEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEmpActionPerformed(evt);
            }
        });

        jButtonBotaoLimparEmp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoLimparEmp.setText("Limpar");
        jButtonBotaoLimparEmp.setContentAreaFilled(false);
        jButtonBotaoLimparEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoLimparEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoLimparEmpActionPerformed(evt);
            }
        });

        jButtonBotaoSairEmp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSairEmp.setText("Sair");
        jButtonBotaoSairEmp.setContentAreaFilled(false);
        jButtonBotaoSairEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoSairEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoSairEmpActionPerformed(evt);
            }
        });

        jPanelClienteEmprestimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("CodCliente:");

        jTextFieldCodClienteEmp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldCodClienteEmp.setToolTipText("Informe o codigo do cliente");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jTextFieldNomeClienteEmp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNomeClienteEmp.setToolTipText("Informe o nome do cliente");

        pesqClienteEmp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pesqClienteEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        pesqClienteEmp.setToolTipText("Pesquisar");
        pesqClienteEmp.setContentAreaFilled(false);
        pesqClienteEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pesqClienteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqClienteEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteEmprestimoLayout = new javax.swing.GroupLayout(jPanelClienteEmprestimo);
        jPanelClienteEmprestimo.setLayout(jPanelClienteEmprestimoLayout);
        jPanelClienteEmprestimoLayout.setHorizontalGroup(
            jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanelClienteEmprestimoLayout.createSequentialGroup()
                        .addComponent(jTextFieldCodClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesqClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClienteEmprestimoLayout.setVerticalGroup(
            jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteEmprestimoLayout.createSequentialGroup()
                .addGroup(jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanelClienteEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesqClienteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelLivroEmprestimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Livro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jLabelCodLivEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelCodLivEmp.setText("Codigo Item:");

        jTextFieldCodLivroEmp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldCodLivroEmp.setToolTipText("Informe o codigo do livro");

        jLabelTituloEmpr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelTituloEmpr.setText("Titulo:");

        jTextFieldTituloEmpr.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloEmpr.setToolTipText("Informe o titulo do livro");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Data emprestimo:");

        pesqItemEmp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pesqItemEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        pesqItemEmp.setToolTipText("Pesquisar");
        pesqItemEmp.setContentAreaFilled(false);
        pesqItemEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pesqItemEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqItemEmpActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataEmp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelLivroEmprestimoLayout = new javax.swing.GroupLayout(jPanelLivroEmprestimo);
        jPanelLivroEmprestimo.setLayout(jPanelLivroEmprestimoLayout);
        jPanelLivroEmprestimoLayout.setHorizontalGroup(
            jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodLivEmp)
                    .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                        .addComponent(jTextFieldCodLivroEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesqItemEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTituloEmpr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloEmpr))
                .addGap(46, 46, 46)
                .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanelLivroEmprestimoLayout.setVerticalGroup(
            jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                            .addComponent(jLabelCodLivEmp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelLivroEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pesqItemEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldCodLivroEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)))
                    .addGroup(jPanelLivroEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloEmpr)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldTituloEmpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTableEmprestimo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodCliente", "Nome", "CodItem", "Titulo", "Data Empresimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmprestimo);

        salvarTabelaEmprestimo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        salvarTabelaEmprestimo.setText("Salvar");
        salvarTabelaEmprestimo.setContentAreaFilled(false);
        salvarTabelaEmprestimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarTabelaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarTabelaEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanelLivroEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelClienteEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelTituloEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(cadastrarEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBotaoLimparEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBotaoSairEmp)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(salvarTabelaEmprestimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelClienteEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarTabelaEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarEmp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBotaoLimparEmp)
                        .addComponent(jButtonBotaoSairEmp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBotaoSairEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoSairEmpActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonBotaoSairEmpActionPerformed

    private void jButtonBotaoLimparEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoLimparEmpActionPerformed
       jTextFieldCodClienteEmp.setText("");
       jTextFieldNomeClienteEmp.setText("");
       jTextFieldCodLivroEmp.setText("");
       jTextFieldTituloEmpr.setText("");
       jFormattedTextFieldDataEmp.setText("");      
    }//GEN-LAST:event_jButtonBotaoLimparEmpActionPerformed

    private void pesqClienteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqClienteEmpActionPerformed

        TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente();
        telaConsultaCliente.setTelaOrigem(this); // Passar a instância da tela de empréstimo
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_pesqClienteEmpActionPerformed

    private void pesqItemEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqItemEmpActionPerformed
        TelaConsultaItem telaConsultaItem = new TelaConsultaItem();
        telaConsultaItem.setTelaOrigem(this); // Passar a instância da tela de empréstimo
        telaConsultaItem.setVisible(true);
    }//GEN-LAST:event_pesqItemEmpActionPerformed

    private void cadastrarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEmpActionPerformed
        boolean sucesso;        
        int codItem = Integer.parseInt(jTextFieldCodLivroEmp.getText());
        int codCliente = Integer.parseInt(jTextFieldCodClienteEmp.getText());
        String dataEmprestimo = jFormattedTextFieldDataEmp.getText();
        try {
            ControllerEmprestimo controllerEmprestimo = new ControllerEmprestimo();
            sucesso= controllerEmprestimo.cadastrarEmprestimo(codItem, codCliente, dataEmprestimo);
        if(sucesso==true){
            JOptionPane.showMessageDialog(null, "Emprestimo cadastrado com sucesso!");
            }            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro"+e);                  
        }
    }//GEN-LAST:event_cadastrarEmpActionPerformed

    private void salvarTabelaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarTabelaEmprestimoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableEmprestimo.getModel();
        Integer codCliente = Integer.parseInt(jTextFieldCodClienteEmp.getText());
        String nomeCliente = jTextFieldNomeClienteEmp.getText();
        Integer codItem = Integer.parseInt(jTextFieldCodLivroEmp.getText());
        String tituloItem = jTextFieldTituloEmpr.getText();
        String dataEmprestimo = jFormattedTextFieldDataEmp.getText();
        model.addRow(new Object[] { codCliente, nomeCliente, codItem, tituloItem, dataEmprestimo });
    }//GEN-LAST:event_salvarTabelaEmprestimoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarEmp;
    private javax.swing.JButton jButtonBotaoLimparEmp;
    private javax.swing.JButton jButtonBotaoSairEmp;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodLivEmp;
    private javax.swing.JLabel jLabelTituloEmp;
    private javax.swing.JLabel jLabelTituloEmpr;
    private javax.swing.JPanel jPanelClienteEmprestimo;
    private javax.swing.JPanel jPanelLivroEmprestimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmprestimo;
    private javax.swing.JTextField jTextFieldCodClienteEmp;
    private javax.swing.JTextField jTextFieldCodLivroEmp;
    private javax.swing.JTextField jTextFieldNomeClienteEmp;
    private javax.swing.JTextField jTextFieldTituloEmpr;
    private javax.swing.JButton pesqClienteEmp;
    private javax.swing.JButton pesqItemEmp;
    private javax.swing.JButton salvarTabelaEmprestimo;
    // End of variables declaration//GEN-END:variables
}
