/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.ClienteBD;
import sql.comando;
import sql.conecta;

/**
 *
 * @author Felipe
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLnome = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        JTFid = new javax.swing.JTextField();
        JBlimpar = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();
        JBsair = new javax.swing.JButton();
        JBpesquisa = new javax.swing.JButton();
        JBalterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLnome.setText("Nome");

        JLid.setText("ID");

        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JBlimpar.setText("LIMPAR");
        JBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimparActionPerformed(evt);
            }
        });

        JBsalvar.setText("SALVAR");
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        JBsair.setText("SAIR");
        JBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsairActionPerformed(evt);
            }
        });

        JBpesquisa.setText("Pesquisar");
        JBpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisaActionPerformed(evt);
            }
        });

        JBalterar.setText("Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnome)
                            .addComponent(JLid))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFnome)
                            .addComponent(JTFid, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(JBlimpar)
                        .addGap(18, 18, 18)
                        .addComponent(JBsalvar)
                        .addGap(28, 28, 28)
                        .addComponent(JBpesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(JBalterar)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBsair)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBlimpar)
                    .addComponent(JBsalvar)
                    .addComponent(JBpesquisa)
                    .addComponent(JBalterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(JBsair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsairActionPerformed
        try {
            // TODO add your handling code here:
            conecta.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_JBsairActionPerformed

    private void JBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimparActionPerformed
        // TODO add your handling code here:
        JTFnome.setText("");
        JTFid.setText("");
    }//GEN-LAST:event_JBlimparActionPerformed

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        // TODO add your handling code here:
        JTFid.setText("");
        ClienteBD cliente = new ClienteBD();
        cliente.setNome(JTFnome.getText());
        try {
            comando.insert(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisaActionPerformed
        // TODO add your handling code here:
        JTFnome.setText("");
        ClienteBD cliente = new ClienteBD();
        cliente.setId(Integer.parseInt(JTFid.getText()));
        try {
            comando.select(cliente);
            JTFnome.setText(cliente.getResultado());
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBpesquisaActionPerformed

    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        // TODO add your handling code here:
        ClienteBD cliente = new ClienteBD();
        cliente.setNome(JTFnome.getText());
        cliente.setId(Integer.parseInt(JTFid.getText()));
        try {
            comando.update(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBalterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBalterar;
    private javax.swing.JButton JBlimpar;
    private javax.swing.JButton JBpesquisa;
    private javax.swing.JButton JBsair;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnome;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnome;
    // End of variables declaration//GEN-END:variables
}
