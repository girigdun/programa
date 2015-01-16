package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conecta {

    static Connection conector;

    public static void conexao() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bd_programa";
        String login = "root";
        String senha = "";
        try {
            Class.forName(driver);
            conector = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexão Bem Sucedida!");
        } catch (ClassNotFoundException | SQLException erro) {
        }
    }

    public static void desconecta() throws SQLException {
        conector.close();
        System.out.println("Banco de Dados Desconectado!");
    }
}
