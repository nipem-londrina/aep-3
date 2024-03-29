package br.com.sanity;

public class DesativarUsuario extends javax.swing.JFrame {

    public DesativarUsuario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        lblTituloDesativarUser = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeDesativarUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblCpf = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        txtMaskCpf = new javax.swing.JFormattedTextField();
        cbxEmpresa = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        lblSenha = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPerfil = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        cbxIDusuario = new javax.swing.JComboBox<>();
        lblIdUsuario = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Desativar Usuário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        lblTituloDesativarUser.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloDesativarUser.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTituloDesativarUser.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloDesativarUser.setText("DESATIVAR USUÁRIO");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblTituloDesativarUser)
                .addContainerGap(538, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDesativarUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 0, 66));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        txtNomeDesativarUsuario.setEditable(false);
        txtNomeDesativarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDesativarUsuario.setForeground(new java.awt.Color(255, 0, 66));
        txtNomeDesativarUsuario.setBorder(null);
        txtNomeDesativarUsuario.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtNomeDesativarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 310, 10));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(255, 0, 66));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 310, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 310, 10));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 0, 66));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 60, 10));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 0, 66));
        lblCpf.setText("CPF");
        jPanel1.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        lblEmpresa.setText("Empresa");
        jPanel1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        txtMaskCpf.setEditable(false);
        txtMaskCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtMaskCpf.setBorder(null);
        txtMaskCpf.setForeground(new java.awt.Color(255, 0, 66));
        try {
            txtMaskCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtMaskCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 60, -1));

        cbxEmpresa.setForeground(new java.awt.Color(255, 0, 66));
        cbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        cbxEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxEmpresa.setEnabled(false);
        jPanel1.add(cbxEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 210, 20));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 210, 10));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 0, 66));
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        txtPassword.setEditable(false);
        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(255, 0, 66));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 210, -1));

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 0, 66));
        lblPerfil.setText("Perfil");
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        cbxPerfil.setForeground(new java.awt.Color(255, 0, 66));
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLABORADOR", "ADMINISTRADOR", " " }));
        cbxPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        cbxPerfil.setEnabled(false);
        jPanel1.add(cbxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 210, -1));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 150, 40));

        btnDesativar.setBackground(new java.awt.Color(255, 0, 66));
        btnDesativar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDesativar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesativar.setText("DESATIVAR");
        btnDesativar.setBorder(null);
        jPanel1.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 150, 40));

        cbxIDusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.add(cbxIDusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 310, -1));

        lblIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdUsuario.setForeground(new java.awt.Color(255, 0, 66));
        lblIdUsuario.setText("ID Usuário");
        jPanel1.add(lblIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DesativarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxIDusuario;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloDesativarUser;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMaskCpf;
    private javax.swing.JTextField txtNomeDesativarUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
