package view;
import DAO.UsuarioDAO;
import controller.ControllerUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitLogin = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        SENHA = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        limparLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sairLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área de login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabelTitLogin.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabelTitLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitLogin.setText("Welcome!!");

        USUARIO.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        USUARIO.setText("USUARIO: ");

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldUsuario.setToolTipText("Informe o usuario");

        SENHA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SENHA.setText("SENHA:");

        LOGIN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(0, 51, 102));
        LOGIN.setText("Login");
        LOGIN.setContentAreaFilled(false);
        LOGIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPasswordFieldSenha.setToolTipText("Informe a senha");

        limparLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        limparLogin.setForeground(new java.awt.Color(0, 51, 102));
        limparLogin.setText("Limpar");
        limparLogin.setToolTipText("");
        limparLogin.setContentAreaFilled(false);
        limparLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        sairLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sairLogin.setForeground(new java.awt.Color(0, 51, 102));
        sairLogin.setText("Sair");
        sairLogin.setContentAreaFilled(false);
        sairLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(LOGIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(USUARIO)
                            .addComponent(SENHA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelTitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USUARIO)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SENHA)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LOGIN)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limparLogin)
                        .addComponent(sairLogin)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
         try{
            String nome, senha;
            nome= jTextFieldUsuario.getText();
            senha=jPasswordFieldSenha.getText();

            ControllerUsuario controllerUsuario = new ControllerUsuario();
            if (controllerUsuario.autenticarUsuario(nome, senha)){
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalida.");
            }
        
        } catch(Exception e){            
            JOptionPane.showMessageDialog(null, "FML" + e);
        }
        
    }//GEN-LAST:event_LOGINActionPerformed

    private void limparLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparLoginActionPerformed
       jTextFieldUsuario.setText("");
       jPasswordFieldSenha.setText("");
    }//GEN-LAST:event_limparLoginActionPerformed

    private void sairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairLoginActionPerformed
        dispose();
    }//GEN-LAST:event_sairLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
private void Logar(){
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel SENHA;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JButton limparLogin;
    private javax.swing.JButton sairLogin;
    // End of variables declaration//GEN-END:variables
}
