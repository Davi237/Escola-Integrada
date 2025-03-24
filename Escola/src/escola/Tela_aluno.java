package escola;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Tela_aluno extends javax.swing.JFrame {

    public Tela_aluno() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHist = new javax.swing.JTable();
        cbxTrimestre = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();
        txtnomealuno = new javax.swing.JTextField();
        txtnomepai = new javax.swing.JTextField();
        txtnomemae = new javax.swing.JTextField();
        txtcpfaluno = new javax.swing.JTextField();
        txtdatanascimento = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCiencias = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGeo = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMat = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPort = new javax.swing.JTable();
        txtPortugues = new javax.swing.JTextField();
        txtGeografia = new javax.swing.JTextField();
        txtMatematica = new javax.swing.JTextField();
        txtCiencias = new javax.swing.JTextField();
        txtHistoria = new javax.swing.JTextField();
        lblaluno = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nota 1", "Nota 2", "Nota 3", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHist);

        cbxTrimestre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbxTrimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trimestre 1", "Trimestre 2", "Trimestre 3" }));

        btnSelecionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSelecionar.setText("SELECIONAR");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        txtnomealuno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnomealuno.setText("Nome do Aluno:");

        txtnomepai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnomepai.setText("Nome do pai:");

        txtnomemae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnomemae.setText("Nome da mãe:");

        txtcpfaluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcpfaluno.setText("CPF do Aluno:");

        txtdatanascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtdatanascimento.setText("Data de Nascimento:");

        txtTurma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTurma.setText("Turma:");

        tblCiencias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCiencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nota 1", "Nota 2", "Nota 3", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCiencias);

        tblGeo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nota 1", "Nota 2", "Nota 3", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblGeo);

        tblMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nota 1", "Nota 2", "Nota 3", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMat);

        tblPort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nota 1", "Nota 2", "Nota 3", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblPort);

        txtPortugues.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPortugues.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPortugues.setText("Português");

        txtGeografia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGeografia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGeografia.setText("Geografia");

        txtMatematica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMatematica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatematica.setText("Matemática");

        txtCiencias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCiencias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiencias.setText("Ciências");
        txtCiencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCienciasActionPerformed(evt);
            }
        });

        txtHistoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHistoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHistoria.setText("História");

        lblaluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblaluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login grande.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Página do Aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeografia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiencias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblaluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtnomealuno, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcpfaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)
                                .addComponent(btnSelecionar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnomealuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpfaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblaluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCiencias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeografia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHistoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPortugues, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCienciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCienciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCienciasActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
       // Obter o período selecionado na combobox
        int periodoSelecionado = cbxTrimestre.getSelectedIndex() + 1; // Trimestre 1 -> período 1, etc.

        // Conectar ao banco de dados
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Inicializar a conexão usando a classe conexao_db (assumindo que já tenha essa classe)
            conexao_db conexao = new conexao_db();
            conn = conexao.getConnection();
            
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.");
                return;
            }

            // Carregar as notas para cada disciplina e atualizar as tabelas
            carregarNotas(conn, "Ciencias", periodoSelecionado, tblCiencias);
            carregarNotas(conn, "Geografia", periodoSelecionado, tblGeo);
            carregarNotas(conn, "Historia", periodoSelecionado, tblHist);
            carregarNotas(conn, "Matematica", periodoSelecionado, tblMat);
            carregarNotas(conn, "Portugues", periodoSelecionado, tblPort);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar as notas: " + e.getMessage());
        } finally {
            // Fechar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para carregar as notas de uma disciplina específica e atualizar a tabela correspondente
    private void carregarNotas(Connection conn, String disciplina, int periodo, javax.swing.JTable tabela) throws SQLException {
        String sql = "SELECT nota1, nota2, nota3, (nota1 + nota2 + nota3) / 3 AS media FROM " + disciplina + " WHERE periodo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, periodo);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setRowCount(0); // Limpar a tabela antes de adicionar os novos dados

            // Populando a tabela com os resultados
            while (rs.next()) {
                double nota1 = rs.getDouble("nota1");
                double nota2 = rs.getDouble("nota2");
                double nota3 = rs.getDouble("nota3");
                double media = rs.getDouble("media");

                // Adicionar linha à tabela
                model.addRow(new Object[]{nota1, nota2, nota3, media});
            }
        }
      
    }//GEN-LAST:event_btnSelecionarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cbxTrimestre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblaluno;
    private javax.swing.JTable tblCiencias;
    private javax.swing.JTable tblGeo;
    private javax.swing.JTable tblHist;
    private javax.swing.JTable tblMat;
    private javax.swing.JTable tblPort;
    private javax.swing.JTextField txtCiencias;
    private javax.swing.JTextField txtGeografia;
    private javax.swing.JTextField txtHistoria;
    private javax.swing.JTextField txtMatematica;
    private javax.swing.JTextField txtPortugues;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtcpfaluno;
    private javax.swing.JTextField txtdatanascimento;
    private javax.swing.JTextField txtnomealuno;
    private javax.swing.JTextField txtnomemae;
    private javax.swing.JTextField txtnomepai;
    // End of variables declaration//GEN-END:variables
}
