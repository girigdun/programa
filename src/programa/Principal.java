package programa;

import java.sql.SQLException;
import sql.conecta;

public class Principal {

    public static void main(String[] args) throws SQLException, Exception {
        conecta.conexao();
        Janela tela = new Janela();
        tela.setVisible(true);
    }
}
