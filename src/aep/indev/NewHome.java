package aep.indev;

import connection.UsuarioDAO;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class NewHome extends javax.swing.JFrame {

    Usuario user;
    DefaultTableModel tableModel;

    public NewHome(Usuario user) {
        this.user = user;
        initComponents();
        tableModel = (DefaultTableModel) jTable2.getModel();

        //redimensiona as colunas
        jTable2.setRowHeight(22);
        jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(2).setMinWidth(84);
        jTable2.getColumnModel().getColumn(2).setMaxWidth(84);
        jTable2.getColumnModel().getColumn(3).setMinWidth(75);
        jTable2.getColumnModel().getColumn(3).setMaxWidth(75);
        
        //renderiza a coluna de Editar
        jTable2.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                l.setBackground(new java.awt.Color(255, 0, 66));
                l.setFont(new java.awt.Font("Century Gothic", 0, 12));
                l.setForeground(new java.awt.Color(255, 255, 255));
                l.setBorder(null);
                return l;
            }
        });

        //reagir a clique
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                javax.swing.JTable selected = (javax.swing.JTable) e.getSource();
                if (selected.getSelectedColumn() == 3) {
                    new NewAlterarUsuario(user, (int) tableModel.getValueAt(selected.getSelectedRow(), 0)).setVisible(true);
                }
            }
        });
        
        //preencher tabela ao entrar
        preecherTabela(user, 0, true, false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao = new javax.swing.JButton();
        panelRosa = new javax.swing.JPanel();
        logoSanity = new javax.swing.JLabel();
        nomeSanity = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        nomeAdmin = new javax.swing.JLabel();
        panelCinza = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonForms = new javax.swing.JButton();
        buttonEstatistica = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        mainzinho = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        checkColaborador = new javax.swing.JCheckBox();
        checkAdministrador = new javax.swing.JCheckBox();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        addUsuario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        botao.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(251, 251, 251));
        setMaximumSize(new java.awt.Dimension(1900, 1023));
        setMinimumSize(new java.awt.Dimension(1032, 599));
        setPreferredSize(new java.awt.Dimension(1032, 599));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRosa.setBackground(new java.awt.Color(255, 0, 66));
        panelRosa.setMaximumSize(new java.awt.Dimension(1900, 1023));
        panelRosa.setPreferredSize(new java.awt.Dimension(1032, 40));
        panelRosa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/logoSanity.png"))); // NOI18N
        logoSanity.setToolTipText("");
        logoSanity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRosa.add(logoSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        nomeSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/iconSanity.png"))); // NOI18N
        nomeSanity.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nomeSanity.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nomeSanity.setVerifyInputWhenFocusTarget(false);
        panelRosa.add(nomeSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 30));

        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/male_user_50px.png"))); // NOI18N
        panelRosa.add(iconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        nomeAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeAdmin.setForeground(new java.awt.Color(251, 251, 251));
        nomeAdmin.setText("Olá, Admin");
        panelRosa.add(nomeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 100, 60));

        getContentPane().add(panelRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        panelCinza.setBackground(new java.awt.Color(51, 51, 51));
        panelCinza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(0, 0, 0));
        buttonHome.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(251, 251, 251));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/home_24px.png"))); // NOI18N
        buttonHome.setText("   Pagina Inicial");
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
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
        buttonForms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/edit_property_24px.png"))); // NOI18N
        buttonForms.setText("   Formulários");
        buttonForms.setToolTipText("");
        buttonForms.setBorderPainted(false);
        buttonForms.setContentAreaFilled(false);
        buttonForms.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        buttonEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/account_24px.png"))); // NOI18N
        buttonEstatistica.setText("   Estatísticas");
        buttonEstatistica.setToolTipText("");
        buttonEstatistica.setBorderPainted(false);
        buttonEstatistica.setContentAreaFilled(false);
        buttonEstatistica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstatisticaActionPerformed(evt);
            }
        });
        panelCinza.add(buttonEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 40));

        getContentPane().add(panelCinza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 540));

        main.setLayout(new java.awt.CardLayout());
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, 230));

        mainzinho.setBackground(new java.awt.Color(51, 51, 51));

        nav.setBackground(new java.awt.Color(51, 51, 51));

        checkColaborador.setBackground(new java.awt.Color(51, 51, 51));
        checkColaborador.setForeground(new java.awt.Color(251, 251, 251));
        checkColaborador.setSelected(true);
        checkColaborador.setText("Colaboradores");
        checkColaborador.setToolTipText("");
        checkColaborador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkColaborador.setBorderPainted(true);
        checkColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkColaboradorActionPerformed(evt);
            }
        });

        checkAdministrador.setBackground(new java.awt.Color(51, 51, 51));
        checkAdministrador.setForeground(new java.awt.Color(251, 251, 251));
        checkAdministrador.setText("Administradores");
        checkAdministrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkAdministrador.setBorderPainted(true);
        checkAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdministradorActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setForeground(new java.awt.Color(251, 251, 251));
        btnPesquisar.setText(" Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(251, 251, 251));
        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jTable2.setRowSelectionAllowed(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(navLayout.createSequentialGroup()
                        .addComponent(checkAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAdministrador)
                    .addComponent(checkColaborador)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
        );

        addUsuario.setBackground(new java.awt.Color(51, 51, 51));
        addUsuario.setForeground(new java.awt.Color(251, 251, 251));
        addUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/add_user_group_woman_man_24px.png"))); // NOI18N
        addUsuario.setText("Novo Usuario");
        addUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addUsuario.setContentAreaFilled(false);
        addUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout mainzinhoLayout = new javax.swing.GroupLayout(mainzinho);
        mainzinho.setLayout(mainzinhoLayout);
        mainzinhoLayout.setHorizontalGroup(
            mainzinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainzinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainzinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainzinhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addUsuario))
                    .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        mainzinhoLayout.setVerticalGroup(
            mainzinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainzinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainzinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 720, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 66));

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 251, 251));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/search_26px.png"))); // NOI18N
        jLabel1.setText("Consultar Usuarios Cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 720, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preecherTabela(this.user, 0, checkColaborador.isSelected(), checkAdministrador.isSelected());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void checkColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkColaboradorActionPerformed
        if (!checkColaborador.isSelected() && !checkAdministrador.isSelected()) {
            checkColaborador.setSelected(true);
        }
    }//GEN-LAST:event_checkColaboradorActionPerformed

    private void checkAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdministradorActionPerformed
        if (!checkColaborador.isSelected() && !checkAdministrador.isSelected()) {
            checkColaborador.setSelected(true);
        }
    }//GEN-LAST:event_checkAdministradorActionPerformed

    private void buttonEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstatisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEstatisticaActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFormsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFormsActionPerformed

    private void preecherTabela(Usuario user, int pagina, boolean c, boolean a) {
        //limpa tabela
        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            tableModel.removeRow(0);
        }

        //preenche a tabela
        ArrayList<Usuario> busca = UsuarioDAO.getDezColaboradores(user, pagina, c, a);
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUsuario;
    private javax.swing.JButton botao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton buttonEstatistica;
    private javax.swing.JButton buttonForms;
    private javax.swing.JButton buttonHome;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkColaborador;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logoSanity;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainzinho;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel nomeAdmin;
    private javax.swing.JLabel nomeSanity;
    private javax.swing.JPanel panelCinza;
    private javax.swing.JPanel panelRosa;
    // End of variables declaration//GEN-END:variables
}
