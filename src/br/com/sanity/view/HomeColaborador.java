package br.com.sanity.view;

import br.com.sanity.connection.ConnectionFactory;
import br.com.sanity.model.Formulario;
import java.util.ArrayList;
import br.com.sanity.model.Usuario;

public class HomeColaborador extends javax.swing.JFrame {

    Usuario user;
    int formspag = 0;
    int formstotal;
    javax.swing.table.DefaultTableModel tableModel;

    public HomeColaborador(Usuario user) {
        this.user = user;
        initComponents();
        mostrarTabelaFormularios();
        nomeUsuario.setText("Olá, " + this.user.getNome());
    }

    private void mostrarTabelaFormularios() {
        tableModel = (javax.swing.table.DefaultTableModel) jtListaFormulario.getModel();

        //formata os caraio dos cabeçalho da tabela
        final javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer();
        renderer.setBorder(null);
        renderer.setBackground(java.awt.Color.decode("#333333"));
        renderer.setForeground(java.awt.Color.white);
        jtListaFormulario.getTableHeader().setDefaultRenderer(renderer);

        //redimensiona as colunas
        jtListaFormulario.setRowHeight(26);
        jtListaFormulario.getColumnModel().getColumn(0).setMinWidth(0);
        jtListaFormulario.getColumnModel().getColumn(0).setMaxWidth(0);
        jtListaFormulario.getColumnModel().getColumn(2).setMinWidth(75);
        jtListaFormulario.getColumnModel().getColumn(2).setMaxWidth(75);

        //renderiza a coluna de Abrir
        jtListaFormulario.getColumnModel().getColumn(2).setCellRenderer(new javax.swing.table.DefaultTableCellRenderer() {
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
        jtListaFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                javax.swing.JTable selected = (javax.swing.JTable) e.getSource();
                if (selected.getSelectedColumn() == 2) {
                    new ResponderFormulario(user, (int) tableModel.getValueAt(selected.getSelectedRow(), 0)).setVisible(true);
                }
            }
        });

        //preencher tabela ao entrar
        formstotal = preencherTabela(user, 0, "");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao = new javax.swing.JButton();
        panelRosa = new javax.swing.JPanel();
        logoSanity = new javax.swing.JLabel();
        nomeSanity = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        painelUsuarios = new javax.swing.JPanel();
        mainzinho2 = new javax.swing.JPanel();
        nav2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaFormulario = new javax.swing.JTable();
        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jpTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

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

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(251, 251, 251));
        nomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nomeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/male_user_50px.png"))); // NOI18N
        nomeUsuario.setText("Olá, Usuário");
        panelRosa.add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 820, 60));

        getContentPane().add(panelRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        painelUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        painelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainzinho2.setBackground(new java.awt.Color(51, 51, 51));
        mainzinho2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav2.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setBorder(null);

        jtListaFormulario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Título", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListaFormulario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jtListaFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtListaFormulario.setGridColor(new java.awt.Color(255, 255, 255));
        jtListaFormulario.setRowSelectionAllowed(false);
        jtListaFormulario.getTableHeader().setResizingAllowed(false);
        jtListaFormulario.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtListaFormulario);

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

        javax.swing.GroupLayout nav2Layout = new javax.swing.GroupLayout(nav2);
        nav2.setLayout(nav2Layout);
        nav2Layout.setHorizontalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nav2Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(591, 591, 591)
                        .addComponent(btnAvancar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nav2Layout.setVerticalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvancar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        mainzinho2.add(nav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

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
        mainzinho2.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 101, 19));

        txtPesquisar.setBackground(new java.awt.Color(102, 102, 102));
        txtPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setToolTipText("");
        txtPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesquisar.setCaretColor(new java.awt.Color(51, 51, 51));
        mainzinho2.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 210, -1));

        painelUsuarios.add(mainzinho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 720, 420));

        jpTitulo.setBackground(new java.awt.Color(255, 0, 66));

        lblTitulo.setBackground(new java.awt.Color(255, 0, 102));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(251, 251, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/search_26px.png"))); // NOI18N
        lblTitulo.setText("FORMULÁRIOS");
        lblTitulo.setToolTipText("");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        painelUsuarios.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        getContentPane().add(painelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1030, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //preecherTabela(this.user, 0, checkColaborador.isSelected(), checkAdministrador.isSelected());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        if (formspag >= formstotal / 10) {
            return; //fazer nada se na última página
        }
        formspag++;
        formstotal = preencherTabela(user, formspag, txtPesquisar.getText());
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (formspag <= 0) {
            return; //fazer nada se na primeira página
        }
        formspag--;
        formstotal = preencherTabela(user, formspag, txtPesquisar.getText());
    }//GEN-LAST:event_btnVoltarActionPerformed

    private int preencherTabela(Usuario user, int pagina, String pesquisa) {
        //limpa tabela
        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            tableModel.removeRow(0);
        }

        //preenche a tabela
        ArrayList<Formulario> busca = ConnectionFactory.getDezFormularios(user, pagina, pesquisa);
        for (int i = 0; i < busca.size(); i++) {
            tableModel.addRow(
                    new Object[]{
                        busca.get(i).getId(),
                        busca.get(i).getTitulo(),
                        "Abrir"
                    }
            );
        }

        //busca e retorna a quantidade
        return ConnectionFactory.getTotalFormularios(user);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTable jtListaFormulario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel logoSanity;
    private javax.swing.JPanel mainzinho2;
    private javax.swing.JPanel nav2;
    private javax.swing.JLabel nomeSanity;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel painelUsuarios;
    private javax.swing.JPanel panelRosa;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
