package escola;

import escola.Usuario;
import escola.conexao_db;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Tela_login extends javax.swing.JFrame {

    
    public Tela_login() {
        initComponents();
        
        
        // Adiciona um KeyListener ao campo de senha para capturar o pressionamento da tecla ENTER
        txtsenha.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnlogar.doClick(); // Simula um clique no botão "LOGAR"
                }
            }
        });

        // Adiciona um KeyListener ao campo de login para capturar o pressionamento da tecla ENTER
        txtusuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnlogar.doClick(); // Simula um clique no botão "LOGAR"
                }
            }
        });
    }
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        btnlogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtusuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(153, 153, 153));
        txtusuario.setText("CPF | Usuario");
        txtusuario.setToolTipText("");
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });

        txtsenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsenha.setForeground(new java.awt.Color(153, 153, 153));
        txtsenha.setText("Senha");
        txtsenha.setEchoChar('\u0000');
        txtsenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsenhaFocusLost(evt);
            }
        });

        btnlogar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnlogar.setText("LOGAR");
        btnlogar.setAlignmentY(0.0F);
        btnlogar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogar.setIconTextGap(0);
        btnlogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trancar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                    .addComponent(txtsenha)))))
                    .addComponent(btnlogar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogarActionPerformed
        String login = txtusuario.getText();
        String senha = new String(txtsenha.getPassword());

        // Cria uma instância de ConexaoBD e conecta ao banco de dados
        conexao_db conexao = new conexao_db();
        if (conexao.conectar()) {
            try (Connection conn = conexao.getConnection()) {
                // Busca o usuário pelo nome de usuário fornecido no campo de login
                Usuario usuario = Usuario.buscarUsuarioPorNome(conn, login);

                // Verifica se o usuário foi encontrado e se a senha está correta
                if (usuario == null || !usuario.getSenha().equals(senha)) {
                    JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.");
                } else {
                    // Define o usuário logado
                    Usuario.setUsuarioLogado(usuario);

                    String tipoUsuario = usuario.getTipoUsuario();
                    String mensagem = String.format("<html><span style='font-size:16px'>Olá %s, sua permissão é de %s. Seja bem-vindo!</span></html>", usuario.getNomeUsuario(), tipoUsuario);
                    JOptionPane.showMessageDialog(this, mensagem);

                    // Redireciona para a tela correta com base no tipo de usuário
                    this.dispose();
                    switch (tipoUsuario) {
                        case "Aluno":
                            Tela_aluno telaAluno = new Tela_aluno();
                            telaAluno.setVisible(true);
                            break;
                        case "Professor":
                            Tela_professor telaProfessor = new Tela_professor();
                            telaProfessor.setVisible(true);
                            break;
                        case "Coordenador":
                            Tela_coordenador telaCoordenador = new Tela_coordenador();
                            telaCoordenador.setVisible(true);
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Tipo de usuário não reconhecido. Acesso negado.");
                            break;
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro de conexão com o banco de dados.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco de dados.");
        }
         
    }//GEN-LAST:event_btnlogarActionPerformed

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
        if (txtusuario.getText().equals("CPF | Usuario")){
            txtusuario.setText(null);
            txtusuario.requestFocus();
        }
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtsenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsenhaFocusGained
        if (txtsenha.getText().equals("senha")){
            txtsenha.setText(null);
            txtsenha.requestFocus();
            txtsenha.setEchoChar('*');
        }
    }//GEN-LAST:event_txtsenhaFocusGained

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        if (txtusuario.getText().length()==0){
            txtusuario.setText("CPF | Usuario");
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtsenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsenhaFocusLost
        if (txtsenha.getText().length()==0){
            txtsenha.setText("Senha");
            txtsenha.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtsenhaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}