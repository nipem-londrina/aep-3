package aep;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public final class Estatisticas extends javax.swing.JFrame {

    public Estatisticas() {
        initComponents();
        showPieChart();
    }

    public void showPieChart() {

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ansiedade", 10);
        dataset.setValue("Depressão", 20);
        dataset.setValue("Descontente", 5);
        dataset.setValue("Satisfeito", 18);
        dataset.setValue("Preocupado", 6);

        JFreeChart showPieChart = ChartFactory.createPieChart("Dashboard Sanity", dataset, true, true, false);

        JPanel panelshowPieChart = new ChartPanel(showPieChart);
        Dashboard1.add(panelshowPieChart);
    }

    /*=============================================================================*/

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Dashboard1 = new javax.swing.JPanel();
        panelRosa = new javax.swing.JPanel();
        logoSanity = new javax.swing.JLabel();
        nomeSanity = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        nomeAdmin = new javax.swing.JLabel();
        panelCinza = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonForms = new javax.swing.JButton();
        buttonEstatistica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sanity - Estatísticas");
        setBackground(new java.awt.Color(251, 251, 251));
        setPreferredSize(new java.awt.Dimension(1032, 590));

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1032, 549));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Dashboard1.setLayout(new java.awt.BorderLayout());

        panelRosa.setBackground(new java.awt.Color(255, 0, 66));
        panelRosa.setMaximumSize(new java.awt.Dimension(1900, 1023));
        panelRosa.setPreferredSize(new java.awt.Dimension(1032, 40));
        panelRosa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/logoSanity.png"))); // NOI18N
        logoSanity.setToolTipText("");
        logoSanity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRosa.add(logoSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        nomeSanity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeSanity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/iconSanity.png"))); // NOI18N
        nomeSanity.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nomeSanity.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nomeSanity.setVerifyInputWhenFocusTarget(false);
        panelRosa.add(nomeSanity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 30));

        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/male_user_50px.png"))); // NOI18N
        panelRosa.add(iconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        nomeAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeAdmin.setForeground(new java.awt.Color(251, 251, 251));
        nomeAdmin.setText("Olá, Admin");
        panelRosa.add(nomeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 100, 60));

        panelCinza.setBackground(new java.awt.Color(51, 51, 51));
        panelCinza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(0, 0, 0));
        buttonHome.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(251, 251, 251));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/home_24px.png"))); // NOI18N
        buttonHome.setText("   Pagina Inicial");
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHome.setOpaque(true);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panelCinza.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 40));

        buttonForms.setBackground(new java.awt.Color(0, 0, 0));
        buttonForms.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonForms.setForeground(new java.awt.Color(251, 251, 251));
        buttonForms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/edit_property_24px.png"))); // NOI18N
        buttonForms.setText("   Formulários");
        buttonForms.setToolTipText("");
        buttonForms.setBorderPainted(false);
        buttonForms.setContentAreaFilled(false);
        buttonForms.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonForms.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFormsActionPerformed(evt);
            }
        });
        panelCinza.add(buttonForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 40));

        buttonEstatistica.setBackground(new java.awt.Color(0, 0, 0));
        buttonEstatistica.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        buttonEstatistica.setForeground(new java.awt.Color(251, 251, 251));
        buttonEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aep/icons/account_24px.png"))); // NOI18N
        buttonEstatistica.setText("   Estatísticas");
        buttonEstatistica.setToolTipText("");
        buttonEstatistica.setBorderPainted(false);
        buttonEstatistica.setContentAreaFilled(false);
        buttonEstatistica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstatisticaActionPerformed(evt);
            }
        });
        panelCinza.add(buttonEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCinza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(panelCinza, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstatisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEstatisticaActionPerformed

    private void buttonFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFormsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFormsActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Estatisticas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard1;
    private javax.swing.JButton buttonEstatistica;
    private javax.swing.JButton buttonForms;
    private javax.swing.JButton buttonHome;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoSanity;
    private javax.swing.JLabel nomeAdmin;
    private javax.swing.JLabel nomeSanity;
    private javax.swing.JPanel panelCinza;
    private javax.swing.JPanel panelRosa;
    // End of variables declaration//GEN-END:variables
}
