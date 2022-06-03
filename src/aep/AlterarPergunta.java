package aep;

public class AlterarPergunta extends javax.swing.JFrame {

    public AlterarPergunta() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelVermelho = new javax.swing.JPanel();
        txtTituloFormulario = new javax.swing.JLabel();
        lblTituloFormulario = new javax.swing.JLabel();
        txtTituloForm = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblPergunta = new javax.swing.JLabel();
        btnCancelarFormulario = new javax.swing.JButton();
        btnAlterarPergunta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPergunta = new javax.swing.JTextArea();
        lblIDformulario = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        cbxIdFormulario = new javax.swing.JComboBox<>();
        lblIdPergunta = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        cbxIdFormulario1 = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Alterar Pergunta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("ALTERAR PERGUNTA");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(txtTituloFormulario)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVermelhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloFormulario)
                .addContainerGap())
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTituloFormulario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTituloFormulario.setForeground(new java.awt.Color(255, 0, 66));
        lblTituloFormulario.setText("Título Formulário");
        jPanel1.add(lblTituloFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        txtTituloForm.setEditable(false);
        txtTituloForm.setForeground(new java.awt.Color(255, 0, 66));
        txtTituloForm.setBorder(null);
        txtTituloForm.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtTituloForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 310, 10));

        lblPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblPergunta.setText("Pergunta");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 40));

        btnAlterarPergunta.setBackground(new java.awt.Color(255, 0, 66));
        btnAlterarPergunta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAlterarPergunta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarPergunta.setText("ALTERAR");
        btnAlterarPergunta.setBorder(null);
        jPanel1.add(btnAlterarPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, 40));

        txaPergunta.setColumns(20);
        txaPergunta.setForeground(new java.awt.Color(255, 0, 66));
        txaPergunta.setRows(5);
        txaPergunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jScrollPane1.setViewportView(txaPergunta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, -1));

        lblIDformulario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDformulario.setForeground(new java.awt.Color(255, 0, 66));
        lblIDformulario.setText("ID Formuário");
        jPanel1.add(lblIDformulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 145, 140, 10));

        cbxIdFormulario.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdFormulario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxIdFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdFormularioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxIdFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, -1));

        lblIdPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblIdPergunta.setText("ID Pergunta");
        jPanel1.add(lblIdPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 140, 10));

        cbxIdFormulario1.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdFormulario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxIdFormulario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void cbxIdFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdFormularioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AlterarPergunta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPergunta;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JComboBox<String> cbxIdFormulario;
    private javax.swing.JComboBox<String> cbxIdFormulario1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblIDformulario;
    private javax.swing.JLabel lblIdPergunta;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblTituloFormulario;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextArea txaPergunta;
    private javax.swing.JTextField txtTituloForm;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
