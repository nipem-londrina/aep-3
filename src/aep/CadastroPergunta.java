package aep;

public class CadastroPergunta extends javax.swing.JFrame {

    public CadastroPergunta() {
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
        btnCadastrarFormulario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPergunta = new javax.swing.JTextArea();
        lblIDformulario = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        cbxIdFormulario = new javax.swing.JComboBox<>();
        lblIdPergunta = new javax.swing.JLabel();
        txtIdPerguntaa = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Cadastrar Pergunta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVermelho.setBackground(new java.awt.Color(255, 0, 66));

        txtTituloFormulario.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTituloFormulario.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloFormulario.setText("CADASTRAR PERGUNTA");

        javax.swing.GroupLayout painelVermelhoLayout = new javax.swing.GroupLayout(painelVermelho);
        painelVermelho.setLayout(painelVermelhoLayout);
        painelVermelhoLayout.setHorizontalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(txtTituloFormulario)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        painelVermelhoLayout.setVerticalGroup(
            painelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloFormulario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(painelVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTituloFormulario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTituloFormulario.setForeground(new java.awt.Color(255, 0, 66));
        lblTituloFormulario.setText("Título Formulário");
        jPanel1.add(lblTituloFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtTituloForm.setEditable(false);
        txtTituloForm.setForeground(new java.awt.Color(255, 0, 66));
        txtTituloForm.setBorder(null);
        txtTituloForm.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtTituloForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 310, 10));

        lblPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblPergunta.setText("Pergunta");
        jPanel1.add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 150, 40));

        btnCadastrarFormulario.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFormulario.setText("CADASTRAR");
        btnCadastrarFormulario.setBorder(null);
        jPanel1.add(btnCadastrarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 150, 40));

        txaPergunta.setColumns(20);
        txaPergunta.setForeground(new java.awt.Color(255, 0, 66));
        txaPergunta.setRows(5);
        txaPergunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jScrollPane1.setViewportView(txaPergunta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 310, -1));

        lblIDformulario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDformulario.setForeground(new java.awt.Color(255, 0, 66));
        lblIDformulario.setText("ID Formuário");
        jPanel1.add(lblIDformulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 10));

        cbxIdFormulario.setForeground(new java.awt.Color(255, 0, 66));
        cbxIdFormulario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxIdFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, -1));

        lblIdPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblIdPergunta.setText("ID Pergunta");
        jPanel1.add(lblIdPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        txtIdPerguntaa.setEditable(false);
        txtIdPerguntaa.setForeground(new java.awt.Color(255, 0, 66));
        txtIdPerguntaa.setBorder(null);
        txtIdPerguntaa.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtIdPerguntaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, -1));

        jSeparator8.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            new CadastroPergunta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFormulario;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JComboBox<String> cbxIdFormulario;
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
    private javax.swing.JTextField txtIdPerguntaa;
    private javax.swing.JTextField txtTituloForm;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
