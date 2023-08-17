package view;

/**
 *
 * @author Monique
 */
public class TelaCadastros extends javax.swing.JFrame {

    public TelaCadastros() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelAreaCad = new javax.swing.JLabel();
        jLabelLogoCad = new javax.swing.JLabel();
        jTabbedPaneCadastro = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabelNomeAutor = new javax.swing.JLabel();
        jLabelNacionalidade = new javax.swing.JLabel();
        jTextFieldNomeAutor = new javax.swing.JTextField();
        jComboBoxNacionalidade = new javax.swing.JComboBox<>();
        jButtonBotaoLimparAutor = new javax.swing.JButton();
        jButtonBotaoSalvarAutor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jLabelnPgs = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jLabelSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jTextFieldNpgs = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jButtonBotaoLimparLivros = new javax.swing.JButton();
        jButtonBotaoSalvarLivros = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonBotaoLimparCliente = new javax.swing.JButton();
        jButtonBotaoSalvarCliente = new javax.swing.JButton();
        jButtonBotaoSairCadastro = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de Cadastro");
        setResizable(false);

        jLabelAreaCad.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabelAreaCad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAreaCad.setText("Área de cadastros");

        jLabelLogoCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        jTabbedPaneCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPaneCadastro.setMaximumSize(new java.awt.Dimension(503, 500));
        jTabbedPaneCadastro.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabelNomeAutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeAutor.setText("Nome:");

        jLabelNacionalidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNacionalidade.setText("Nacionalidade: ");

        jTextFieldNomeAutor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldNomeAutor.setToolTipText("Informe o nome do autor");

        jComboBoxNacionalidade.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBoxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma nacionalidade", "Americano", "Brasileiro", "Italiano", "Espanhol", "Frances", "Mexicano", "Argentino", "Sul-Africano", "Chines", "Japones", "Sul coreano", "Russo", "Indiano", "Alemao" }));

        jButtonBotaoLimparAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoLimparAutor.setText("Limpar");
        jButtonBotaoLimparAutor.setContentAreaFilled(false);
        jButtonBotaoLimparAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoLimparAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoLimparAutorActionPerformed(evt);
            }
        });

        jButtonBotaoSalvarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarAutor.setText("Salvar");
        jButtonBotaoSalvarAutor.setContentAreaFilled(false);
        jButtonBotaoSalvarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNacionalidade)
                    .addComponent(jLabelNomeAutor)
                    .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButtonBotaoLimparAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBotaoSalvarAutor)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNacionalidade)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBotaoLimparAutor)
                    .addComponent(jButtonBotaoSalvarAutor))
                .addContainerGap())
        );

        jTabbedPaneCadastro.addTab("AUTOR", jPanel3);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitulo.setText("Titulo:");
        jLabelTitulo.setToolTipText("");

        jLabelAutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAutor.setText("Autor:");

        jLabelGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGenero.setText("Genero:");

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldTitulo.setToolTipText("Informe o titulo");

        jTextFieldAutor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldAutor.setToolTipText("Informe o autor");

        jTextFieldGenero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldGenero.setToolTipText("Informe o genero");

        jLabelnPgs.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelnPgs.setText("Nro Paginas:");

        jLabelAno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAno.setText("Ano:");

        jLabelSinopse.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSinopse.setText("Sinopse:");

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextAreaSinopse.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSinopse);

        jTextFieldNpgs.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldAno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButtonBotaoLimparLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoLimparLivros.setText("Limpar");
        jButtonBotaoLimparLivros.setContentAreaFilled(false);
        jButtonBotaoLimparLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoLimparLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoLimparLivrosActionPerformed(evt);
            }
        });

        jButtonBotaoSalvarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarLivros.setText("Salvar");
        jButtonBotaoSalvarLivros.setContentAreaFilled(false);
        jButtonBotaoSalvarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelAutor)
                    .addComponent(jLabelSinopse)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jTextFieldTitulo)
                    .addComponent(jTextFieldGenero)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBotaoLimparLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBotaoSalvarLivros))
                    .addComponent(jTextFieldNpgs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnPgs)
                    .addComponent(jLabelAno)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelnPgs))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNpgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(jLabelAno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelGenero)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSinopse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBotaoLimparLivros)
                        .addComponent(jButtonBotaoSalvarLivros)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPaneCadastro.addTab("LIVROS", jPanel1);

        jLabelNomeCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeCliente.setText("Nome completo:");
        jLabelNomeCliente.setToolTipText("");

        jLabelCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCPF.setText("CPF:");

        jLabelTelefone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jTextFieldNomeCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldNomeCliente.setToolTipText("Informe o nome do cliente");
        jTextFieldNomeCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldCPF.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldCPF.setToolTipText("Informe o CPF do cliente");

        jTextFieldTelefone.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldTelefone.setToolTipText("Informe o telefone");

        jLabelEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldEmail.setToolTipText("Informe o e-mail");

        jLabelEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEndereco.setText("Endereco:");
        jLabelEndereco.setToolTipText("");

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldEndereco.setToolTipText("Informe o endereco do cliente");

        jButtonBotaoLimparCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoLimparCliente.setText("Limpar");
        jButtonBotaoLimparCliente.setContentAreaFilled(false);
        jButtonBotaoLimparCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoLimparClienteActionPerformed(evt);
            }
        });

        jButtonBotaoSalvarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarCliente.setText("Salvar");
        jButtonBotaoSalvarCliente.setContentAreaFilled(false);
        jButtonBotaoSalvarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(jLabelNomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNomeCliente))
                            .addComponent(jLabelTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCPF)
                            .addComponent(jTextFieldCPF)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEndereco)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButtonBotaoLimparCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBotaoSalvarCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCliente)
                    .addComponent(jLabelCPF))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBotaoLimparCliente)
                    .addComponent(jButtonBotaoSalvarCliente))
                .addContainerGap())
        );

        jTabbedPaneCadastro.addTab("CLIENTE", jPanel4);

        jButtonBotaoSairCadastro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSairCadastro.setText("Sair");
        jButtonBotaoSairCadastro.setContentAreaFilled(false);
        jButtonBotaoSairCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBotaoSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoSairCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTabbedPaneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAreaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabelLogoCad))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButtonBotaoSairCadastro)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogoCad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAreaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBotaoSairCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBotaoLimparAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoLimparAutorActionPerformed
        jTextFieldNomeAutor.setText("");
        jComboBoxNacionalidade.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonBotaoLimparAutorActionPerformed

    private void jButtonBotaoLimparLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoLimparLivrosActionPerformed
        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldGenero.setText("");
        jTextAreaSinopse.setText("");
        jTextFieldNpgs.setText("");
        jTextFieldAno.setText("");
    }//GEN-LAST:event_jButtonBotaoLimparLivrosActionPerformed

    private void jButtonBotaoLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoLimparClienteActionPerformed
        jTextFieldNomeCliente.setText("");
        jTextFieldCPF.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");        
        jTextFieldEndereco.setText("");
    }//GEN-LAST:event_jButtonBotaoLimparClienteActionPerformed

    private void jButtonBotaoSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoSairCadastroActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonBotaoSairCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBotaoLimparAutor;
    private javax.swing.JButton jButtonBotaoLimparCliente;
    private javax.swing.JButton jButtonBotaoLimparLivros;
    private javax.swing.JButton jButtonBotaoSairCadastro;
    private javax.swing.JButton jButtonBotaoSalvarAutor;
    private javax.swing.JButton jButtonBotaoSalvarCliente;
    private javax.swing.JButton jButtonBotaoSalvarLivros;
    private javax.swing.JComboBox<String> jComboBoxNacionalidade;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelAreaCad;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLogoCad;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNomeAutor;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelSinopse;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelnPgs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneCadastro;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNomeAutor;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNpgs;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
