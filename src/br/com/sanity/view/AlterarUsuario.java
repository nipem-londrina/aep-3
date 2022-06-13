package br.com.sanity.view;

import static br.com.sanity.view.CadastroUsuario.validarCpf;
import br.com.sanity.connection.ConnectionFactory;
import br.com.sanity.connection.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.sanity.model.Usuario;

public class AlterarUsuario extends javax.swing.JFrame {

    Usuario user;
    Usuario target = new Usuario();

    public AlterarUsuario(Usuario user, int targetId) {
        initComponents();
        this.user = user;
        UsuarioDAO.getUsuario(targetId);
        getColaborador(targetId);
        setCampos(target);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVermelho = new javax.swing.JPanel();
        tituloAlterarCadastro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblCPF = new javax.swing.JLabel();
        txtMaskCPF = new javax.swing.JFormattedTextField();
        lblPerfil = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        bntCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        lblStatus = new javax.swing.JLabel();
        checkAtivo = new javax.swing.JCheckBox();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Alterar Resposta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        tituloAlterarCadastro.setBackground(new java.awt.Color(255, 255, 255));
        tituloAlterarCadastro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tituloAlterarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        tituloAlterarCadastro.setText("ALTERAR CADASTRO");
        painelVermelho.add(tituloAlterarCadastro);

        getContentPane().add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 0, 66));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtNome.setForeground(new java.awt.Color(255, 0, 66));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 310, 10));

        txtEmail.setForeground(new java.awt.Color(255, 0, 66));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 310, 10));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 0, 66));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 310, 10));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 0, 66));
        lblCPF.setText("CPF");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtMaskCPF.setBorder(null);
        txtMaskCPF.setForeground(new java.awt.Color(255, 0, 66));
        try {
            txtMaskCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtMaskCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, -1));

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 0, 66));
        lblPerfil.setText("Perfil");
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        cbxPerfil.setForeground(new java.awt.Color(255, 0, 66));
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLABORADOR", "ADMINISTRADOR" }));
        cbxPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jPanel1.add(cbxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, -1));

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
        jPanel1.add(bntCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 40));

        btnAlterar.setBackground(new java.awt.Color(255, 0, 66));
        btnAlterar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("ALTERAR");
        btnAlterar.setBorder(null);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 150, 40));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 10));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 66));
        lblStatus.setText("Status");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        checkAtivo.setText("Ativo");
        jPanel1.add(checkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 310, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator9.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 310, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 409, 501));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (true
                && !txtNome.getText().equals("")
                && !txtEmail.getText().equals("")
                && validarCpf(txtMaskCPF.getText())) {
            user.setNome(txtNome.getText());
            user.setEmail(txtEmail.getText());
            user.setCpf(txtMaskCPF.getText());
            user.setIdEmpresa(target.getIdEmpresa());
            switch (cbxPerfil.getSelectedIndex()) {
                case 0:
                    user.setPerfil('C');
                    break;
                case 1:
                    user.setPerfil('A');
                    break;
                default:
                    throw new AssertionError();
            }
            JOptionPane.showMessageDialog(null,
                    UsuarioDAO.alterarUsuario(target.getId(),
                            txtNome.getText(),
                            txtEmail.getText(),
                            txtMaskCPF.getText(),
                            checkAtivo.isSelected(),
                            cbxPerfil.getSelectedIndex() == 1 ? 'A' : 'C'
                    ) ? "Alteração bem sucedida!" : "Erro na alteração..."
            );
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Login Inválido");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void getColaborador(int targetId) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("select id, perfil, nome, email, cpf, ativo "
                    + "from Usuario "
                    + "where id = ?");
            stmt.setInt(1, targetId);
            rs = stmt.executeQuery();
            if (rs.next()) {
                this.target.setId(rs.getInt("id"));
                this.target.setPerfil(rs.getString("perfil").charAt(0));
                this.target.setNome(rs.getString("nome"));
                this.target.setEmail(rs.getString("email"));
                this.target.setCpf(rs.getString("cpf"));
                this.target.setAtivo(rs.getBoolean("ativo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }

    private void setCampos(Usuario target) {
        txtNome.setText(target.getNome());
        txtEmail.setText(target.getEmail());
        txtMaskCPF.setText(target.getCpf());
        checkAtivo.setSelected(target.isAtivo());
        cbxPerfil.setSelectedIndex(target.getPerfil() == 'A' ? 1 : 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JLabel tituloAlterarCadastro;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtMaskCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
