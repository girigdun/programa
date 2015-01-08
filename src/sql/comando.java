/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class comando {

    public static void insert(ClienteBD cliente) throws Exception {                              // metodo para inserir
        String sql = "INSERT INTO cliente(nome) VALUES (?)";                    // comando sql
        PreparedStatement pst = conecta.conector.prepareStatement(sql);          // usa o preparedstatement pois eu quero usar uma referencia que ira seguir atravez do caminho do conector
        pst.setString(1, cliente.getNome());                                        //minha referencia (posicao,referencia)
        pst.execute();                                                           // executa
        JOptionPane.showMessageDialog(null,"Nome inserido com sucesso.");
        //System.out.println("Nome inserido com sucesso.");                       //mensagem de suceso se conseguiu executar
        pst.close();                                                             // encerra a inserção
    }

    public static void select(ClienteBD cliente) throws Exception {                              // metodo para seleção
        String sql = "SELECT nome FROM cliente WHERE id = ?";                   // comando sql
        PreparedStatement pst = conecta.conector.prepareStatement(sql);          // usa o preparedstatement pois eu quero usar uma referencia que ira seguir atravez do caminho do conector
        pst.setInt(1, cliente.getId());                                           //minha referencia (posicao,referencia)

        ResultSet rs = pst.executeQuery();                                       // resultset para recuperar os dados do banco que vao vir da consulta
        while (rs.next()) {                                                     //enquanto estiver executando

            String c_nome = rs.getString("nome");                               //variavel c_nome recebera o resultado do campo "nome".
            cliente.setResultado("Nome consultado: " + c_nome);  
            //JOptionPane.showMessageDialog(null,"o Nome consultado é : " + c_nome);              //mensagem de resultado da consulta
            
        }
        pst.close();                                                             //encerra a consulta
    }

    public static void update(ClienteBD cliente) throws Exception {
        String sql = "UPDATE cliente SET nome=? WHERE id = ?";
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setInt(2, cliente.getId());
        pst.setString(1, cliente.getNome());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Alteração feita com sucesso!");
        //System.out.println("Alteração feita com sucesso!");
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
