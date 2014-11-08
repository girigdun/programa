/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class conecta {

    static Connection conector;                                                 //objeto do tipo Connection chamado de conector

    public static void conexao() {                                              // metodo para conectar o banco

        String driver = "com.mysql.jdbc.Driver";                                //driver para conectar o jdbc ao mysql
        String url = "jdbc:mysql://localhost:3306/bd_programa";                 // url do endereço do meu banco
        String login = "root";                                                  // login para conectar ao banco
        String senha = "";                                                      // senha para conectar ao banco

        try {                                                                   //tente
            Class.forName(driver);                                              //inicializa a conexao
            conector = DriverManager.getConnection(url, login, senha);          // utilizando esses parametros
            System.out.println("Conexão Bem Sucedida!");                        // mensagem de sucesso
        } catch (Exception erro) {                                              // se nao...
            erro.printStackTrace();                                             //mostre o erro
        }
    }

    public static void desconecta() throws SQLException {                       // metodo para desconectar
        conector.close();                                                       // encerra o objeto conector que recebia o driver e os parametros de conexao
        System.out.println("Banco de Dados Desconectado!");                     // mensagem de sucesso
    }
}
