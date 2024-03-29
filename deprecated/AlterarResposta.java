package br.com.sanity;

public class AlterarResposta extends javax.swing.JFrame {

    public AlterarResposta() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        txtTituloFormulario = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblPergunta = new javax.swing.JLabel();
        btnCancelarFormulario = new javax.swing.JButton();
        btnCadastrarResposta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPergunta = new javax.swing.JTextArea();
        cbxIdResposta = new javax.swing.JComboBox<>();
        lblIdPergunta = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblValor = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblResposta = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblIdResposta = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        cbxIdPergunta1 = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Alterar Resposta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("ALTERAR RESPOSTA");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(txtTituloFormulario)
                .addContainerGap(570, Short.MAX_VALUE))
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
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 310, 10));

        lblPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblPergunta.setText("Pergunta");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 150, 40));

        btnCadastrarResposta.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarResposta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarResposta.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarResposta.setText("ALTERAR");
        btnCadastrarResposta.setBorder(null);
        jPanel1.add(btnCadastrarResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, 40));

        txaPergunta.setEditable(false);
        txaPergunta.setColumns(20);
        txaPergunta.setForeground(new java.awt.Color(255, 0, 66));
        txaPergunta.setRows(5);
        txaPergunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jScrollPane1.setViewportView(txaPergunta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 310, -1));

        cbxIdResposta.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdResposta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxIdResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, -1));

        lblIdPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblIdPergunta.setText("ID Pergunta");
        jPanel1.add(lblIdPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 60, 10));

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 0, 66));
        lblValor.setText("Valor");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));
        lblValor.getAccessibleContext().setAccessibleDescription("");

        txtResposta.setForeground(new java.awt.Color(255, 0, 66));
        txtResposta.setToolTipText("");
        txtResposta.setBorder(null);
        jPanel1.add(txtResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 310, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 310, 10));

        jComboBox1.setForeground(new java.awt.Color(255, 0, 66));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 60, -1));

        lblResposta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResposta.setForeground(new java.awt.Color(255, 0, 66));
        lblResposta.setText("Resposta");
        jPanel1.add(lblResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator9.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 140, 10));

        lblIdResposta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdResposta.setForeground(new java.awt.Color(255, 0, 66));
        lblIdResposta.setText("ID Resposta");
        jPanel1.add(lblIdResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator11.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 10));

        cbxIdPergunta1.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdPergunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxIdPergunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormularioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarFormularioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AlterarResposta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarResposta;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JComboBox<String> cbxIdPergunta1;
    private javax.swing.JComboBox<String> cbxIdResposta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblIdPergunta;
    private javax.swing.JLabel lblIdResposta;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextArea txaPergunta;
    private javax.swing.JTextField txtResposta;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
