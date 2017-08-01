package vendingmachine;

import java.awt.Color;

public class vmCustPanel extends javax.swing.JFrame {
    
    public vmCustPanel(vmCustPanelEngine vmCustPanelEngine) {
        initComponents();
        this.vmCustPanelEngine=vmCustPanelEngine;
        signal=0;
        updateAvailability();
        updatePrice();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalVal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        price0 = new javax.swing.JLabel();
        avai0 = new javax.swing.JLabel();
        brand0But = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        avai1 = new javax.swing.JLabel();
        brand1But = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        avai2 = new javax.swing.JLabel();
        brand2But = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        avai3 = new javax.swing.JLabel();
        brand3But = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        avai4 = new javax.swing.JLabel();
        brand4But = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        avai5 = new javax.swing.JLabel();
        brand5But = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();
        avai6 = new javax.swing.JLabel();
        brand6But = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        price7 = new javax.swing.JLabel();
        avai7 = new javax.swing.JLabel();
        brand7But = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        price8 = new javax.swing.JLabel();
        avai8 = new javax.swing.JLabel();
        brand8But = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        price9 = new javax.swing.JLabel();
        avai9 = new javax.swing.JLabel();
        brand9But = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        noChangeBox = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        changeValue = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        eject = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIMTO SOFT DRINKS DISPENSER");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 200));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jPanel3.setLayout(new java.awt.GridLayout(1, 5));

        jLabel5.setText("INSERT COIN HERE");
        jPanel3.add(jLabel5);

        jPanel2.add(jPanel3);

        jLabel2.setText("COINS NOT VALID");
        jPanel2.add(jLabel2);

        jLabel3.setText("TOTAL MONEY INSERTED");
        jPanel2.add(jLabel3);

        totalVal.setText("VALUE");
        jPanel2.add(totalVal);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(11, 4));

        jLabel6.setText("BRAND");
        jPanel4.add(jLabel6);

        jLabel7.setText("PRICE");
        jPanel4.add(jLabel7);

        jLabel10.setText("AVAILABILITY");
        jPanel4.add(jLabel10);

        jLabel8.setText("PRESS TO SELECT");
        jPanel4.add(jLabel8);

        jLabel9.setText("BRAND 1");
        jPanel4.add(jLabel9);
        jPanel4.add(price0);

        avai0.setText("NOT IN STOCK");
        jPanel4.add(avai0);

        brand0But.setText("PRESS");
        brand0But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand0ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand0But);

        jLabel11.setText("BRAND 2");
        jPanel4.add(jLabel11);
        jPanel4.add(price1);

        avai1.setText("NOT IN STOCK");
        jPanel4.add(avai1);

        brand1But.setText("PRESS");
        brand1But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand1ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand1But);

        jLabel13.setText("BRAND 3");
        jPanel4.add(jLabel13);
        jPanel4.add(price2);

        avai2.setText("NOT IN STOCK");
        jPanel4.add(avai2);

        brand2But.setText("PRESS");
        brand2But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand2ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand2But);

        jLabel15.setText("BRAND 4");
        jPanel4.add(jLabel15);
        jPanel4.add(price3);

        avai3.setText("NOT IN STOCK");
        jPanel4.add(avai3);

        brand3But.setText("PRESS");
        brand3But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand3ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand3But);

        jLabel17.setText("BRAND 5");
        jPanel4.add(jLabel17);
        jPanel4.add(price4);

        avai4.setText("NOT IN STOCK");
        jPanel4.add(avai4);

        brand4But.setText("PRESS");
        brand4But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand4ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand4But);

        jLabel19.setText("BRAND 6");
        jPanel4.add(jLabel19);
        jPanel4.add(price5);

        avai5.setText("NOT IN STOCK");
        jPanel4.add(avai5);

        brand5But.setText("PRESS");
        brand5But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand5ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand5But);

        jLabel21.setText("BRAND 7");
        jPanel4.add(jLabel21);
        jPanel4.add(price6);

        avai6.setText("NOT IN STOCK");
        jPanel4.add(avai6);

        brand6But.setText("PRESS");
        brand6But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand6ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand6But);

        jLabel23.setText("BRAND 8");
        jPanel4.add(jLabel23);
        jPanel4.add(price7);

        avai7.setText("NOT IN STOCK");
        jPanel4.add(avai7);

        brand7But.setText("PRESS");
        brand7But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand7ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand7But);

        jLabel25.setText("BRAND 9");
        jPanel4.add(jLabel25);
        jPanel4.add(price8);

        avai8.setText("NOT IN STOCK");
        jPanel4.add(avai8);

        brand8But.setText("PRESS");
        brand8But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand8ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand8But);

        jLabel27.setText("BRAND 9");
        jPanel4.add(jLabel27);
        jPanel4.add(price9);

        avai9.setText("NOT IN STOCK");
        jPanel4.add(avai9);

        brand9But.setText("PRESS");
        brand9But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand9ButActionPerformed(evt);
            }
        });
        jPanel4.add(brand9But);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridLayout(3, 1));

        noChangeBox.setBackground(new java.awt.Color(244, 66, 66));
        noChangeBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noChangeBox.setText("NO CHANGE AVAILABLE");
        noChangeBox.setMaximumSize(new java.awt.Dimension(65, 14));
        noChangeBox.setMinimumSize(new java.awt.Dimension(65, 14));
        jPanel5.add(noChangeBox);

        jPanel6.setLayout(new java.awt.GridLayout(2, 2));

        jLabel30.setText("PRESS TO RETURN CASH AND TERMINATE");
        jPanel6.add(jLabel30);

        jButton15.setText("PRESS");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15);

        jLabel31.setText("COLLECT CHANGE");
        jPanel6.add(jLabel31);

        changeValue.setText("VALUE");
        jPanel6.add(changeValue);

        jPanel5.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jLabel33.setText("COLLECT CAN");
        jPanel7.add(jLabel33);

        eject.setText("BRAND NAME");
        jPanel7.add(eject);

        jPanel5.add(jPanel7);

        jPanel1.add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void brand5ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand5ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(5)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(5);
        }
    }//GEN-LAST:event_brand5ButActionPerformed

    private void brand7ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand7ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(7)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(7);
        }
    }//GEN-LAST:event_brand7ButActionPerformed

    private void brand0ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand0ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(0)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(0);
        }
    }//GEN-LAST:event_brand0ButActionPerformed

    private void brand1ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand1ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(1)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(1);
        }
    }//GEN-LAST:event_brand1ButActionPerformed

    private void brand2ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand2ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(2)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(2);
        }      
    }//GEN-LAST:event_brand2ButActionPerformed

    private void brand3ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand3ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(3)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(3);
        }     
    }//GEN-LAST:event_brand3ButActionPerformed

    private void brand4ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand4ButActionPerformed
        // TODO add your handling code here:   
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(4)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(4);
        }       
    }//GEN-LAST:event_brand4ButActionPerformed

    private void brand6ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand6ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(6)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(6);
        }     
    }//GEN-LAST:event_brand6ButActionPerformed

    private void brand8ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand8ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(8)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(8);
        }
    }//GEN-LAST:event_brand8ButActionPerformed

    private void brand9ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand9ButActionPerformed
        // TODO add your handling code here:
        changeValue.setText("0");
        updateAvailability();
        if(vmCustPanelEngine.checkAvailability(9)==0){
            
        } 
        else {
            coin coin= new coin(vmCustPanelEngine,totalVal,changeValue,eject);
            coin.setVisible(true);
            sendSignal(9);
        }     
    }//GEN-LAST:event_brand9ButActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        sendSignal(20);
        updateAvailability();
        changeValue.setText(Integer.toString(vmCustPanelEngine.balance));
        vmCustPanelEngine.resetBalance();
    }//GEN-LAST:event_jButton15ActionPerformed

    
    public void sendSignal(int x){
        vmCustPanelEngine.receiveSignal(x);
    }
    
    
    public void updateAvailability(){
        for(int i=0;i<10;i++){
            if(vmCustPanelEngine.checkAvailability(i)==0){
                switch(i){
                    case 0:
                        avai0.setForeground(Color.green);
                        break;
                    case 1:
                        avai1.setForeground(Color.green);
                        break;
                    case 2:
                        avai2.setForeground(Color.green);
                        break;
                    case 3:
                        avai3.setForeground(Color.green);
                        break;
                    case 4:
                        avai4.setForeground(Color.green);
                        break;
                    case 5:
                        avai5.setForeground(Color.green);
                        break;
                    case 6:
                        avai6.setForeground(Color.green);
                        break;
                    case 7:
                        avai7.setForeground(Color.green);
                        break;
                    case 8:
                        avai8.setForeground(Color.green);
                        break;
                    case 9:
                        avai9.setForeground(Color.green);
                        break;
                    default:
                }
            }else{
                switch(i){
                    case 0:
                        avai0.setForeground(Color.black);
                        break;
                    case 1:
                        avai1.setForeground(Color.black);
                        break;
                    case 2:
                        avai2.setForeground(Color.black);
                        break;
                    case 3:
                        avai3.setForeground(Color.black);
                        break;
                    case 4:
                        avai4.setForeground(Color.black);
                        break;
                    case 5:
                        avai5.setForeground(Color.black);
                        break;
                    case 6:
                        avai6.setForeground(Color.black);
                        break;
                    case 7:
                        avai7.setForeground(Color.black);
                        break;
                    case 8:
                        avai8.setForeground(Color.black);
                        break;
                    case 9:
                        avai9.setForeground(Color.black);
                        break;
                    default:
                }
            }
        }
    }
    
    public void updatePrice(){
        for(int i=0;i<10;i++){
                switch(i){
                    case 0:
                        price0.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 1:
                        price1.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 2:
                        price2.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 3:
                        price3.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 4:
                        price4.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 5:
                        price5.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 6:
                        price6.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 7:
                        price7.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 8:
                        price8.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    case 9:
                        price9.setText(Integer.toString(vmCustPanelEngine.checkPrice(i)));
                        break;
                    default:
                        break;
                }
        }
    }
    
 /*   private void eject(){
            if (currentPrice==0){
                return;
            }
            if ((runtime.getTotalAmount() == currentPrice) || (runtime.getTotalAmount()>=currentPrice)){
                updateAvailability();
                runtime.canDeduction(currentBrand);
                eject.setText("Brand " + Integer.toString(currentBrand));
                //Assign the change left to dispense to tempVal var
                tempVal = runtime.getTotalAmount()-currentPrice;
                change=tempVal;
               //changeValue.setText(runtime.getTotalAmount()-currentPrice+"c");
                runtime.setTotalAmount(0);
                
                //Start from here, these codes determine if there are enough coin to be dispensed.
                
                
                while (tempVal>=50&&runtime.get50c()!=0){
                    //The tempVal(change) will be deducted by 50c if 50c coin present. sama sampai bawah
                    tempVal=tempVal-50;
                    runtime.coinDeduction(50);
                }
                
                while (tempVal>=20&&runtime.get20c()!=0){
                    tempVal=tempVal-20;
                    runtime.coinDeduction(20);
                }
                
                while (tempVal>=10&&runtime.get10c()!=0){
                    tempVal=tempVal-10;
                    runtime.coinDeduction(10);
                }
                
                //If tempVal sama dgn change, meaning no coin present in the machine. xde balance
                if (tempVal==change){
                    noChangeBox.setForeground(Color.red);
                    
                }else if (tempVal!=0){//This case if coin tak cukup. TempVal(coin left to dispence)!= means tak cukup coin nak bagi balance. pending for unsufficient coin indicator
                     noChangeBox.setForeground(Color.red);
                    //changeValue.setText(Integer.toString((runtime.getTotalAmount()-currentPrice)-tempVal)+"c");
                }else{
                    changeValue.setText(Integer.toString(change)+"c");
                }
                
                
            }
            
            
    }*/
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
            java.util.logging.Logger.getLogger(vmCustPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vmCustPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vmCustPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vmCustPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vmCustPanel().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avai0;
    private javax.swing.JLabel avai1;
    private javax.swing.JLabel avai2;
    private javax.swing.JLabel avai3;
    private javax.swing.JLabel avai4;
    private javax.swing.JLabel avai5;
    private javax.swing.JLabel avai6;
    private javax.swing.JLabel avai7;
    private javax.swing.JLabel avai8;
    private javax.swing.JLabel avai9;
    private javax.swing.JButton brand0But;
    private javax.swing.JButton brand1But;
    private javax.swing.JButton brand2But;
    private javax.swing.JButton brand3But;
    private javax.swing.JButton brand4But;
    private javax.swing.JButton brand5But;
    private javax.swing.JButton brand6But;
    private javax.swing.JButton brand7But;
    private javax.swing.JButton brand8But;
    private javax.swing.JButton brand9But;
    private javax.swing.JLabel changeValue;
    private javax.swing.JLabel eject;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel noChangeBox;
    private javax.swing.JLabel price0;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    private javax.swing.JLabel price7;
    private javax.swing.JLabel price8;
    private javax.swing.JLabel price9;
    private javax.swing.JLabel totalVal;
    // End of variables declaration//GEN-END:variables
    database database;
    vmCustPanelEngine vmCustPanelEngine;
    vmCustPanel vmCustPanel;
    int signal;
    int coinSignal;
}
