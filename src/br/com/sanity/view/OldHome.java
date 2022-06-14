package br.com.sanity.view;

import br.com.sanity.model.Usuario;

public class OldHome extends javax.swing.JFrame {
    Usuario user;
    
    public OldHome(Usuario user) {
        initComponents();
        this.user = user;
        lblUsuarioLogado.setText("Usuário: " + this.user.getNome());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePainel = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        homeMenuBar = new javax.swing.JMenuBar();
        menuFormularios = new javax.swing.JMenu();
        itemFormulario = new javax.swing.JMenu();
        subItemFormularioCriar = new javax.swing.JMenuItem();
        menuIndev = new javax.swing.JMenu();
        itemIndev = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sanity");

        HomePainel.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuarioLogado.setText(" ");

        javax.swing.GroupLayout HomePainelLayout = new javax.swing.GroupLayout(HomePainel);
        HomePainel.setLayout(HomePainelLayout);
        HomePainelLayout.setHorizontalGroup(
            HomePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomePainelLayout.setVerticalGroup(
            HomePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioLogado)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        homeMenuBar.setBackground(new java.awt.Color(0, 0, 255));
        homeMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        homeMenuBar.setForeground(new java.awt.Color(255, 255, 255));

        menuFormularios.setBorder(null);
        menuFormularios.setForeground(new java.awt.Color(255, 0, 66));
        menuFormularios.setText("FORMULÁRIOS");
        menuFormularios.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N

        itemFormulario.setForeground(new java.awt.Color(255, 0, 66));
        itemFormulario.setText("Formulário");

        subItemFormularioCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioCriar.setText("Criar");
        subItemFormularioCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioCriarActionPerformed(evt);
            }
        });
        itemFormulario.add(subItemFormularioCriar);

        menuFormularios.add(itemFormulario);

        homeMenuBar.add(menuFormularios);

        menuIndev.setText("INDEV");

        itemIndev.setText("Usuários");
        itemIndev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIndevActionPerformed(evt);
            }
        });
        menuIndev.add(itemIndev);

        homeMenuBar.add(menuIndev);

        setJMenuBar(homeMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subItemFormularioCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemFormularioCriarActionPerformed
        new CadastroFormulario(user).setVisible(true);
    }//GEN-LAST:event_subItemFormularioCriarActionPerformed

    private void itemIndevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIndevActionPerformed
        new br.com.sanity.view.HomeAdministrador(user).setVisible(true);
    }//GEN-LAST:event_itemIndevActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePainel;
    private javax.swing.JMenuBar homeMenuBar;
    private javax.swing.JMenu itemFormulario;
    private javax.swing.JMenuItem itemIndev;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenu menuFormularios;
    private javax.swing.JMenu menuIndev;
    private javax.swing.JMenuItem subItemFormularioCriar;
    // End of variables declaration//GEN-END:variables
}
