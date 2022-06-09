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
        nav = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        mainzinho = new javax.swing.JPanel();
        checkColaborador = new javax.swing.JCheckBox();
        checkAdministrador = new javax.swing.JCheckBox();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        botao.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nav.setLayout(new javax.swing.BoxLayout(nav, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setText("jButton1");
        nav.add(jButton1);

        jButton2.setText("jButton2");
        nav.add(jButton2);

        getContentPane().add(nav, java.awt.BorderLayout.PAGE_START);

        main.setLayout(new java.awt.CardLayout());

        mainzinho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkColaborador.setSelected(true);
        checkColaborador.setText("Colaboradores");
        checkColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkColaboradorActionPerformed(evt);
            }
        });
        mainzinho.add(checkColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, -1, -1));

        checkAdministrador.setText("Administradores");
        checkAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdministradorActionPerformed(evt);
            }
        });
        mainzinho.add(checkAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 6, -1, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        mainzinho.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 5, -1, -1));

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

        mainzinho.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 250));

        main.add(mainzinho, "card4");

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JButton botao;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkColaborador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainzinho;
    private javax.swing.JPanel nav;
    // End of variables declaration//GEN-END:variables
}
