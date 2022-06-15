/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sanity.view;

/**
 *
 * @author Mateus
 */
public class ResponderFormulario extends javax.swing.JFrame {

    
    
    /**
     * Creates new form ResponderFormulario
     */
    public ResponderFormulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainzinho2 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblPergunta = new javax.swing.JLabel();
        rbtnDiscordoTotalmente = new javax.swing.JRadioButton();
        rbtnDiscordo = new javax.swing.JRadioButton();
        rbtnNeutro = new javax.swing.JRadioButton();
        rbtnConcordo = new javax.swing.JRadioButton();
        rbtnConcordoTotalmente = new javax.swing.JRadioButton();
        lblPerguntaDoBanco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSeguinte = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(549, 506));

        mainzinho2.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 0, 66));
        lblTitulo1.setText("Título do Formulário");

        txtTitulo.setEditable(false);
        txtTitulo.setBackground(new java.awt.Color(51, 51, 51));
        txtTitulo.setForeground(new java.awt.Color(255, 0, 66));
        txtTitulo.setBorder(null);
        txtTitulo.setCaretColor(new java.awt.Color(255, 0, 66));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 66));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 66));

        lblPergunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 0, 66));
        lblPergunta.setText("Pergunta");

        rbtnDiscordoTotalmente.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnDiscordoTotalmente);
        rbtnDiscordoTotalmente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bola.png"))); // NOI18N
        rbtnDiscordoTotalmente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolsPintada.png"))); // NOI18N

        rbtnDiscordo.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnDiscordo);
        rbtnDiscordo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenor.png"))); // NOI18N
        rbtnDiscordo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorPintada.png"))); // NOI18N

        rbtnNeutro.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnNeutro);
        rbtnNeutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorMenor.png"))); // NOI18N
        rbtnNeutro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorMenorPintada.png"))); // NOI18N

        rbtnConcordo.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnConcordo);
        rbtnConcordo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenor.png"))); // NOI18N
        rbtnConcordo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorPintada.png"))); // NOI18N

        rbtnConcordoTotalmente.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbtnConcordoTotalmente);
        rbtnConcordoTotalmente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bola.png"))); // NOI18N
        rbtnConcordoTotalmente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolsPintada.png"))); // NOI18N
        rbtnConcordoTotalmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConcordoTotalmenteActionPerformed(evt);
            }
        });

        lblPerguntaDoBanco.setBackground(new java.awt.Color(51, 51, 51));
        lblPerguntaDoBanco.setForeground(new java.awt.Color(255, 0, 66));
        lblPerguntaDoBanco.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        jLabel1.setBackground(new java.awt.Color(255, 0, 66));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 66));
        jLabel1.setText("Discordo");

        jLabel2.setBackground(new java.awt.Color(255, 0, 66));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 66));
        jLabel2.setText("Concordo");

        jLabel3.setBackground(new java.awt.Color(255, 0, 66));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 66));
        jLabel3.setText("Neutro");

        btnSeguinte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/seguinte.JPG"))); // NOI18N
        btnSeguinte.setBorder(null);
        btnSeguinte.setContentAreaFilled(false);
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/cancelar.JPG"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);

        javax.swing.GroupLayout mainzinho2Layout = new javax.swing.GroupLayout(mainzinho2);
        mainzinho2.setLayout(mainzinho2Layout);
        mainzinho2Layout.setHorizontalGroup(
            mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainzinho2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerguntaDoBanco)
                    .addComponent(lblTitulo1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPergunta))
                .addGap(113, 113, 113))
            .addGroup(mainzinho2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainzinho2Layout.createSequentialGroup()
                        .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtnDiscordoTotalmente)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addComponent(rbtnDiscordo)
                        .addGap(40, 40, 40)
                        .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainzinho2Layout.createSequentialGroup()
                                .addComponent(rbtnNeutro)
                                .addGap(39, 39, 39)
                                .addComponent(rbtnConcordo))
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnConcordoTotalmente)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainzinho2Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );
        mainzinho2Layout.setVerticalGroup(
            mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainzinho2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitulo1)
                .addGap(4, 4, 4)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPerguntaDoBanco)
                .addGap(79, 79, 79)
                .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnDiscordo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnDiscordoTotalmente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnConcordoTotalmente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnNeutro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnConcordo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnSeguinte)
                .addGap(36, 36, 36))
            .addGroup(mainzinho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainzinho2Layout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addComponent(btnCancelar)
                    .addGap(36, 36, 36)))
        );

        jpTitulo.setBackground(new java.awt.Color(255, 0, 66));
        jpTitulo.setPreferredSize(new java.awt.Dimension(133, 47));
        jpTitulo.setRequestFocusEnabled(false);

        lblTitulo.setBackground(new java.awt.Color(255, 0, 102));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(251, 251, 251));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("FORMULÁRIO");
        lblTitulo.setToolTipText("");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
            .addComponent(mainzinho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(mainzinho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnConcordoTotalmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConcordoTotalmenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnConcordoTotalmenteActionPerformed

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguinteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPerguntaDoBanco;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel mainzinho2;
    private javax.swing.JRadioButton rbtnConcordo;
    private javax.swing.JRadioButton rbtnConcordoTotalmente;
    private javax.swing.JRadioButton rbtnDiscordo;
    private javax.swing.JRadioButton rbtnDiscordoTotalmente;
    private javax.swing.JRadioButton rbtnNeutro;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
