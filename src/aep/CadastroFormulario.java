package aep;

public class CadastroFormulario extends javax.swing.JFrame {

    public CadastroFormulario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        lblTitulo1 = new javax.swing.JLabel();
        txtTitulo1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

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
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtTitulo.setForeground(new java.awt.Color(255, 0, 66));
        txtTitulo.setBorder(null);
        txtTitulo.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 310, 10));

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 0, 66));
        lblDescricao.setText("Descrição");
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

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
        jPanel1.add(btnCancelarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, 40));

        btnCadastrarFormulario.setBackground(new java.awt.Color(255, 0, 66));
        btnCadastrarFormulario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastrarFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFormulario.setText("CADASTRAR");
        btnCadastrarFormulario.setBorder(null);
        jPanel1.add(btnCadastrarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 150, 40));

        txaDescricao.setColumns(20);
        txaDescricao.setForeground(new java.awt.Color(255, 0, 66));
        txaDescricao.setRows(5);
        txaDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 66)));
        jScrollPane1.setViewportView(txaDescricao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 310, -1));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 0, 66));
        lblTitulo1.setText("ID Formuário");
        jPanel1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtTitulo1.setEditable(false);
        txtTitulo1.setForeground(new java.awt.Color(255, 0, 66));
        txtTitulo1.setBorder(null);
        txtTitulo1.setCaretColor(new java.awt.Color(255, 0, 66));
        jPanel1.add(txtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator7.setForeground(new java.awt.Color(255, 0, 66));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFormularioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarFormularioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroFormulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFormulario;
    private javax.swing.JButton btnCancelarFormulario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel painelVermelho;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    private javax.swing.JLabel txtTituloFormulario;
    // End of variables declaration//GEN-END:variables
}
