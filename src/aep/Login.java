package aep;

import model.Usuario;
import connection.UsuarioDAO;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmailLogin = new javax.swing.JTextField();
        txtPasswordLogin = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSenhaCorreta = new javax.swing.JLabel();
        btnDEBUG = new javax.swing.JButton();
        painelRosa = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sanity - Login");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 17, 71));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 66));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, 10));

        txtEmailLogin.setForeground(new java.awt.Color(255, 0, 66));
        txtEmailLogin.setBorder(null);
        txtEmailLogin.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel2.add(txtEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 267, -1));

        txtPasswordLogin.setForeground(new java.awt.Color(255, 0, 66));
        txtPasswordLogin.setToolTipText("aaaaaaaaaaaa");
        txtPasswordLogin.setBorder(null);
        txtPasswordLogin.setCaretColor(new java.awt.Color(255, 0, 66));
        txtPasswordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordLoginKeyPressed(evt);
            }
        });
        jPanel2.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, -1));

        lblEmail.setBackground(new java.awt.Color(57, 113, 177));
        lblEmail.setForeground(new java.awt.Color(255, 0, 66));
        lblEmail.setText("E-mail");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 0, 66));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 310, 50));

        lblPassword.setBackground(new java.awt.Color(57, 113, 177));
        lblPassword.setForeground(new java.awt.Color(255, 0, 66));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 310, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/face.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/in.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/insta.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/zap.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        lblSenhaCorreta.setForeground(new java.awt.Color(255, 0, 66));
        lblSenhaCorreta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblSenhaCorreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        btnDEBUG.setText("DEBUG");
        btnDEBUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEBUGActionPerformed(evt);
            }
        });
        jPanel2.add(btnDEBUG, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 0, 442, 501));

        painelRosa.setBackground(new java.awt.Color(254, 244, 247));
        painelRosa.setForeground(new java.awt.Color(57, 113, 177));
        painelRosa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/logomenor.png"))); // NOI18N
        painelRosa.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 140, 600, 250));

        getContentPane().add(painelRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Usuario user = new Usuario();
        if (UsuarioDAO.login(user, txtEmailLogin.getText(), txtPasswordLogin.getPassword())) {
            this.dispose();
            new HomeFuncionario(user).setVisible(true);
        } else {
            lblSenhaCorreta.setText("Email ou senha incorretos.");
            txtEmailLogin.setText("");
            txtPasswordLogin.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordLoginKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_txtPasswordLoginKeyPressed

    private void btnDEBUGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEBUGActionPerformed
        Usuario user = new Usuario();
        user.setId(1);
        user.setPerfil('A');
        user.setIdEmpresa(1);
        user.setNome("Erich");
        user.setEmail("erich@email.com");
        user.setCpf("123.456.789-09");
        user.setStatus((byte) 1);
        this.dispose();
        new HomeFuncionario(user).setVisible(true);
    }//GEN-LAST:event_btnDEBUGActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDEBUG;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSenhaCorreta;
    private javax.swing.JPanel painelRosa;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JPasswordField txtPasswordLogin;
    // End of variables declaration//GEN-END:variables
}
