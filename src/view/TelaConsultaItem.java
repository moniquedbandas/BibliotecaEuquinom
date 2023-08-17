package view;

import controller.ControllerItem;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Item;

public class TelaConsultaItem extends javax.swing.JFrame {

    private JFrame telaCadastros;
    private Object telaOrigem;
   
    public void setTelaOrigem(Object telaOrigem) {
        this.telaOrigem = telaOrigem;
    }
    public TelaConsultaItem() {
        initComponents();
    }
    public TelaConsultaItem(JFrame telaCadastros){
        this.telaCadastros = telaCadastros;
        initComponents();        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelConsultaItem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tituloLivroItem = new javax.swing.JTextField();
        pesquisaItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaItem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de consulta de Itens");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabelConsultaItem.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabelConsultaItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsultaItem.setText("Consulta de item");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelConsultaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Titulo do livro: ");

        tituloLivroItem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tituloLivroItem.setToolTipText("Informe o titulo");

        pesquisaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        pesquisaItem.setContentAreaFilled(false);
        pesquisaItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaItemActionPerformed(evt);
            }
        });

        jTableConsultaItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Item", "Codigo Livro", "Titulo", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaItem);
        if (jTableConsultaItem.getColumnModel().getColumnCount() > 0) {
            jTableConsultaItem.getColumnModel().getColumn(0).setResizable(false);
            jTableConsultaItem.getColumnModel().getColumn(1).setResizable(false);
            jTableConsultaItem.getColumnModel().getColumn(2).setResizable(false);
            jTableConsultaItem.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloLivroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaItem)
                    .addComponent(tituloLivroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       this.dispose();       
    }//GEN-LAST:event_formWindowClosed

    private void pesquisaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaItemActionPerformed
        String titulo = tituloLivroItem.getText();
        
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaItem.getModel();
        tableModel.setRowCount(0);
        ControllerItem controllerItem = new ControllerItem();
        try {
            ArrayList<Item> itens = controllerItem.listarItens(titulo);
            itens.forEach((Item item) -> {
                tableModel.addRow(new Object[] {
                    item.getCodItem(),
                    item.getLivros().getCodLivros(),
                    item.getLivros().getTitulo(),
                    item.getTipo()
                });
            });
            jTableConsultaItem.setModel(tableModel);            
        } catch (Exception e) {
            Logger.getLogger(TelaConsultaItem.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_pesquisaItemActionPerformed

    private void jTableConsultaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaItemMouseClicked
        if(evt.getClickCount()==2){
            Integer codItem = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 0);
            Integer codLivros = (Integer) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 1);
            String titulo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 2);
            String tipo = (String) jTableConsultaItem.getModel().getValueAt(jTableConsultaItem.getSelectedRow(), 3);
            
            if (telaOrigem instanceof TelaEmprestimo) { // Verifica se a tela de origem é TelaEmprestimo
                TelaEmprestimo telaEmprestimo = (TelaEmprestimo) telaOrigem;
                telaEmprestimo.atualizarCamposItem(codItem, titulo);
                telaEmprestimo.setVisible(true);
            } else if (telaOrigem instanceof TelaCadastros) { // Verifica se a tela de origem é TelaCadastros
                TelaCadastros telaCadastrosItem = (TelaCadastros) telaOrigem;
                telaCadastrosItem.buscarItem(codItem, codLivros, titulo, tipo);                 
                telaCadastrosItem.selecionarGuia(3); // Seleciona a guia de itens no JTabbedPane
                telaCadastrosItem.setVisible(true);
                
            }
            this.dispose();
        }
    }//GEN-LAST:event_jTableConsultaItemMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelConsultaItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaItem;
    private javax.swing.JButton pesquisaItem;
    private javax.swing.JTextField tituloLivroItem;
    // End of variables declaration//GEN-END:variables
}
