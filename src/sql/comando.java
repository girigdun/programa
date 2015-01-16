package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programa.Janela;

public class comando {

    public static void insert(ClienteBD cliente) throws Exception {
        String sql = "INSERT INTO cliente(nome) VALUES (?)";
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setString(1, cliente.getNome());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Nome inserido com sucesso.");
        pst.close();
    }

    public static void select(ClienteBD cliente) throws Exception {
        String sql = "SELECT id,nome FROM cliente WHERE id = ?";
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setInt(1, cliente.getId());
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            cliente.setResultadonome(rs.getString("nome"));
            cliente.setResultadoid("" + rs.getString("id"));
        }
        pst.close();
    }

    public static void relatorio(ClienteBD cliente) throws Exception {
        String max = "SELECT MAX(id) FROM cliente";
        String sql = "SELECT * FROM cliente";
        Statement pst = conecta.conector.createStatement();
        ResultSet rs = pst.executeQuery(max);
        rs.next();
        cliente.setTeste(rs.getInt(1));
        pst = conecta.conector.createStatement();
        rs = pst.executeQuery(sql);
        DefaultTableModel tabela = (DefaultTableModel) Janela.JTtabela.getModel();
        tabela.setRowCount(0);
        while (rs.next()) {
            cliente.setResultadonome(rs.getString("nome"));
            cliente.setResultadoid(rs.getString("id"));
            tabela.addRow(new String[]{cliente.getResultadoid(), cliente.getResultadonome()});
        }
        pst.close();
    }

    public static void update(ClienteBD cliente) throws Exception {
        String sql = "UPDATE cliente SET nome=? WHERE id = ?";
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setInt(2, cliente.getId());
        pst.setString(1, cliente.getNome());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
        pst.close();
    }

    public static void delete(ClienteBD cliente) throws Exception {
        String sql = "DELETE FROM cliente where id= ?";
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setInt(1, cliente.getId());
        pst.execute();
        System.out.println("Deleção feita com sucesso");
        pst.close();
    }
}
