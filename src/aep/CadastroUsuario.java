package aep;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVerlhodoTitulo = new javax.swing.JPanel();
        lblTituloCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeCadastro = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmailCadastro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblCpf = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        txtMaskedCpfCadastro = new javax.swing.JFormattedTextField();
        cbxEmpresaCadastro = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        lblSenha = new javax.swing.JLabel();
        cbxPasswordCadastro = new javax.swing.JPasswordField();
        lblPerfil = new javax.swing.JLabel();
        cbxPerfilCadastro = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVerlhodoTitulo.setBackground(new java.awt.Color(255, 0, 66));

        lblTituloCadastro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCadastro.setText("CADASTRO");

        javax.swing.GroupLayout painelVerlhodoTituloLayout = new javax.swing.GroupLayout(painelVerlhodoTitulo);
        painelVerlhodoTitulo.setLayout(painelVerlhodoTituloLayout);
        painelVerlhodoTituloLayout.setHorizontalGroup(
            painelVerlhodoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVerlhodoTituloLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblTituloCadastro)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        painelVerlhodoTituloLayout.setVerticalGroup(
            painelVerlhodoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVerlhodoTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloCadastro)
                .addContainerGap())
        );

        jPanel1.add(painelVerlhodoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 0, 66));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtNomeCadastro.setForeground(new java.awt.Color(255, 0, 66));
        txtNomeCadastro.setBorder(null);
        txtNomeCadastro.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtNomeCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 10));

        txtEmailCadastro.setForeground(new java.awt.Color(255, 0, 66));
        txtEmailCadastro.setBorder(null);
        txtEmailCadastro.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtEmailCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 310, 10));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 0, 66));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, 10));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 0, 66));
        lblCpf.setText("CPF");
        jPanel1.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        lblEmpresa.setText("Empresa");
        jPanel1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtMaskedCpfCadastro.setBorder(null);
        txtMaskedCpfCadastro.setForeground(new java.awt.Color(255, 0, 66));
        try {
            txtMaskedCpfCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtMaskedCpfCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 60, -1));

        cbxEmpresaCadastro.setForeground(new java.awt.Color(255, 0, 66));
        cbxEmpresaCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEmpresaCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        cbxEmpresaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(cbxEmpresaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 210, 20));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 210, 10));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 0, 66));
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        cbxPasswordCadastro.setForeground(new java.awt.Color(255, 0, 66));
        cbxPasswordCadastro.setText("jPasswordField1");
        cbxPasswordCadastro.setBorder(null);
        jPanel1.add(cbxPasswordCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 210, -1));

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 0, 66));
        lblPerfil.setText("Perfil");
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        cbxPerfilCadastro.setForeground(new java.awt.Color(255, 0, 66));
        cbxPerfilCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLABORADOR", "ADMINISTRADOR", " " }));
        cbxPerfilCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.add(cbxPerfilCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 210, -1));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 150, 40));

        btnCadastrar.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(null);
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxEmpresaCadastro;
    private javax.swing.JPasswordField cbxPasswordCadastro;
    private javax.swing.JComboBox<String> cbxPerfilCadastro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JPanel painelVerlhodoTitulo;
    private javax.swing.JTextField txtEmailCadastro;
    private javax.swing.JFormattedTextField txtMaskedCpfCadastro;
    private javax.swing.JTextField txtNomeCadastro;
    // End of variables declaration//GEN-END:variables
}
