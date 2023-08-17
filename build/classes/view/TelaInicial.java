
package view;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicio = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/imagens/bibi.png");
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }

        };
        BtCadastro = new javax.swing.JButton();
        BtPesquisa = new javax.swing.JButton();
        BtEmprestimo = new javax.swing.JButton();
        BtLogin = new javax.swing.JButton();
        labelTeste = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Euquinom");
        setResizable(false);

        BtCadastro.setBackground(new java.awt.Color(46, 201, 203));
        BtCadastro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtCadastro.setText("CADASTRO");
        BtCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastroActionPerformed(evt);
            }
        });

        BtPesquisa.setBackground(new java.awt.Color(46, 201, 203));
        BtPesquisa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtPesquisa.setText("PESQUISA");
        BtPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisaActionPerformed(evt);
            }
        });

        BtEmprestimo.setBackground(new java.awt.Color(46, 201, 203));
        BtEmprestimo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtEmprestimo.setText("EMPRESTIMO");
        BtEmprestimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEmprestimoActionPerformed(evt);
            }
        });

        BtLogin.setBackground(new java.awt.Color(46, 201, 203));
        BtLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtLogin.setText("LOGIN");
        BtLogin.setToolTipText("LOGIN");
        BtLogin.setBorder(null);
        BtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLoginActionPerformed(evt);
            }
        });

        labelTeste.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labelTeste.setForeground(new java.awt.Color(255, 255, 255));
        labelTeste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTeste.setText("SAIR");
        labelTeste.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelTeste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelTeste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTesteMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(BtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastroActionPerformed
        TelaCadastros telCad = new TelaCadastros();
        telCad.setVisible(true);
        telCad.setSize(500,500);
        telCad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtCadastroActionPerformed

    private void BtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisaActionPerformed
        TelaPesquisa telPe = new TelaPesquisa();
        telPe.setVisible(true);
        telPe.setSize(700,500);
        telPe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtPesquisaActionPerformed

    private void BtEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEmprestimoActionPerformed
        TelaEmprestimo telEmp = new TelaEmprestimo();
        telEmp.setVisible(true);
        telEmp.setSize(580,500);
        telEmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtEmprestimoActionPerformed

    private void BtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLoginActionPerformed
        TelaLogin telLog = new TelaLogin();
        telLog.setVisible(true);
        telLog.setSize(520,350);
        telLog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtLoginActionPerformed

    private void labelTesteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTesteMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelTesteMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastro;
    private javax.swing.JButton BtEmprestimo;
    private javax.swing.JButton BtLogin;
    private javax.swing.JButton BtPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JLabel labelTeste;
    // End of variables declaration//GEN-END:variables
}
