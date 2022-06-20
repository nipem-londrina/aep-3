package br.com.sanity.view;

import br.com.sanity.connection.ConnectionFactory;
import java.awt.CardLayout;
import java.util.ArrayList;
import br.com.sanity.model.Usuario;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class HomeAdministrador extends javax.swing.JFrame {

    Usuario user;
    int usuariospag = 0;
    int usuariostotal;
    javax.swing.table.DefaultTableModel tableModel;

    public HomeAdministrador(Usuario user) {
        this.user = user;
        initComponents();
        mostrarTabelaUsuarios();
        mostrarGrafico();
        nomeAdmin.setText("Olá, " + this.user.getNome());
    }

    private void mostrarGrafico() {

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ansiedade", 10);
        dataset.setValue("Depressão", 20);
        dataset.setValue("Descontente", 5);
        dataset.setValue("Satisfeito", 18);
        dataset.setValue("Preocupado", 6);

        JFreeChart showPieChart = ChartFactory.createPieChart("Dashboard Sanity", dataset, true, true, false);

        javax.swing.JPanel panelshowPieChart = new ChartPanel(showPieChart);
        dashboard1.add(panelshowPieChart);
    }

    private void mostrarTabelaUsuarios() {
        tableModel = (javax.swing.table.DefaultTableModel) jTable2.getModel();

        //formata os caraio dos cabeçalho da tabela
        final javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer();
        renderer.setBorder(null);
        renderer.setBackground(java.awt.Color.decode("#333333"));
        renderer.setForeground(java.awt.Color.white);
        jTable2.getTableHeader().setDefaultRenderer(renderer);

        //redimensiona as colunas
        jTable2.setRowHeight(26);
        jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(2).setMinWidth(84);
        jTable2.getColumnModel().getColumn(2).setMaxWidth(84);
        jTable2.getColumnModel().getColumn(3).setMinWidth(75);
        jTable2.getColumnModel().getColumn(3).setMaxWidth(75);

        //renderiza a coluna de Editar
        jTable2.getColumnModel().getColumn(3).setCellRenderer(new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                javax.swing.JLabel l = (javax.swing.JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                l.setBackground(new java.awt.Color(255, 0, 66));
                l.setFont(new java.awt.Font("Century Gothic", 0, 12));
                l.setForeground(new java.awt.Color(255, 255, 255));
                l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
                l.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                return l;
            }
        });

        //reagir a clique
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                javax.swing.JTable selected = (javax.swing.JTable) e.getSource();
                if (selected.getSelectedColumn() == 3) {
                    new AlterarUsuario(user, (int) tableModel.getValueAt(selected.getSelectedRow(), 0)).setVisible(true);
                }
            }
        });

        //preencher tabela ao entrar
        usuariostotal = preencherTabela(user, 0, true, false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao = new javax.swing.JButton();
        panelRosa = new javax.swing.JPanel();
        logoSanity = new javax.swing.JLabel();
        nomeSanity = new javax.swing.JLabel();
        nomeAdmin = new javax.swing.JLabel();
        panelCinza = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonForms = new javax.swing.JButton();
        buttonEstatistica = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        usuarios = new javax.swing.JPanel();
        mainzinho = new javax.swing.JPanel();
        addUsuario = new javax.swing.JButton();
        nav = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        checkAdministrador = new javax.swing.JCheckBox();
        checkColaborador = new javax.swing.JCheckBox();
        btnPesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        estatisticas = new javax.swing.JPanel();
        dashboard1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        formularios = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        botao.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 251, 251));
        setMinimumSize(new java.awt.Dimension(1032, 599));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRosa.setBackground(new java.awt.Color(255, 0, 66));
        panelRosa.setMaximumSize(new java.awt.Dimension(1900, 1023));
        panelRosa.setPreferredSize(new java.awt.Dimension(1032, 40));
        panelRosa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/logoSanity.png"))); // NOI18N
        logoSanity.setToolTipText("");
        logoSanity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRosa.add(logoSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        nomeSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/iconSanity.png"))); // NOI18N
        nomeSanity.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nomeSanity.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nomeSanity.setVerifyInputWhenFocusTarget(false);
        panelRosa.add(nomeSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 30));

        nomeAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeAdmin.setForeground(new java.awt.Color(251, 251, 251));
        nomeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nomeAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/male_user_50px.png"))); // NOI18N
        nomeAdmin.setText("Olá, Admin");
        panelRosa.add(nomeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 820, 60));

        getContentPane().add(panelRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 60));

        panelCinza.setBackground(new java.awt.Color(51, 51, 51));
        panelCinza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(0, 0, 0));
        buttonHome.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(251, 251, 251));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/home_24px.png"))); // NOI18N
        buttonHome.setText("   Pagina Inicial");
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHome.setOpaque(true);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panelCinza.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 40));

        buttonForms.setBackground(new java.awt.Color(0, 0, 0));
        buttonForms.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonForms.setForeground(new java.awt.Color(251, 251, 251));
        buttonForms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/edit_property_24px.png"))); // NOI18N
        buttonForms.setText("   Formulários");
        buttonForms.setToolTipText("");
        buttonForms.setBorderPainted(false);
        buttonForms.setContentAreaFilled(false);
        buttonForms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonForms.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFormsActionPerformed(evt);
            }
        });
        panelCinza.add(buttonForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 40));

        buttonEstatistica.setBackground(new java.awt.Color(0, 0, 0));
        buttonEstatistica.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonEstatistica.setForeground(new java.awt.Color(251, 251, 251));
        buttonEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/account_24px.png"))); // NOI18N
        buttonEstatistica.setText("   Estatísticas");
        buttonEstatistica.setToolTipText("");
        buttonEstatistica.setBorderPainted(false);
        buttonEstatistica.setContentAreaFilled(false);
        buttonEstatistica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstatisticaActionPerformed(evt);
            }
        });
        panelCinza.add(buttonEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 40));

        getContentPane().add(panelCinza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 540));

        main.setLayout(new java.awt.CardLayout());

        usuarios.setBackground(new java.awt.Color(63, 63, 63));
        usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainzinho.setBackground(new java.awt.Color(51, 51, 51));
        mainzinho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUsuario.setBackground(new java.awt.Color(51, 51, 51));
        addUsuario.setForeground(new java.awt.Color(251, 251, 251));
        addUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/add_user_group_woman_man_24px.png"))); // NOI18N
        addUsuario.setText("Novo Usuario");
        addUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addUsuario.setContentAreaFilled(false);
        addUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUsuarioActionPerformed(evt);
            }
        });
        mainzinho.add(addUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        nav.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setBorder(null);

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowSelectionAllowed(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setForeground(new java.awt.Color(251, 251, 251));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/setinha_esquerda.png"))); // NOI18N
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAvancar.setBackground(new java.awt.Color(51, 51, 51));
        btnAvancar.setForeground(new java.awt.Color(251, 251, 251));
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/setinha.png"))); // NOI18N
        btnAvancar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAvancar.setContentAreaFilled(false);
        btnAvancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(navLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvancar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(btnAvancar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainzinho.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        checkAdministrador.setBackground(new java.awt.Color(51, 51, 51));
        checkAdministrador.setForeground(new java.awt.Color(251, 251, 251));
        checkAdministrador.setText("Administradores");
        checkAdministrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkAdministrador.setBorderPainted(true);
        checkAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdministradorActionPerformed(evt);
            }
        });
        mainzinho.add(checkAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        checkColaborador.setBackground(new java.awt.Color(51, 51, 51));
        checkColaborador.setForeground(new java.awt.Color(251, 251, 251));
        checkColaborador.setSelected(true);
        checkColaborador.setText("Colaboradores");
        checkColaborador.setToolTipText("");
        checkColaborador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkColaborador.setBorderPainted(true);
        checkColaborador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkColaboradorActionPerformed(evt);
            }
        });
        mainzinho.add(checkColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        btnPesquisar.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setForeground(new java.awt.Color(251, 251, 251));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/lupa17.png"))); // NOI18N
        btnPesquisar.setText(" Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        mainzinho.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 101, 19));

        usuarios.add(mainzinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 700, 390));

        jPanel1.setBackground(new java.awt.Color(255, 0, 66));

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 251, 251));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/search_26px.png"))); // NOI18N
        jLabel1.setText("Consultar Usuarios Cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        usuarios.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 700, -1));

        main.add(usuarios, "usuarios");

        estatisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard1.setLayout(new java.awt.BorderLayout());
        estatisticas.add(dashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 97, 607, 345));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        estatisticas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 607, 345));

        main.add(estatisticas, "estatisticas");

        jButton1.setText("adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formulariosLayout = new javax.swing.GroupLayout(formularios);
        formularios.setLayout(formulariosLayout);
        formulariosLayout.setHorizontalGroup(
            formulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formulariosLayout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(330, 330, 330))
        );
        formulariosLayout.setVerticalGroup(
            formulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formulariosLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton1)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        main.add(formularios, "formularios");

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstatisticaActionPerformed
        buttonHome.setOpaque(false);
        buttonForms.setOpaque(false);
        buttonEstatistica.setOpaque(true);
        CardLayout cards = (CardLayout) main.getLayout();
        cards.show(main, "estatisticas");
    }//GEN-LAST:event_buttonEstatisticaActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonHome.setOpaque(true);
        buttonForms.setOpaque(false);
        buttonEstatistica.setOpaque(false);
        CardLayout cards = (CardLayout) main.getLayout();
        cards.show(main, "usuarios");
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFormsActionPerformed
        buttonHome.setOpaque(false);
        buttonForms.setOpaque(true);
        buttonEstatistica.setOpaque(false);
        CardLayout cards = (CardLayout) main.getLayout();
        cards.show(main, "formularios");
    }//GEN-LAST:event_buttonFormsActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        usuariospag = 0;
        usuariostotal = preencherTabela(this.user, usuariospag, checkColaborador.isSelected(), checkAdministrador.isSelected());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void checkAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdministradorActionPerformed
        if (!checkColaborador.isSelected() && !checkAdministrador.isSelected()) {
            checkColaborador.setSelected(true);
        }
    }//GEN-LAST:event_checkAdministradorActionPerformed

    private void checkColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkColaboradorActionPerformed
        if (!checkColaborador.isSelected() && !checkAdministrador.isSelected()) {
            checkColaborador.setSelected(true);
        }
    }//GEN-LAST:event_checkColaboradorActionPerformed

    private void addUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUsuarioActionPerformed
        new br.com.sanity.view.CadastroUsuario(user).setVisible(true);
    }//GEN-LAST:event_addUsuarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (usuariospag <= 0) {
            return; //fazer nada se na primeira página
        }
        usuariospag--;
        usuariostotal = preencherTabela(user, usuariospag, checkColaborador.isSelected(), checkAdministrador.isSelected());
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        if (usuariospag >= usuariostotal / 10) {
            return; //fazer nada se na última página
        }
        usuariospag++;
        usuariostotal = preencherTabela(user, usuariospag, checkColaborador.isSelected(), checkAdministrador.isSelected());
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CadastroFormulario(user).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private int preencherTabela(Usuario user, int pagina, boolean c, boolean a) {
        //limpa tabela
        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            tableModel.removeRow(0);
        }

        //preenche a tabela
        ArrayList<Usuario> busca = ConnectionFactory.getDezColaboradores(user, pagina, c, a);
        for (int i = 0; i < busca.size(); i++) {
            tableModel.addRow(
                    new Object[]{
                        busca.get(i).getId(),
                        busca.get(i).getNome(),
                        busca.get(i).getCpf(),
                        "Editar"
                    }
            );
        }

        //busca e retorna a quantidade
        return ConnectionFactory.getTotalColaboradores(user, c, a);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUsuario;
    private javax.swing.JButton botao;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton buttonEstatistica;
    private javax.swing.JButton buttonForms;
    private javax.swing.JButton buttonHome;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkColaborador;
    private javax.swing.JPanel dashboard1;
    private javax.swing.JPanel estatisticas;
    private javax.swing.JPanel formularios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logoSanity;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainzinho;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel nomeAdmin;
    private javax.swing.JLabel nomeSanity;
    private javax.swing.JPanel panelCinza;
    private javax.swing.JPanel panelRosa;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
