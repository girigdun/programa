package programa;

import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.ClienteBD;
import sql.comando;
import sql.conecta;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLnome = new javax.swing.JLabel();
        JLid = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        JTFid = new javax.swing.JTextField();
        JBlimpar = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();
        JBsair = new javax.swing.JButton();
        JBalterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTtabela = new javax.swing.JTable();
        JBpesquisar = new javax.swing.JButton();
        JBimprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLnome.setText("Nome");

        JLid.setText("ID");

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

        JBalterar.setText("Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        JTtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ));
        jScrollPane1.setViewportView(JTtabela);

        JBpesquisar.setText("Pesquisar");
        JBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisarActionPerformed(evt);
            }
        });

        JBimprimir.setText("IMPRIMIR");
        JBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JBsair)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JLid)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JLnome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBimprimir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(JBlimpar)
                            .addGap(18, 18, 18)
                            .addComponent(JBsalvar)
                            .addGap(24, 24, 24)
                            .addComponent(JBpesquisar)
                            .addGap(18, 18, 18)
                            .addComponent(JBalterar))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnome)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBimprimir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBlimpar)
                    .addComponent(JBsalvar)
                    .addComponent(JBalterar)
                    .addComponent(JBpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsairActionPerformed
        try {
            conecta.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_JBsairActionPerformed

    private void JBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimparActionPerformed
        JTFnome.setText("");
        JTFid.setText("");
        if (JTtabela.isRowSelected(JTtabela.getSelectedRow())) {
            ((DefaultTableModel) JTtabela.getModel()).removeRow(JTtabela.getSelectedRow());
        } else {
            ((DefaultTableModel) JTtabela.getModel()).setRowCount(0);
        }
    }//GEN-LAST:event_JBlimparActionPerformed

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        JTFid.setText("");
        if (JTFnome.getText() == null || JTFnome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum Nome Inserido no campo!");
        } else {
            ClienteBD cliente = new ClienteBD();
            cliente.setNome(JTFnome.getText());
            try {
                comando.insert(cliente);
            } catch (Exception ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        ClienteBD cliente = new ClienteBD();
        cliente.setNome(JTFnome.getText());
        cliente.setId(Integer.parseInt(JTFid.getText()));
        try {
            comando.update(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBalterarActionPerformed

    private void JBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisarActionPerformed
        JTFnome.setText("");
        ClienteBD cliente = new ClienteBD();
        if (JTFid.getText() == null || JTFid.getText().trim().equals("")) {
            try {
                comando.relatorio(cliente);
            } catch (Exception ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                cliente.setId(Integer.parseInt(JTFid.getText()));
                comando.select(cliente);
                DefaultTableModel tabela = (DefaultTableModel) JTtabela.getModel();
                tabela.addRow(new String[]{cliente.getResultadoid(), cliente.getResultadonome()});
            } catch (Exception ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBpesquisarActionPerformed

    private void JBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBimprimirActionPerformed
        try {
            JTtabela.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBimprimirActionPerformed
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
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton JBimprimir;
    private javax.swing.JButton JBlimpar;
    private javax.swing.JButton JBpesquisar;
    private javax.swing.JButton JBsair;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnome;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnome;
    public static javax.swing.JTable JTtabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
