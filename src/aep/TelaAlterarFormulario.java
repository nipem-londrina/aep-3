
package aep;

/**
 *
 * @author Mateus
 */
public class TelaAlterarFormulario extends javax.swing.JFrame {


    public TelaAlterarFormulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        txtTituloFormulario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblDescricao = new javax.swing.JLabel();
        btnCancelarFormulario = new javax.swing.JButton();
        btnCadastrarFormulario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        txtBuscarID = new javax.swing.JTextField();
        lblIdFormulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDesativarFormulario = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("ALTERAR FORMULÁRIO");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVermelhoLayout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(txtTituloFormulario)
                .addGap(69, 69, 69))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVermelhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloFormulario)
                .addContainerGap())
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 66));
        lblTitulo.setText("Título");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        txtTitulo.setForeground(new java.awt.Color(255, 0, 66));
        txtTitulo.setBorder(null);
        txtTitulo.setCaretColor(new java.awt.Color(255, 0, 66));
        txtTitulo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 310, 10));

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 0, 66));
        lblDescricao.setText("Descrição");
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        btnCancelarFormulario.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarFormulario.setText("CANCELAR");
        btnCancelarFormulario.setBorder(null);
        btnCancelarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFormularioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 40));

        btnCadastrarFormulario.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFormulario.setText("BUSCAR");
        btnCadastrarFormulario.setBorder(null);
        btnCadastrarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFormularioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 70, 20));

        txaDescricao.setColumns(20);
        txaDescricao.setForeground(new java.awt.Color(255, 0, 66));
        txaDescricao.setRows(5);
        txaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        txaDescricao.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(txaDescricao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 310, -1));

        txtBuscarID.setForeground(new java.awt.Color(255, 0, 66));
        txtBuscarID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        txtBuscarID.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 230, -1));

        lblIdFormulario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdFormulario.setForeground(new java.awt.Color(255, 0, 66));
        lblIdFormulario.setText("ID Formulário");
        jPanel1.add(lblIdFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 0, 66));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 60, 0));

        btnDesativarFormulario.setBackground(new java.awt.Color(255, 0, 66));
        btnDesativarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDesativarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnDesativarFormulario.setText("ALTERAR");
        btnDesativarFormulario.setBorder(null);
        jPanel1.add(btnDesativarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarFormularioActionPerformed

    private void btnCadastrarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarFormularioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlterarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFormulario;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JButton btnDesativarFormulario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblIdFormulario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
