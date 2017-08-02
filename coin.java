/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import javax.swing.JLabel;

/**
 *
 * @author Brandon-PC
 */
public class coin extends javax.swing.JFrame {

    /**
     * Creates new form coin
     * @param vmCustPanelEngine
     * @param totalVal
     * @param changeValue
     * @param eject
     */
    public coin(vmCustPanelEngine vmCustPanelEngine, JLabel totalVal,JLabel changeValue,JLabel eject,JLabel invalidLabel) {
        initComponents();
        this.vmCustPanelEngine=vmCustPanelEngine;
        this.totalVal=totalVal;
        this.changeValue=changeValue;
        this.eject=eject;
        this.invalidLabel=invalidLabel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        slugButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("10");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("20");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("50");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setText("100");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        slugButton.setText("Slug");
        slugButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slugButtonActionPerformed(evt);
            }
        });
        jPanel1.add(slugButton);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sendCoinSignal(10);
        invalidLabel.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sendCoinSignal(20);
        invalidLabel.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        sendCoinSignal(50);
        invalidLabel.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        sendCoinSignal(100);
        invalidLabel.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void slugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slugButtonActionPerformed
        // TODO add your handling code here:
        invalidLabel.setText("Invalid Coins");
    }//GEN-LAST:event_slugButtonActionPerformed
    
    public void sendCoinSignal(int x){
        vmCustPanelEngine.receiveCoin(x);
        totalVal.setText(Integer.toString(vmCustPanelEngine.getTotalAmount()));
        
        if(vmCustPanelEngine.totalAmount>=vmCustPanelEngine.currentPrice){
           totalVal.setText("0");
           changeValue.setText(Integer.toString(vmCustPanelEngine.getTotalAmount()-vmCustPanelEngine.getCurrentPrice()));
           eject.setText("Brand " + Integer.toString(vmCustPanelEngine.getCurrentBrand()+1));
           vmCustPanelEngine.reset();
           this.setVisible(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(coin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coin().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton slugButton;
    // End of variables declaration//GEN-END:variables
    vmCustPanelEngine vmCustPanelEngine;
    vmCustPanel custPanel;
    JLabel totalVal;
    JLabel changeValue;
    JLabel eject;
    JLabel invalidLabel;
}
