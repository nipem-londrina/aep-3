package br.com.sanity;

public class CadastroEmpresa extends javax.swing.JFrame {

    public CadastroEmpresa() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        txtTituloFormulario = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblNomeEmpresa = new javax.swing.JLabel();
        btnCancelarFormulario = new javax.swing.JButton();
        btnCadastrarEmpresa = new javax.swing.JButton();
        lblIdEmpresa = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblCpnj = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        cbxIdEmpresa = new javax.swing.JComboBox<>();
        txtNomeEmpresa = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Cadastrar Empresa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("CADASTRAR EMPRESA");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(txtTituloFormulario)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloFormulario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, 10));

        lblNomeEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        lblNomeEmpresa.setText("Nome");
        jPanel1.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, 40));

        btnCadastrarEmpresa.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarEmpresa.setText("CADASTRAR");
        btnCadastrarEmpresa.setBorder(null);
        jPanel1.add(btnCadastrarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 40));

        lblIdEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        lblIdEmpresa.setText("ID Pergunta");
        jPanel1.add(lblIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        txtCnpj.setForeground(new java.awt.Color(255, 0, 66));
        txtCnpj.setToolTipText("");
        txtCnpj.setBorder(null);
        jPanel1.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 310, 20));

        lblCpnj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpnj.setForeground(new java.awt.Color(255, 0, 66));
        lblCpnj.setText("CNPJ");
        jPanel1.add(lblCpnj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator11.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 10));

        cbxIdEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxIdEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        txtNomeEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        txtNomeEmpresa.setBorder(null);
        jPanel1.add(txtNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormularioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarFormularioActionPerformed

    private void cbxIdEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdEmpresaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroEmpresa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarEmpresa;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JComboBox<String> cbxIdEmpresa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCpnj;
    private javax.swing.JLabel lblIdEmpresa;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
