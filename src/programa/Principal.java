/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.SQLException;
import java.util.Scanner;
import sql.comando;
import sql.conecta;

/**
 *
 * @author Felipe
 */
public class Principal {

    public static String nome;                                                  //objeto do tipo String chamado : nome "campo nome do BD"
    public static int id;                                                     //objeto do tipo int chamado : b_id "busca do ID"

    public static void main(String[] args) throws SQLException, Exception {     //metodo principal
        Scanner sc = new Scanner(System.in);                                    // chamando Scanner
        conecta.conexao();                                                      // chamando metodo conexao da classe conecta do pacote sql
        
        System.out.println("Digite um nome de cliente");                        //mensagem para ação
        nome = sc.next();                                                       //captura do teclado o nome para ser inserido no bd
        comando.insert(nome);                                                       // chamando metodo insert da classe comando do pacote sql
        
        System.out.println("");
        
        System.out.println("Digite um ID para busca:");                         //mensagem para ação
        id = sc.nextInt();                                                    //captura do teclado o id para busca no bd
        comando.select(id);                                                       // chamando metodo select da classe comando do pacote sql
        
        System.out.println("Digite o ID do cadastro para ser auterado");
        id= sc.nextInt();
        System.out.println("Digite o novo valor do campo Nome:");
        nome = sc.next();
        comando.update(nome, id);
        
        conecta.desconecta();                                                   // chama o metodo desconecta da classe concta do pacote sql para finalizar a conexao
    }
}
