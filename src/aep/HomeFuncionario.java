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
        menuUsuarios = new javax.swing.JMenu();
        itemCadastrarUsuario = new javax.swing.JMenuItem();
        itemAlterarUsuarios = new javax.swing.JMenuItem();
        itemDesativarUsuarios = new javax.swing.JMenuItem();
        menuFormularios = new javax.swing.JMenu();
        itemFormulario = new javax.swing.JMenu();
        subItemFormularioCriar = new javax.swing.JMenuItem();
        subItemFormularioDesativar = new javax.swing.JMenuItem();
        subItemFormularioAlterar = new javax.swing.JMenuItem();
        itemPergunta = new javax.swing.JMenu();
        subItemPerguntaCriar = new javax.swing.JMenuItem();
        subItemPerguntaDesativar = new javax.swing.JMenuItem();
        subItemPerguntaAlterar = new javax.swing.JMenuItem();
        itemResposta = new javax.swing.JMenu();
        subItemRespotaCriar = new javax.swing.JMenuItem();
        subItemRespostaDesativar = new javax.swing.JMenuItem();
        subItemRespostaAlterar = new javax.swing.JMenuItem();
        menuEstatistica = new javax.swing.JMenu();
        itemEstatisticas = new javax.swing.JMenuItem();
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

        menuUsuarios.setBackground(new java.awt.Color(255, 0, 66));
        menuUsuarios.setBorder(null);
        menuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        menuUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        menuUsuarios.setLabel("USUÁRIOS");

        itemCadastrarUsuario.setForeground(new java.awt.Color(255, 0, 66));
        itemCadastrarUsuario.setText("Cadastrar");
        itemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemCadastrarUsuario);

        itemAlterarUsuarios.setForeground(new java.awt.Color(255, 0, 66));
        itemAlterarUsuarios.setText("Alterar");
        itemAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlterarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAlterarUsuarios);

        itemDesativarUsuarios.setForeground(new java.awt.Color(255, 0, 66));
        itemDesativarUsuarios.setText("Desativar");
        itemDesativarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDesativarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemDesativarUsuarios);

        homeMenuBar.add(menuUsuarios);

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

        subItemFormularioDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioDesativar.setText("Desativar");
        subItemFormularioDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioDesativarActionPerformed(evt);
            }
        });
        itemFormulario.add(subItemFormularioDesativar);

        subItemFormularioAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemFormularioAlterar.setText("Alterar");
        subItemFormularioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemFormularioAlterarActionPerformed(evt);
            }
        });
        itemFormulario.add(subItemFormularioAlterar);

        menuFormularios.add(itemFormulario);

        itemPergunta.setForeground(new java.awt.Color(255, 0, 66));
        itemPergunta.setText("Pergunta");

        subItemPerguntaCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaCriar.setText("Criar");
        subItemPerguntaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaCriarActionPerformed(evt);
            }
        });
        itemPergunta.add(subItemPerguntaCriar);

        subItemPerguntaDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaDesativar.setText("Desativar");
        subItemPerguntaDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaDesativarActionPerformed(evt);
            }
        });
        itemPergunta.add(subItemPerguntaDesativar);

        subItemPerguntaAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemPerguntaAlterar.setText("Alterar");
        subItemPerguntaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemPerguntaAlterarActionPerformed(evt);
            }
        });
        itemPergunta.add(subItemPerguntaAlterar);

        menuFormularios.add(itemPergunta);

        itemResposta.setForeground(new java.awt.Color(255, 0, 66));
        itemResposta.setText("Resposta");

        subItemRespotaCriar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespotaCriar.setText("Criar");
        subItemRespotaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespotaCriarActionPerformed(evt);
            }
        });
        itemResposta.add(subItemRespotaCriar);

        subItemRespostaDesativar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespostaDesativar.setText("Desativar");
        subItemRespostaDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespostaDesativarActionPerformed(evt);
            }
        });
        itemResposta.add(subItemRespostaDesativar);

        subItemRespostaAlterar.setForeground(new java.awt.Color(255, 0, 66));
        subItemRespostaAlterar.setText("Alterar");
        subItemRespostaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subItemRespostaAlterarActionPerformed(evt);
            }
        });
        itemResposta.add(subItemRespostaAlterar);

        menuFormularios.add(itemResposta);

        homeMenuBar.add(menuFormularios);

        menuEstatistica.setBorder(null);
        menuEstatistica.setForeground(new java.awt.Color(255, 0, 66));
        menuEstatistica.setText("ESTATÍSTICAS");
        menuEstatistica.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N

        itemEstatisticas.setText("Estatísticas");
        itemEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstatisticasActionPerformed(evt);
            }
        });
        menuEstatistica.add(itemEstatisticas);

        homeMenuBar.add(menuEstatistica);

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

    private void itemAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlterarUsuariosActionPerformed
        new AlterarUsuario(user).setVisible(true);
    }//GEN-LAST:event_itemAlterarUsuariosActionPerformed

    private void itemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarUsuarioActionPerformed
        new CadastroUsuario(user).setVisible(true);
    }//GEN-LAST:event_itemCadastrarUsuarioActionPerformed

    private void itemDesativarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesativarUsuariosActionPerformed
        new DesativarUsuario().setVisible(true);
    }//GEN-LAST:event_itemDesativarUsuariosActionPerformed

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

    private void itemEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstatisticasActionPerformed
        new Estatisticas().setVisible(true);
    }//GEN-LAST:event_itemEstatisticasActionPerformed

    private void itemIndevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIndevActionPerformed
        new aep.indev.NewHome(user).setVisible(true);
    }//GEN-LAST:event_itemIndevActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HomeFuncionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePainel;
    private javax.swing.JMenuBar homeMenuBar;
    private javax.swing.JMenuItem itemAlterarUsuarios;
    private javax.swing.JMenuItem itemCadastrarUsuario;
    private javax.swing.JMenuItem itemDesativarUsuarios;
    private javax.swing.JMenuItem itemEstatisticas;
    private javax.swing.JMenu itemFormulario;
    private javax.swing.JMenuItem itemIndev;
    private javax.swing.JMenu itemPergunta;
    private javax.swing.JMenu itemResposta;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenu menuEstatistica;
    private javax.swing.JMenu menuFormularios;
    private javax.swing.JMenu menuIndev;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenuItem subItemFormularioAlterar;
    private javax.swing.JMenuItem subItemFormularioCriar;
    private javax.swing.JMenuItem subItemFormularioDesativar;
    private javax.swing.JMenuItem subItemPerguntaAlterar;
    private javax.swing.JMenuItem subItemPerguntaCriar;
    private javax.swing.JMenuItem subItemPerguntaDesativar;
    private javax.swing.JMenuItem subItemRespostaAlterar;
    private javax.swing.JMenuItem subItemRespostaDesativar;
    private javax.swing.JMenuItem subItemRespotaCriar;
    // End of variables declaration//GEN-END:variables
}
