/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.SQLException;
import java.util.Scanner;
import sql.ClienteBD;
import sql.comando;
import sql.conecta;

/**
 *
 * @author Felipe
 */
public class Principal {

    public static void main(String[] args) throws SQLException, Exception {     
        Scanner sc = new Scanner(System.in);                                    
        conecta.conexao();                                                      
        ClienteBD cliente = new ClienteBD();
    
        System.out.println("Digite um nome de cliente");                        
        cliente.setNome(sc.next());                                             
        comando.insert(cliente);
        
        System.out.println("");
        
        System.out.println("Digite um ID para busca:");                         
        cliente.setId(sc.nextInt());                                            
        comando.select(cliente);                                        
        
        System.out.println("Digite o ID do cadastro para ser auterado");
        cliente.setId(sc.nextInt());
        System.out.println("Digite o novo valor do campo Nome:");
        cliente.setNome(sc.next());
        comando.update(cliente);
        
        System.out.println("Digite o ID do nome para deletar:");
        cliente.setId(sc.nextInt());
        comando.delete(cliente);
        
        conecta.desconecta();                                                 
    }
}
