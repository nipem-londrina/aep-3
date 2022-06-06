package aep;

import model.Usuario;

public class HomeFuncionario extends javax.swing.JFrame {
    Usuario user;

    public HomeFuncionario() {
        initComponents();
    }
    
    public HomeFuncionario(Usuario user) {
        initComponents();
        this.user = user;
        lblUsuarioLogado.setText("Usuário: " + this.user.getNome());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePainel = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        homeMenuBar = new javax.swing.JMenuBar();
        ItemMenuUsuarios = new javax.swing.JMenu();
        subItemCadastrarUsuario = new javax.swing.JMenuItem();
        subItemAlterarUsuarios = new javax.swing.JMenuItem();
        subItemDesativarUsuarios = new javax.swing.JMenuItem();
        itemMenuFormularios = new javax.swing.JMenu();
        subItemFormulario = new javax.swing.JMenu();
        subItemFormularioCriar = new javax.swing.JMenuItem();
        subItemFormularioDesativar = new javax.swing.JMenuItem();
        subItemFormularioAlterar = new javax.swing.JMenuItem();
        subItemPergunta = new javax.swing.JMenu();
        subItemPerguntaCriar = new javax.swing.JMenuItem();
        subItemPerguntaDesativar = new javax.swing.JMenuItem();
        subItemPerguntaAlterar = new javax.swing.JMenuItem();
        subItemResposta = new javax.swing.JMenu();
        subItemRespotaCriar = new javax.swing.JMenuItem();
        subItemRespostaDesativar = new javax.swing.JMenuItem();
        subItemRespostaAlterar = new javax.swing.JMenuItem();
        itemMenuEstatistica = new javax.swing.JMenu();
        subItemEstatisticas = new javax.swing.JMenuItem();

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
                .addContainerGap(268, Short.MAX_VALUE))
        );

        homeMenuBar.setBackground(new java.awt.Color(0, 0, 255));
        homeMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        homeMenuBar.setForeground(new java.awt.Color(255, 255, 255));

        ItemMenuUsuarios.setBackground(new java.awt.Color(255, 0, 66));
        ItemMenuUsuarios.setBorder(null);
        ItemMenuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        ItemMenuUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        ItemMenuUsuarios.setLabel("USUÁRIOS");

        subItemCadastrarUsuario.setForeground(new java.awt.Color(255, 0, 66));
        subItemCadastrarUsuario.setText("Cadastrar");
        subItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemCadastrarUsuarioActionPerformed(evt);
            }
        });
        ItemMenuUsuarios.add(subItemCadastrarUsuario);

        subItemAlterarUsuarios.setForeground(new java.awt.Color(255, 0, 66));
        subItemAlterarUsuarios.setText("Alterar");
        subItemAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemAlterarUsuariosActionPerformed(evt);
            }
        });
        ItemMenuUsuarios.add(subItemAlterarUsuarios);

        subItemDesativarUsuarios.setForeground(new java.awt.Color(255, 0, 66));
        subItemDesativarUsuarios.setText("Desativar");
        subItemDesativarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemDesativarUsuariosActionPerformed(evt);
            }
        });
        ItemMenuUsuarios.add(subItemDesativarUsuarios);

        homeMenuBar.add(ItemMenuUsuarios);

        itemMenuFormularios.setBorder(null);
        itemMenuFormularios.setForeground(new java.awt.Color(255, 0, 66));
        itemMenuFormularios.setText("FORMULÁRIOS");
        itemMenuFormularios.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N

        subItemFormulario.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormulario.setText("Formulário");

        subItemFormularioCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioCriar.setText("Criar");
        subItemFormularioCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioCriarActionPerformed(evt);
            }
        });
        subItemFormulario.add(subItemFormularioCriar);

        subItemFormularioDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioDesativar.setText("Desativar");
        subItemFormularioDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioDesativarActionPerformed(evt);
            }
        });
        subItemFormulario.add(subItemFormularioDesativar);

        subItemFormularioAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioAlterar.setText("Alterar");
        subItemFormularioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioAlterarActionPerformed(evt);
            }
        });
        subItemFormulario.add(subItemFormularioAlterar);

        itemMenuFormularios.add(subItemFormulario);

        subItemPergunta.setForeground(new java.awt.Color(255, 0, 66));
        subItemPergunta.setText("Pergunta");

        subItemPerguntaCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaCriar.setText("Criar");
        subItemPerguntaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaCriarActionPerformed(evt);
            }
        });
        subItemPergunta.add(subItemPerguntaCriar);

        subItemPerguntaDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaDesativar.setText("Desativar");
        subItemPerguntaDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaDesativarActionPerformed(evt);
            }
        });
        subItemPergunta.add(subItemPerguntaDesativar);

        subItemPerguntaAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaAlterar.setText("Alterar");
        subItemPerguntaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaAlterarActionPerformed(evt);
            }
        });
        subItemPergunta.add(subItemPerguntaAlterar);

        itemMenuFormularios.add(subItemPergunta);

        subItemResposta.setForeground(new java.awt.Color(255, 0, 66));
        subItemResposta.setText("Resposta");

        subItemRespotaCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespotaCriar.setText("Criar");
        subItemRespotaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespotaCriarActionPerformed(evt);
            }
        });
        subItemResposta.add(subItemRespotaCriar);

        subItemRespostaDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespostaDesativar.setText("Desativar");
        subItemRespostaDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespostaDesativarActionPerformed(evt);
            }
        });
        subItemResposta.add(subItemRespostaDesativar);

        subItemRespostaAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespostaAlterar.setText("Alterar");
        subItemRespostaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespostaAlterarActionPerformed(evt);
            }
        });
        subItemResposta.add(subItemRespostaAlterar);

        itemMenuFormularios.add(subItemResposta);

        homeMenuBar.add(itemMenuFormularios);

        itemMenuEstatistica.setBorder(null);
        itemMenuEstatistica.setForeground(new java.awt.Color(255, 0, 66));
        itemMenuEstatistica.setText("ESTATÍSTICAS");
        itemMenuEstatistica.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N

        subItemEstatisticas.setText("Estatísticas");
        subItemEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemEstatisticasActionPerformed(evt);
            }
        });
        itemMenuEstatistica.add(subItemEstatisticas);

        homeMenuBar.add(itemMenuEstatistica);

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

    private void subItemAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemAlterarUsuariosActionPerformed
        new AlterarUsuario().setVisible(true);
    }//GEN-LAST:event_subItemAlterarUsuariosActionPerformed

    private void subItemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemCadastrarUsuarioActionPerformed
        new CadastroUsuario(user).setVisible(true);
    }//GEN-LAST:event_subItemCadastrarUsuarioActionPerformed

    private void subItemDesativarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemDesativarUsuariosActionPerformed
        new DesativarUsuario().setVisible(true);
    }//GEN-LAST:event_subItemDesativarUsuariosActionPerformed

    private void subItemFormularioCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemFormularioCriarActionPerformed
        new CadastroFormulario().setVisible(true);
    }//GEN-LAST:event_subItemFormularioCriarActionPerformed

    private void subItemFormularioDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemFormularioDesativarActionPerformed
        new DesativarFormulario().setVisible(true);
    }//GEN-LAST:event_subItemFormularioDesativarActionPerformed

    private void subItemFormularioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemFormularioAlterarActionPerformed
        new AlterarFormulario().setVisible(true);
    }//GEN-LAST:event_subItemFormularioAlterarActionPerformed

    private void subItemPerguntaCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemPerguntaCriarActionPerformed
        new CadastroPergunta().setVisible(true);
    }//GEN-LAST:event_subItemPerguntaCriarActionPerformed

    private void subItemPerguntaDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemPerguntaDesativarActionPerformed
        new DesativarPergunta().setVisible(true);
    }//GEN-LAST:event_subItemPerguntaDesativarActionPerformed

    private void subItemPerguntaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemPerguntaAlterarActionPerformed
        new AlterarPergunta().setVisible(true);
    }//GEN-LAST:event_subItemPerguntaAlterarActionPerformed

    private void subItemRespotaCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemRespotaCriarActionPerformed
        new CadastroResposta().setVisible(true);
    }//GEN-LAST:event_subItemRespotaCriarActionPerformed

    private void subItemRespostaDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemRespostaDesativarActionPerformed
        new DesativarResposta().setVisible(true);
    }//GEN-LAST:event_subItemRespostaDesativarActionPerformed

    private void subItemRespostaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemRespostaAlterarActionPerformed
        new AlterarResposta().setVisible(true);
    }//GEN-LAST:event_subItemRespostaAlterarActionPerformed

    private void subItemEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subItemEstatisticasActionPerformed
        new Estatisticas().setVisible(true);
    }//GEN-LAST:event_subItemEstatisticasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HomeFuncionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePainel;
    private javax.swing.JMenu ItemMenuUsuarios;
    private javax.swing.JMenuBar homeMenuBar;
    private javax.swing.JMenu itemMenuEstatistica;
    private javax.swing.JMenu itemMenuFormularios;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenuItem subItemAlterarUsuarios;
    private javax.swing.JMenuItem subItemCadastrarUsuario;
    private javax.swing.JMenuItem subItemDesativarUsuarios;
    private javax.swing.JMenuItem subItemEstatisticas;
    private javax.swing.JMenu subItemFormulario;
    private javax.swing.JMenuItem subItemFormularioAlterar;
    private javax.swing.JMenuItem subItemFormularioCriar;
    private javax.swing.JMenuItem subItemFormularioDesativar;
    private javax.swing.JMenu subItemPergunta;
    private javax.swing.JMenuItem subItemPerguntaAlterar;
    private javax.swing.JMenuItem subItemPerguntaCriar;
    private javax.swing.JMenuItem subItemPerguntaDesativar;
    private javax.swing.JMenu subItemResposta;
    private javax.swing.JMenuItem subItemRespostaAlterar;
    private javax.swing.JMenuItem subItemRespostaDesativar;
    private javax.swing.JMenuItem subItemRespotaCriar;
    // End of variables declaration//GEN-END:variables
}
