package vendingmachine;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class vmSimCP extends javax.swing.JFrame{
    
    long duration, start, end;
    int check = 0, seconds = 0;
    
    Timer time = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            seconds++;
            if(seconds<60)
                shutDown.setEnabled(false);
            else{
                shutDown.setEnabled(true);
                check = 0;
            }
        }
    };
            
    public void start(){
        time.scheduleAtFixedRate(task, 1000, 1000);
    }
    
    public vmSimCP(engine runtime) {
        initComponents();
        setVisible(true);
        this.runtime = runtime;
        endSimButton.setEnabled(false);
        shutDown.setEnabled(false);
        activateCPButton.setEnabled(false);
        activateMPButton.setEnabled(false);
        ActivateMSPButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        beginSimLabel = new javax.swing.JLabel();
        beginSimButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        endSimButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        shutDown = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        activateCPButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        activateMPButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ActivateMSPButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(402, 300));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIMULATOR CONTROL PANEL");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(7, 2, 15, 0));

        beginSimLabel.setText("Begin Simulation");
        jPanel2.add(beginSimLabel);

        beginSimButton.setText("Press");
        beginSimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginSimButtonActionPerformed(evt);
            }
        });
        jPanel2.add(beginSimButton);

        jLabel3.setText("End Simulation");
        jPanel2.add(jLabel3);

        endSimButton.setText("Press");
        endSimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endSimButtonActionPerformed(evt);
            }
        });
        jPanel2.add(endSimButton);

        jLabel2.setText("ShutDown");
        jPanel2.add(jLabel2);

        shutDown.setText("Press");
        shutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutDownActionPerformed(evt);
            }
        });
        jPanel2.add(shutDown);

        jLabel4.setText("Activate Customer Panel");
        jPanel2.add(jLabel4);

        activateCPButton.setText("Press");
        activateCPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateCPButtonActionPerformed(evt);
            }
        });
        jPanel2.add(activateCPButton);

        jLabel5.setText("Activate Maintainer Panel");
        jPanel2.add(jLabel5);

        activateMPButton.setText("Press");
        activateMPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateMPButtonActionPerformed(evt);
            }
        });
        jPanel2.add(activateMPButton);

        jLabel6.setText("Activate Machinery Simulator Panel");
        jPanel2.add(jLabel6);

        ActivateMSPButton.setText("Press");
        ActivateMSPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivateMSPButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ActivateMSPButton);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutDownActionPerformed
        // TODO add your handling code here:
        if(check == 0)
            check = 1;
        else{
            check = 0;
        }
        
    }//GEN-LAST:event_shutDownActionPerformed

    private void beginSimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginSimButtonActionPerformed
        // TODO add your handling code here:
        endSimButton.setEnabled(true);
        shutDown.setEnabled(true);
        activateCPButton.setEnabled(true);
        activateMPButton.setEnabled(true);
        ActivateMSPButton.setEnabled(true);
        
        if(check == 0)
            runtime.simulating=true;
        else{
            start();
        }
    }//GEN-LAST:event_beginSimButtonActionPerformed

    private void activateCPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateCPButtonActionPerformed
        // TODO add your handling code here:
        vmCustPanel custPanel = new vmCustPanel(runtime);
        custPanel.setVisible(true);
        activateMPButton.setEnabled(false);
        ActivateMSPButton.setEnabled(false);
    }//GEN-LAST:event_activateCPButtonActionPerformed

    private void endSimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endSimButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_endSimButtonActionPerformed

    private void activateMPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateMPButtonActionPerformed
        vmMainCP maintainerPanel = new vmMainCP(runtime);
        maintainerPanel.setVisible(true);
        activateCPButton.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_activateMPButtonActionPerformed

    private void ActivateMSPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivateMSPButtonActionPerformed
        // TODO add your handling code here:
        maintainer machinery = new maintainer(runtime);
        machinery.setVisible(true);
        activateCPButton.setEnabled(false);
    }//GEN-LAST:event_ActivateMSPButtonActionPerformed

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
            java.util.logging.Logger.getLogger(vmSimCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vmSimCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vmSimCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vmSimCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vmSimCP().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivateMSPButton;
    private javax.swing.JButton activateCPButton;
    private javax.swing.JButton activateMPButton;
    private javax.swing.JButton beginSimButton;
    private javax.swing.JLabel beginSimLabel;
    private javax.swing.JButton endSimButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton shutDown;
    // End of variables declaration//GEN-END:variables
    engine runtime;
    vmCustPanel custPanel;
    vmMainCP maintainerPanel;
    maintainer machinery;
}
