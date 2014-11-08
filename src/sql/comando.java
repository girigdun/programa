/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Felipe
 */
public class comando {

    public static void insert(String insertNome) throws Exception {                              // metodo para inserir
        String sql = "INSERT INTO cliente(nome) VALUES (?)";                    // comando sql
        PreparedStatement pst = conecta.conector.prepareStatement(sql);          // usa o preparedstatement pois eu quero usar uma referencia que ira seguir atravez do caminho do conector
        pst.setString(1, insertNome);                                        //minha referencia (posicao,referencia)
        pst.execute();                                                           // executa                                       
        System.out.println("Nome inserido com sucesso.");                       //mensagem de suceso se conseguiu executar
        pst.close();                                                             // encerra a inserção
        System.out.println("comando Encerrado!");                               //mensagem de sucesso se conseguiu encerrar
    }

    public static void select(int selectId) throws Exception {                              // metodo para seleção
        String sql = "SELECT nome FROM cliente WHERE id = ?";                   // comando sql
        PreparedStatement pst = conecta.conector.prepareStatement(sql);          // usa o preparedstatement pois eu quero usar uma referencia que ira seguir atravez do caminho do conector
        pst.setInt(1, selectId);                                           //minha referencia (posicao,referencia)

        ResultSet rs = pst.executeQuery();                                       // resultset para recuperar os dados do banco que vao vir da consulta
        while (rs.next()) {                                                     //enquanto estiver executando

            String c_nome = rs.getString("nome");                               //variavel c_nome recebera o resultado do campo "nome".
            System.out.println("o Nome consultado é : " + c_nome);              //mensagem de resultado da consulta
        }
        pst.close();                                                             //encerra a consulta
        System.out.println("comando Encerrado!");                               //mensagem de sucesso se conseguiu encerrar
    }

    public static void update(String updateNome , int updateId) throws Exception {
    String sql = "UPDATE cliente SET nome=? WHERE id = ?";                  
        PreparedStatement pst = conecta.conector.prepareStatement(sql);
        pst.setInt(2, updateId);
        pst.setString(1, updateNome);
        pst.execute();
        System.out.println("Alteração feita com sucesso!");
        pst.close();
        System.out.println("comando Encerrado!");
    }
}
