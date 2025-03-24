package escola;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao_db {
    private Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/colegioPI";
    private static final String USER = "root";
    private static final String PASSWORD = "senha1234";

    // Método para conectar ao banco de dados
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(true); // Habilita o commit automático
            System.out.println("Banco conectado com sucesso");
            return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não está disponível para acesso ou não existe");
            return false;
        } catch (SQLException ex) {
            System.out.println("Erro na conexão com o banco de dados: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    // Método para retornar a conexão
    public Connection getConnection() {
        if (conn == null || !isConnectionValid()) {
            if (!conectar()) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return null; // Retorna null se a conexão falhar
            }
        }
        return conn;
    }

    // Método para verificar se a conexão está válida
    private boolean isConnectionValid() {
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            return false; // Se houver uma exceção, considera que a conexão não é válida
        }
    }

    // Método principal para teste de conexão
    public static void main(String[] args) {
        conexao_db conexao = new conexao_db();
        if (conexao.conectar()) {
            // Inicializa a interface gráfica após garantir que o banco está acessível
            SwingUtilities.invokeLater(() -> {
                // Inicializa a Tela_inicial
                Tela_inicial telaInicial = new Tela_inicial(); // Instancia a tela inicial
                telaInicial.setVisible(true); // Torna a tela visível
                JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
            });
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados. A aplicação será encerrada.");
            System.exit(0);
        }
    }
}
        

