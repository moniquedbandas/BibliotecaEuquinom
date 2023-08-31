package view;

import DAO.AutorDAO;
import DAO.ExceptionMVC;
import controller.ControllerAutor;
import controller.ControllerCliente;
import controller.ControllerItem;
import controller.ControllerLivros;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Autor;
import model.Livros;

public class TelaCadastros extends javax.swing.JFrame {
    private Livros livros;
    
    public TelaCadastros() {
        initComponents(); 
        livros = new Livros();
        //jTabbedPaneCadastro.setEnabledAt(3, false);
    }    
    private int codLivros=0;
    private int codAutor=0;
    private int codCliente=0;
    private int codItem=0;
    public JTable getJTableNomeAutor() {
        return jTableNomeAutor;
    }
    
    public void selecionarGuia(int index) {
        if (jTabbedPaneCadastro != null && index >= 0 && index < jTabbedPaneCadastro.getTabCount()) {
            jTabbedPaneCadastro.setSelectedIndex(index);
        }
    }
    public void buscarLivrosItem(int codLivros, String titulo){
        this.codLivros = codLivros;
        this.jTextFieldTituloItens.setText(titulo);
    }
    public void buscarLivros(int codLivros, String titulo, String autor, String genero, String sinopse, int nPaginas, int ano){
        this.codLivros = codLivros;
        this.jTextFieldTitulo.setText(titulo);        
        this.jComboBoxAutor.getModel().setSelectedItem(autor);
        this.jTextFieldGenero.setText(genero);
        this.jTextAreaSinopse.setText(sinopse);
        this.jTextFieldNpgs.setText(Integer.toString(nPaginas));
        this.jTextFieldAno.setText(Integer.toString(ano));
    }
    public void buscarAutor(int codAutor, String nome, String nacionalidade){
       this.codAutor=codAutor;
       this.jTextFieldNomeAutor.setText(nome);
       this.jComboBoxNacionalidade.getModel().setSelectedItem((nacionalidade));
   }
    public void buscarCliente(int codCliente, String cpf, String nome, String telefone, String endereco, String email){
         this.codCliente=codCliente;
         this.jFormattedTextFieldCPF.setText(cpf);
         this.jTextFieldNomeCliente.setText(nome);
         this.jFormattedTextFieldTelefone.setText(telefone);
         this.jTextFieldEndereco.setText(endereco);
         this.jTextFieldEmail.setText(email);
     }
    public void buscarItem(int codItem, int codLivros, String titulo, String tipo) {
        this.codItem = codItem;
        this.codLivros = codLivros;
        this.jTextFieldTituloItens.setText(titulo);
//        for(int contador=0;contador<jComboBoxItens.getItemCount();contador++){
//            if(jComboBoxItens.getItemAt(contador).equals(tipo))jComboBoxItens.setSelectedIndex(contador);
//        }
        this.jComboBoxItens.getModel().setSelectedItem(tipo);
        this.jComboBoxItens.setSelectedItem(tipo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelAreaCad = new javax.swing.JLabel();
        jLabelLogoCad = new javax.swing.JLabel();
        jTabbedPaneCadastro = new javax.swing.JTabbedPane();
        painelAutor = new javax.swing.JPanel();
        jLabelNomeAutor = new javax.swing.JLabel();
        jLabelNacionalidade = new javax.swing.JLabel();
        jTextFieldNomeAutor = new javax.swing.JTextField();
        jComboBoxNacionalidade = new javax.swing.JComboBox<>();
        jButtonBotaoLimparAutor = new javax.swing.JButton();
        jButtonBotaoSalvarAutor = new javax.swing.JButton();
        jButtonConsultarAutor = new javax.swing.JButton();
        painelLivros = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
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
        jComboBoxAutor = new javax.swing.JComboBox();
        consultarLivros = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNomeAutor = new javax.swing.JTable();
        addAutor = new javax.swing.JButton();
        painelCliente = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonBotaoLimparCliente = new javax.swing.JButton();
        jButtonBotaoSalvarCliente = new javax.swing.JButton();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonConsultaCliente = new javax.swing.JButton();
        painelItens = new javax.swing.JPanel();
        salvarItens = new javax.swing.JButton();
        limparItens = new javax.swing.JButton();
        consultarItens = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTituloItens = new javax.swing.JTextField();
        jComboBoxItens = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        consultaItens = new javax.swing.JButton();
        deletarItem = new javax.swing.JButton();
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
        jComboBoxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma nacionalidade", "Americano", "Britanico", "Brasileiro", "Italiano", "Espanhol", "Frances", "Mexicano", "Argentino", "Sul-Africano", "Chines", "Japones", "Sul coreano", "Russo", "Indiano", "Alemao" }));

        jButtonBotaoLimparAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoLimparAutor.setText("Limpar");
        jButtonBotaoLimparAutor.setContentAreaFilled(false);
        jButtonBotaoLimparAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoLimparAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparAutor(evt);
            }
        });

        jButtonBotaoSalvarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarAutor.setText("Salvar");
        jButtonBotaoSalvarAutor.setContentAreaFilled(false);
        jButtonBotaoSalvarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoSalvarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarAutor(evt);
            }
        });

        jButtonConsultarAutor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonConsultarAutor.setText("Consultar");
        jButtonConsultarAutor.setContentAreaFilled(false);
        jButtonConsultarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConsultarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAutor(evt);
            }
        });

        javax.swing.GroupLayout painelAutorLayout = new javax.swing.GroupLayout(painelAutor);
        painelAutor.setLayout(painelAutorLayout);
        painelAutorLayout.setHorizontalGroup(
            painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAutorLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAutorLayout.createSequentialGroup()
                        .addGroup(painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNacionalidade)
                                .addComponent(jLabelNomeAutor)
                                .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelAutorLayout.createSequentialGroup()
                                .addComponent(jButtonBotaoLimparAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBotaoSalvarAutor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultarAutor))
                    .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        painelAutorLayout.setVerticalGroup(
            painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutorLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelNomeAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNacionalidade)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(painelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBotaoLimparAutor)
                    .addComponent(jButtonBotaoSalvarAutor)
                    .addComponent(jButtonConsultarAutor))
                .addGap(25, 25, 25))
        );

        jTabbedPaneCadastro.addTab("AUTOR", painelAutor);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitulo.setText("Titulo:");
        jLabelTitulo.setToolTipText("");

        jLabelAutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAutor.setText("Autor:");

        jLabelGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGenero.setText("Genero:");

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldTitulo.setToolTipText("Informe o titulo");
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

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
        jButtonBotaoLimparLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoLimparLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparLivros(evt);
            }
        });

        jButtonBotaoSalvarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarLivros.setText("Salvar");
        jButtonBotaoSalvarLivros.setContentAreaFilled(false);
        jButtonBotaoSalvarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoSalvarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarLivros(evt);
            }
        });

        jComboBoxAutor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxAutor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxAutorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        consultarLivros.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        consultarLivros.setText("Consultar");
        consultarLivros.setContentAreaFilled(false);
        consultarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLivros(evt);
            }
        });

        jTableNomeAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableNomeAutor);

        addAutor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        addAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoAdd.png"))); // NOI18N
        addAutor.setBorderPainted(false);
        addAutor.setContentAreaFilled(false);
        addAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLivrosLayout = new javax.swing.GroupLayout(painelLivros);
        painelLivros.setLayout(painelLivrosLayout);
        painelLivrosLayout.setHorizontalGroup(
            painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelGenero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabelSinopse)
                    .addGroup(painelLivrosLayout.createSequentialGroup()
                        .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnPgs)
                            .addComponent(jTextFieldNpgs, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLivrosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelAno))
                            .addGroup(painelLivrosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14)
                .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLivrosLayout.createSequentialGroup()
                        .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addAutor))
                    .addGroup(painelLivrosLayout.createSequentialGroup()
                        .addComponent(jButtonBotaoLimparLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBotaoSalvarLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultarLivros)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        painelLivrosLayout.setVerticalGroup(
            painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLivrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLivrosLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGenero)
                        .addGap(13, 13, 13)
                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSinopse)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLivrosLayout.createSequentialGroup()
                        .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLivrosLayout.createSequentialGroup()
                                .addComponent(jLabelAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAno)
                    .addComponent(jLabelnPgs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldNpgs, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBotaoLimparLivros)
                        .addComponent(jButtonBotaoSalvarLivros)
                        .addComponent(consultarLivros))
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPaneCadastro.addTab("LIVROS", painelLivros);

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
        jButtonBotaoLimparCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCliente(evt);
            }
        });

        jButtonBotaoSalvarCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSalvarCliente.setText("Salvar");
        jButtonBotaoSalvarCliente.setContentAreaFilled(false);
        jButtonBotaoSalvarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCliente(evt);
            }
        });

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setToolTipText("Informe o CPF");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setToolTipText("Informe o telefone");

        jButtonConsultaCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonConsultaCliente.setText("Consultar");
        jButtonConsultaCliente.setContentAreaFilled(false);
        jButtonConsultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliente(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelClienteLayout.createSequentialGroup()
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEndereco)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(313, 313, 313))
                        .addGroup(painelClienteLayout.createSequentialGroup()
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNomeCliente)
                                .addComponent(jTextFieldNomeCliente)
                                .addComponent(jLabelTelefone)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCPF)
                                .addComponent(jLabelEmail)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(90, 90, 90)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                        .addComponent(jButtonBotaoLimparCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBotaoSalvarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultaCliente)
                        .addGap(184, 184, 184))))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCliente)
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addComponent(jLabelCPF)
                        .addGap(2, 2, 2)
                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBotaoLimparCliente)
                    .addComponent(jButtonBotaoSalvarCliente)
                    .addComponent(jButtonConsultaCliente))
                .addGap(18, 18, 18))
        );

        jTabbedPaneCadastro.addTab("CLIENTE", painelCliente);

        painelItens.setName("ITENS"); // NOI18N

        salvarItens.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        salvarItens.setText("Salvar");
        salvarItens.setContentAreaFilled(false);
        salvarItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salvarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarItensActionPerformed(evt);
            }
        });

        limparItens.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        limparItens.setText("Limpar");
        limparItens.setContentAreaFilled(false);
        limparItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limparItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparItensActionPerformed(evt);
            }
        });

        consultarItens.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        consultarItens.setText("Consultar");
        consultarItens.setContentAreaFilled(false);
        consultarItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarItensActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Titulo: ");

        jTextFieldTituloItens.setToolTipText("Informe o titulo do livro");

        jComboBoxItens.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxItens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo", "Livro", "HQ", "Manga", "Dicionario" }));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Tipo: ");

        consultaItens.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        consultaItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        consultaItens.setToolTipText("Consultar");
        consultaItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaItensActionPerformed(evt);
            }
        });

        deletarItem.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deletarItem.setText("Deletar");
        deletarItem.setContentAreaFilled(false);
        deletarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelItensLayout = new javax.swing.GroupLayout(painelItens);
        painelItens.setLayout(painelItensLayout);
        painelItensLayout.setHorizontalGroup(
            painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItensLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItensLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTituloItens, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultaItens, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelItensLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItensLayout.createSequentialGroup()
                                .addComponent(limparItens)
                                .addGap(18, 18, 18)
                                .addComponent(salvarItens)
                                .addGap(18, 18, 18)
                                .addComponent(deletarItem)
                                .addGap(18, 18, 18)
                                .addComponent(consultarItens))
                            .addComponent(jComboBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        painelItensLayout.setVerticalGroup(
            painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItensLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTituloItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaItens))
                .addGap(18, 18, 18)
                .addGroup(painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(painelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarItens)
                    .addComponent(limparItens)
                    .addComponent(consultarItens)
                    .addComponent(deletarItem))
                .addGap(21, 21, 21))
        );

        jTabbedPaneCadastro.addTab("ITENS", painelItens);

        jButtonBotaoSairCadastro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonBotaoSairCadastro.setText("Sair");
        jButtonBotaoSairCadastro.setContentAreaFilled(false);
        jButtonBotaoSairCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBotaoSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairCadastro(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jButtonBotaoSairCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabelAreaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabelLogoCad))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPaneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogoCad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAreaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonBotaoSairCadastro)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparAutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparAutor
        jTextFieldNomeAutor.setText("");
        jComboBoxNacionalidade.setSelectedIndex(0);
    }//GEN-LAST:event_limparAutor

    private void limparCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCliente
        jTextFieldNomeCliente.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");        
        jTextFieldEndereco.setText("");        
    }//GEN-LAST:event_limparCliente

    private void botaoSairCadastro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairCadastro
        dispose();
    }//GEN-LAST:event_botaoSairCadastro

    private void salvarAutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarAutor
        String nome = jTextFieldNomeAutor.getText();
        String nacionalidade = jComboBoxNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            ControllerAutor controllerAutor = new ControllerAutor();
            sucesso = controllerAutor.cadastrarAutor(nome, nacionalidade);
            if(sucesso==true){
                JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso.");
                this.limparAutor(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Campos não foram preenchidos corretamente.");              
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_salvarAutor

    private void salvarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCliente
        boolean sucesso;
        
        try{
            ControllerCliente controllerCliente = new ControllerCliente();
            sucesso = controllerCliente.cadastrarCliente(jFormattedTextFieldCPF.getText(), jTextFieldNomeCliente.getText(), jFormattedTextFieldTelefone.getText(), jTextFieldEndereco.getText(), jTextFieldEmail.getText());
            if(sucesso==true){
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                this.limparCliente(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Campos não foram preenchidos corretamente.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_salvarCliente

    private void consultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCliente
        TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente();
        telaConsultaCliente.setTelaOrigem(this); // Passar a instância da tela de cadastros
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_consultarCliente

    private void salvarLivros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarLivros
        int nPaginas = Integer.parseInt(jTextFieldNpgs.getText().toString());
        int ano = Integer.parseInt(jTextFieldAno.getText().toString());                    
        boolean sucesso;

        try{
            ControllerLivros controllerLivros = new ControllerLivros();
            DefaultTableModel modelAutor = (DefaultTableModel) jTableNomeAutor.getModel();
            ArrayList<String> autores = new ArrayList<>();
            for (int i = 0; i < modelAutor.getRowCount(); i++) {
            String autor = (String) modelAutor.getValueAt(i, 0);
            autores.add(autor);
            } 
            sucesso = controllerLivros.cadastrarLivros(jTextFieldTitulo.getText(), autores, jTextFieldGenero.getText(),jTextAreaSinopse.getText(), nPaginas, ano);
            if(sucesso==true){
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                this.limparLivros(evt);
           
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro" +e);
        }
    }//GEN-LAST:event_salvarLivros

    private void limparLivros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparLivros
        jTextFieldTitulo.setText("");
        jComboBoxAutor.setSelectedIndex(0);
        jTextFieldGenero.setText("");
        jTextAreaSinopse.setText("");
        jTextFieldNpgs.setText("");
        jTextFieldAno.setText("");        
    }//GEN-LAST:event_limparLivros

    private void consultarAutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAutor
        TelaConsultaAutor telaConsultaAtor = new TelaConsultaAutor(this);
        this.setVisible(false);
        telaConsultaAtor.setVisible(true);
    }//GEN-LAST:event_consultarAutor

    private void consultarLivros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarLivros
        TelaConsultaLivros telaConsultaLivros = new TelaConsultaLivros((JFrame) this);
        this.setVisible(false);
        telaConsultaLivros.setVisible(true);
    }//GEN-LAST:event_consultarLivros

    private void jComboBoxAutorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxAutorAncestorAdded
        AutorDAO dao = new AutorDAO();        
        ArrayList<Autor> listaAutores = null;
        try {
            listaAutores = dao.listarAutores();
        } catch (ExceptionMVC ex) {
            Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBoxAutor.removeAll();//remove todos os itens do combobox
        for(Autor a : listaAutores) //para cada item da lista, monte um obj do tipo autor
            jComboBoxAutor.addItem(a);
    }//GEN-LAST:event_jComboBoxAutorAncestorAdded

    private void limparItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparItensActionPerformed
        jTextFieldTituloItens.setText("");
        jComboBoxItens.setSelectedIndex(0);
        this.codItem=0;
        this.codLivros=0;
    }//GEN-LAST:event_limparItensActionPerformed

    private void consultaItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaItensActionPerformed
        TelaConsultaLivros telaConsultaLivros = new TelaConsultaLivros((JFrame) this);
        this.setVisible(false);
        telaConsultaLivros.setVisible(true);
        
        Object telaOrigem = null;
        if (telaOrigem instanceof TelaEmprestimo){
        TelaConsultaItem telaConsultaItem = new TelaConsultaItem();
        telaConsultaItem.setTelaOrigem(this); // Passar a instância da tela de cadastros
        telaConsultaItem.setVisible(true);}
    }//GEN-LAST:event_consultaItensActionPerformed

    private void salvarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarItensActionPerformed
        boolean sucesso;
        try {
            ControllerItem controllerItem = new ControllerItem();
            if(this.codItem==0)
            sucesso = controllerItem.cadastrarItem(this.codLivros, jComboBoxItens.getSelectedItem().toString());
            else{
                sucesso = controllerItem.alterarItem(this.codItem, this.codLivros, jComboBoxItens.getSelectedItem().toString());
                this.codItem=0;
            }if(sucesso){
                JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso!");
            } else
                JOptionPane.showMessageDialog(null, "Item nao foi cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_salvarItensActionPerformed

    private void consultarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarItensActionPerformed
        TelaConsultaItem telaConsultaItem = new TelaConsultaItem((JFrame) this);
        telaConsultaItem.setTelaOrigem(this);
        telaConsultaItem.setVisible(true);
    }//GEN-LAST:event_consultarItensActionPerformed

    private void deletarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarItemActionPerformed
        ControllerItem controllerItem = new ControllerItem();
        
        try {
            if (controllerItem.excluirItem(codItem)){
                JOptionPane.showMessageDialog(null, "O item foi excluido com sucesso");
                this.limparItensActionPerformed(evt);
                this.codItem=0;
                this.codLivros=0;//esses dois codigos precisam ser zerados para n dar conflitos no futuro
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_deletarItemActionPerformed

    private void addAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAutorActionPerformed
        DefaultTableModel modelAutor = (DefaultTableModel) jTableNomeAutor.getModel();
        String autor = jComboBoxAutor.getSelectedItem().toString();
        modelAutor.addRow(new Object[]{autor});
        livros.adicionarAutores(autor);
    }//GEN-LAST:event_addAutorActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAutor;
    private javax.swing.JButton consultaItens;
    private javax.swing.JButton consultarItens;
    private javax.swing.JButton consultarLivros;
    private javax.swing.JButton deletarItem;
    private javax.swing.JButton jButtonBotaoLimparAutor;
    private javax.swing.JButton jButtonBotaoLimparCliente;
    private javax.swing.JButton jButtonBotaoLimparLivros;
    private javax.swing.JButton jButtonBotaoSairCadastro;
    private javax.swing.JButton jButtonBotaoSalvarAutor;
    private javax.swing.JButton jButtonBotaoSalvarCliente;
    private javax.swing.JButton jButtonBotaoSalvarLivros;
    private javax.swing.JButton jButtonConsultaCliente;
    private javax.swing.JButton jButtonConsultarAutor;
    private javax.swing.JComboBox jComboBoxAutor;
    private javax.swing.JComboBox<String> jComboBoxItens;
    private javax.swing.JComboBox<String> jComboBoxNacionalidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneCadastro;
    private javax.swing.JTable jTableNomeAutor;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNomeAutor;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNpgs;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldTituloItens;
    private javax.swing.JButton limparItens;
    private javax.swing.JPanel painelAutor;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JPanel painelItens;
    private javax.swing.JPanel painelLivros;
    private javax.swing.JButton salvarItens;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTabbedPane getJTabbedPaneCadastro() {
        return jTabbedPaneCadastro;
    }
 

    
}
