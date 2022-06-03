package aep;

public class AlterarUsuario extends javax.swing.JFrame {

    public AlterarUsuario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        tituloAlterarCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblCPF = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        txtMaskCPF = new javax.swing.JFormattedTextField();
        cbxEmpresa = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        lblSenha = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPerfil = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        bntCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        cbxIDUsuario = new javax.swing.JComboBox<>();
        lblIDUsuario = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        tituloAlterarCadastro.setBackground(new java.awt.Color(255, 255, 255));
        tituloAlterarCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tituloAlterarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        tituloAlterarCadastro.setText("ALTERAR CADASTRO");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(tituloAlterarCadastro)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVermelhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloAlterarCadastro)
                .addContainerGap())
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 0, 66));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        txtNome.setForeground(new java.awt.Color(255, 0, 66));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 310, 10));

        txtEmail.setForeground(new java.awt.Color(255, 0, 66));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 310, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 310, 10));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 0, 66));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 60, 10));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 0, 66));
        lblCPF.setText("CPF");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        lblEmpresa.setText("Empresa");
        jPanel1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        txtMaskCPF.setBorder(null);
        txtMaskCPF.setForeground(new java.awt.Color(255, 0, 66));
        try {
            txtMaskCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtMaskCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 60, -1));

        cbxEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        cbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        cbxEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(cbxEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 210, 20));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 210, 10));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 0, 66));
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        txtPassword.setForeground(new java.awt.Color(255, 0, 66));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 210, -1));

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 0, 66));
        lblPerfil.setText("Perfil");
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        cbxPerfil.setForeground(new java.awt.Color(255, 0, 66));
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLABORADOR", "ADMINISTRADOR", " " }));
        cbxPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.add(cbxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 210, -1));

        bntCancelar.setBackground(new java.awt.Color(153, 153, 153));
        bntCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bntCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bntCancelar.setText("CANCELAR");
        bntCancelar.setBorder(null);
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(bntCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 150, 40));

        btnAlterar.setBackground(new java.awt.Color(255, 0, 66));
        btnAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("ALTERAR");
        btnAlterar.setBorder(null);
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 150, 40));

        cbxIDUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.add(cbxIDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 310, -1));

        lblIDUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDUsuario.setForeground(new java.awt.Color(255, 0, 66));
        lblIDUsuario.setText("ID Usuário");
        jPanel1.add(lblIDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AlterarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxIDUsuario;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JLabel tituloAlterarCadastro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMaskCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
