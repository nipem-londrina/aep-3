package br.com.sanity.view;

import br.com.sanity.connection.ConnectionFactory;
import br.com.sanity.model.Formulario;
import br.com.sanity.model.Pergunta;
import br.com.sanity.model.Resposta;
import br.com.sanity.model.Usuario;
import java.awt.CardLayout;
import java.util.ArrayList;

public class ResponderFormulario extends javax.swing.JFrame {

    Usuario user;
    Formulario form;
    ArrayList<Pergunta> pergs;
    ArrayList<Resposta> resps = new ArrayList<>();
    int pergpag = 0;

    public ResponderFormulario(Usuario user, int formId) {
        this.user = user;
        this.form = ConnectionFactory.getFormulario(formId);
        this.pergs = ConnectionFactory.getPerguntas(form);
        initComponents();
        lblTitulo1.setText("<html><p style=\"width:300px\">"
                + form.getTitulo()
                + "</p></html>");
        lblDescricao.setText("<html><p style=\"width:300px\">"
                + form.getDescricao()
                + "</p></html>");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        main = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSeguinte = new javax.swing.JButton();
        mainzinho = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        panelPergunta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPerguntaDoBanco = new javax.swing.JLabel();
        rbtnDiscordoTotalmente = new javax.swing.JRadioButton();
        rbtnDiscordo = new javax.swing.JRadioButton();
        rbtnNeutro = new javax.swing.JRadioButton();
        rbtnConcordo = new javax.swing.JRadioButton();
        rbtnConcordoTotalmente = new javax.swing.JRadioButton();
        jpTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(549, 506));
        setResizable(false);

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 0, 66));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText(" ");

        btnAnterior.setBackground(new java.awt.Color(153, 153, 153));
        btnAnterior.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("CANCELAR");
        btnAnterior.setBorder(null);
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSeguinte.setBackground(new java.awt.Color(255, 0, 66));
        btnSeguinte.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSeguinte.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguinte.setText("COMEÇAR");
        btnSeguinte.setBorder(null);
        btnSeguinte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });

        mainzinho.setLayout(new java.awt.CardLayout());

        lblDescricao.setForeground(new java.awt.Color(255, 0, 66));
        lblDescricao.setText(" ");
        lblDescricao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mainzinho.add(lblDescricao, "descricao");

        jLabel2.setBackground(new java.awt.Color(255, 0, 66));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 66));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Concordo");

        jLabel1.setBackground(new java.awt.Color(255, 0, 66));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 66));
        jLabel1.setText("Discordo");

        lblPerguntaDoBanco.setBackground(new java.awt.Color(51, 51, 51));
        lblPerguntaDoBanco.setForeground(new java.awt.Color(255, 0, 66));
        lblPerguntaDoBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerguntaDoBanco.setText("pergunta");

        buttonGroup1.add(rbtnDiscordoTotalmente);
        rbtnDiscordoTotalmente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnDiscordoTotalmente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bola.png"))); // NOI18N
        rbtnDiscordoTotalmente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaPintada.png"))); // NOI18N

        buttonGroup1.add(rbtnDiscordo);
        rbtnDiscordo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnDiscordo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenor.png"))); // NOI18N
        rbtnDiscordo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorPintada.png"))); // NOI18N

        buttonGroup1.add(rbtnNeutro);
        rbtnNeutro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNeutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorMenor.png"))); // NOI18N
        rbtnNeutro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorMenorPintada.png"))); // NOI18N

        buttonGroup1.add(rbtnConcordo);
        rbtnConcordo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnConcordo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenor.png"))); // NOI18N
        rbtnConcordo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaMenorPintada.png"))); // NOI18N

        buttonGroup1.add(rbtnConcordoTotalmente);
        rbtnConcordoTotalmente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnConcordoTotalmente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bola.png"))); // NOI18N
        rbtnConcordoTotalmente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sanity/icons/bolaPintada.png"))); // NOI18N

        javax.swing.GroupLayout panelPerguntaLayout = new javax.swing.GroupLayout(panelPergunta);
        panelPergunta.setLayout(panelPerguntaLayout);
        panelPerguntaLayout.setHorizontalGroup(
            panelPerguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPerguntaDoBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPerguntaLayout.createSequentialGroup()
                .addGroup(panelPerguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPerguntaLayout.createSequentialGroup()
                        .addComponent(rbtnDiscordoTotalmente)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnDiscordo)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnNeutro)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnConcordo)
                        .addGap(40, 40, 40)
                        .addComponent(rbtnConcordoTotalmente))
                    .addGroup(panelPerguntaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPerguntaLayout.setVerticalGroup(
            panelPerguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerguntaLayout.createSequentialGroup()
                .addComponent(lblPerguntaDoBanco)
                .addGap(40, 40, 40)
                .addGroup(panelPerguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnDiscordo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnDiscordoTotalmente)
                    .addComponent(rbtnNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnConcordo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnConcordoTotalmente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPerguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0))
        );

        mainzinho.add(panelPergunta, "pergunta");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainzinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitulo1)
                .addGap(40, 40, 40)
                .addComponent(mainzinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
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
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        pagina(true);
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        pagina(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void pagina(boolean frente) {
        //impedir se não respondido quando prosseguir
        if (frente && pergpag != 0 && getButton() == 0) {
            return;
        }

        //exceto na pagina de descrição:
        if (pergpag != 0) {
            //adicionar ou editar a resposta
            if (pergpag > resps.size()) {
                if (getButton() != 0) {
                    resps.add(new Resposta(
                            user.getId(),
                            form.getId(),
                            pergs.get(pergpag - 1).getId(),
                            getButton()
                    ));
                }
            } else {
                resps.set(pergpag - 1, new Resposta(
                        user.getId(),
                        form.getId(),
                        pergs.get(pergpag - 1).getId(),
                        getButton()
                ));
            }
        }

        //se voltanto na pagina descrição, fechar
        if (pergpag == 0 && !frente) {
            this.dispose();
            return;
        }

        //se prosseguindo na ultima pergunta, enviar
        if (pergpag == pergs.size() && frente) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    ConnectionFactory.cadastrarRespostas(resps)
                    ? "Formulário enviado!"
                    : "Erro no envio."
            );
            this.dispose();
            return;
        }

        //passar a página
        pergpag += frente ? 1 : -1;
        CardLayout cards = (CardLayout) mainzinho.getLayout();

        if (pergpag == 0) {
            //mostrar pagina de descrição
            cards.show(mainzinho, "descricao");
            btnAnterior.setText("CANCELAR");
        } else {
            //limpar seleção ou preeencher o já respondido
            buttonGroup1.clearSelection();
            if (pergpag <= resps.size()) {
                setButton(resps.get(pergpag - 1).getResposta());
            }

            //mostrar botões padrão
            btnAnterior.setText("ANTERIOR");
            btnSeguinte.setText("SEGUINTE");

            //mostrar botão de enviar na última pagina
            if (pergpag == pergs.size()) {
                btnSeguinte.setText("ENVIAR");
            }

            //mostrar pagina de pergunta
            cards.show(mainzinho, "pergunta");
            lblPerguntaDoBanco.setText("<html><p style=\"width:300px\">"
                    + pergs.get(pergpag - 1).getTexto()
                    + "</p></html>");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPerguntaDoBanco;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainzinho;
    private javax.swing.JPanel panelPergunta;
    private javax.swing.JRadioButton rbtnConcordo;
    private javax.swing.JRadioButton rbtnConcordoTotalmente;
    private javax.swing.JRadioButton rbtnDiscordo;
    private javax.swing.JRadioButton rbtnDiscordoTotalmente;
    private javax.swing.JRadioButton rbtnNeutro;
    // End of variables declaration//GEN-END:variables

    // o pior método do projeto todo
    // esse cara lê qual  dos radiobutton ta selecionado
    private int getButton() {
        int index = 0;
        index += rbtnDiscordoTotalmente.isSelected() ? 1 : 0;
        index += rbtnDiscordo.isSelected() ? 2 : 0;
        index += rbtnNeutro.isSelected() ? 3 : 0;
        index += rbtnConcordo.isSelected() ? 4 : 0;
        index += rbtnConcordoTotalmente.isSelected() ? 5 : 0;
        return index;
    }

    // desculpa, esse sim é o pior método do projeto todo
    // esse cara marca a resposta já preenchida
    private void setButton(int index) {
        rbtnDiscordoTotalmente.setSelected(index == 1);
        rbtnDiscordo.setSelected(index == 2);
        rbtnNeutro.setSelected(index == 3);
        rbtnConcordo.setSelected(index == 4);
        rbtnConcordoTotalmente.setSelected(index == 5);
    }
}
