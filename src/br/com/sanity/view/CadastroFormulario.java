package br.com.sanity.view;

import br.com.sanity.connection.ConnectionFactory;
import br.com.sanity.model.Formulario;
import br.com.sanity.model.Usuario;
import java.util.ArrayList;

public class CadastroFormulario extends javax.swing.JFrame {

    Usuario user;
    Formulario form = new Formulario();
    ArrayList<String> perguntas = new ArrayList<>();
    int perguntaspag = 0;

    public CadastroFormulario(Usuario user) {
        initComponents();
        this.user = user;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        scrollDescricao = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        lblPerguntas = new javax.swing.JLabel();
        scrollPergunta = new javax.swing.JScrollPane();
        txaPergunta = new javax.swing.JTextArea();
        btnSeguinte = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        lblPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Cadastrar Formulário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("CADASTRAR FORMULÁRIO");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(txtTituloFormulario)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloFormulario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 66));
        lblTitulo.setText("Título");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtTitulo.setForeground(new java.awt.Color(255, 0, 66));
        txtTitulo.setBorder(null);
        txtTitulo.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 310, 10));

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 0, 66));
        lblDescricao.setText("Descrição");
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 150, 40));

        btnCadastrarFormulario.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFormulario.setText("CADASTRAR");
        btnCadastrarFormulario.setBorder(null);
        btnCadastrarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFormularioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 40));

        txaDescricao.setColumns(20);
        txaDescricao.setForeground(new java.awt.Color(255, 0, 66));
        txaDescricao.setRows(5);
        txaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        scrollDescricao.setViewportView(txaDescricao);

        jPanel1.add(scrollDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, -1));

        lblPerguntas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerguntas.setForeground(new java.awt.Color(255, 0, 66));
        lblPerguntas.setText("Perguntas");
        jPanel1.add(lblPerguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txaPergunta.setColumns(20);
        txaPergunta.setForeground(new java.awt.Color(255, 0, 66));
        txaPergunta.setRows(3);
        txaPergunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        scrollPergunta.setViewportView(txaPergunta);

        jPanel1.add(scrollPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 310, -1));

        btnSeguinte.setBackground(new java.awt.Color(255, 255, 255));
        btnSeguinte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/felchaVermelha.png"))); // NOI18N
        btnSeguinte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeguinte.setContentAreaFilled(false);
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeguinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 333, 30, -1));

        btnAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/felchaVermelhaesquerda.png"))); // NOI18N
        btnAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnterior.setContentAreaFilled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 333, 30, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 310, 10));

        lblPagina.setText("1/1");
        jPanel1.add(lblPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormularioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarFormularioActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (perguntaspag != 0) {
            if (perguntaspag >= perguntas.size()) {
                if (!txaPergunta.getText().equals("")) {
                    perguntas.add(txaPergunta.getText());
                }
            } else {
                perguntas.set(perguntaspag, txaPergunta.getText());
            }
            perguntaspag--;
            lblPagina.setText((perguntaspag + 1) + "/" + (perguntas.size() + 1));
            txaPergunta.setText(perguntas.get(perguntaspag));
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        if (!txaPergunta.getText().equals("")) {
            if (perguntaspag >= perguntas.size()) {
                perguntas.add(txaPergunta.getText());
            } else {
                perguntas.set(perguntaspag, txaPergunta.getText());
            }
            btnAnterior.setEnabled(true);
            perguntaspag++;
            lblPagina.setText((perguntaspag + 1) + "/" + (perguntas.size() + 1));
            if (perguntaspag >= perguntas.size()) {
                txaPergunta.setText("");
            } else {
                txaPergunta.setText(perguntas.get(perguntaspag));
            }
        }
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnCadastrarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFormularioActionPerformed
        if (perguntaspag >= perguntas.size()) {
            perguntas.add(txaPergunta.getText());
        } else {
            perguntas.set(perguntaspag, txaPergunta.getText());
        }
        this.form.setTitulo(txtTitulo.getText());
        this.form.setDescricao(txaDescricao.getText());
        this.form.setIdEmpresa(this.user.getIdEmpresa());
        javax.swing.JOptionPane.showMessageDialog(null,
                ConnectionFactory.cadastrarFormulario(form, perguntas)
                ? "Cadastro bem sucedido!" : "Erro no cadastro..."
        );
        this.dispose();
    }//GEN-LAST:event_btnCadastrarFormularioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastrarFormulario;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPagina;
    private javax.swing.JLabel lblPerguntas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JScrollPane scrollDescricao;
    private javax.swing.JScrollPane scrollPergunta;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextArea txaPergunta;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
