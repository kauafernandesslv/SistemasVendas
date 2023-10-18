/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.estado_civil;


import com.mycompany.dao.DaoEstado_civil;
import com.mycompany.ferramentas.Constantes;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModEstado_civil;
import javax.swing.JOptionPane;

/**
 *
 * @author kaua.1880
 */
public class CadEstado_civil extends javax.swing.JFrame {

    /**
     * Creates new form CadEstado_civil
     */
    public CadEstado_civil() {
        initComponents();
              if(!existeDadosTemporarios()){
                  DaoEstado_civil daoEstado_civil = new DaoEstado_civil();
                         

            int id = daoEstado_civil.buscarProximoId(); 
            if (id > 0)
                tfIdEstado_civil.setText(String.valueOf(id));
            
            btnAcao.setText(Constantes.BTN_SALVAR_TEXT);
            btnExcluir.setVisible(false);
        }else{
            btnAcao.setText(Constantes.BTN_ALTERAR_TEXT);
            btnExcluir.setVisible(true);
        }
        
        setLocationRelativeTo(null);
        
        tfIdEstado_civil.setEnabled(false);
    }
    
    private Boolean existeDadosTemporarios(){        
        if(DadosTemporarios.tempObject instanceof ModEstado_civil){
            int id = ((ModEstado_civil) DadosTemporarios.tempObject).getId();
            int idEstado = ((ModEstado_civil) DadosTemporarios.tempObject).getId();
            String nome = ((ModEstado_civil) DadosTemporarios.tempObject).getNome();
            
            tfIdEstado_civil.setText(String.valueOf(id));
            tfIdEstado_civil.setText(String.valueOf(idEstado));
            tfNome.setText(nome);
        
            DadosTemporarios.tempObject = null;
            
            return true;
        }else
            return false;
    }
   private void inserir(){
        DaoEstado_civil daoEstado_civil = new DaoEstado_civil();
        
        if (daoEstado_civil.inserir(Integer.parseInt(tfIdEstado_civil.getText()), tfNome.getText())){
            JOptionPane.showMessageDialog(null, "Estado civil salvo com sucesso!");
            
            tfIdEstado_civil.setText("");
            tfNome.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o Estado civil!");
        }
    }
    
    private void alterar(){
        DaoEstado_civil daoEstado_civil = new DaoEstado_civil();
        
        if (daoEstado_civil.alterar(Integer.parseInt(tfIdEstado_civil.getText()), tfNome.getText())){
            JOptionPane.showMessageDialog(null, "Estado civil alterada com sucesso!");
            
            tfIdEstado_civil.setText("");
            tfNome.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível alterar a estado civil!");
        }
        
        ((ListEstado_civil) Formularios.listEstado_civil).listarTodos();
        
        dispose();
    }
    
    private void excluir(){
        DaoEstado_civil daoEstado_civil = new DaoEstado_civil();
        
        if (daoEstado_civil.excluir(Integer.parseInt(tfIdEstado_civil.getText()))){
            JOptionPane.showMessageDialog(null, "Estado civil " + tfNome.getText() + " excluído com sucesso!");
            
            tfIdEstado_civil.setText("");
            tfNome.setText("");

        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Estado civil!");
        }
        
        ((ListEstado_civil) Formularios.listEstado_civil).listarTodos();
        
        dispose();
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfIdEstado_civil = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        btnAcao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("estado_civil");

        tfIdEstado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdEstado_civilActionPerformed(evt);
            }
        });

        btnAcao.setText("Salvar");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfIdEstado_civil)
            .addComponent(tfNome)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAcao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIdEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAcao))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int escolha =
        JOptionPane.showConfirmDialog(
            null,
            "Deseja  excluir esse estado civil? " + tfNome.getText() + "?");

        if(escolha == JOptionPane.YES_OPTION)
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tfIdEstado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdEstado_civilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdEstado_civilActionPerformed

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        // TODO add your handling code here:
        if (btnAcao.getText() == Constantes.BTN_SALVAR_TEXT)
        inserir();
        else if (btnAcao.getText() == Constantes.BTN_ALTERAR_TEXT)
        alterar();
    }//GEN-LAST:event_btnAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadEstado_civil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEstado_civil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEstado_civil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEstado_civil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEstado_civil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfIdEstado_civil;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
