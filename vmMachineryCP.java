
package vendingmachine;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;

public final class vmMachineryCP extends javax.swing.JFrame{
    int[] inputtext = new int[10];
    private int close = 0;
    public vmMachineryCP(vmMachineryCPEngine vmMachineryCPEngine) {
        initComponents();
        this.vmMachineryCPEngine = vmMachineryCPEngine;

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close=1;
            }
        });
        
    BD1Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
        
        if("".equals((String) BD1Text.getText())) inputtext[0]=0;
        else
            try{
                if(Integer.parseInt((String) BD1Text.getText()) > 20){
                    if(unlock==1)
                    BD1Text.setText(Integer.toString(inputtext[0]));
                }
                else{
                    if(unlock==1){
                        inputtext[0] = Integer.parseInt((String) BD1Text.getText());
                        vmMachineryCPEngine.setQuantity(0,inputtext[0]);
                        BD1Text.setText(Integer.toString(inputtext[0]));
                    }else{
                        BD1Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
    BD2Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD2Text.getText())) inputtext[1]=0;
        else
            try{
                if(Integer.parseInt((String) BD2Text.getText()) > 20){
                    if(unlock==1)
                    BD2Text.setText(Integer.toString(inputtext[1]));
                }
                else{
                    if(unlock==1){
                        inputtext[1] = Integer.parseInt((String) BD2Text.getText());
                        vmMachineryCPEngine.setQuantity(1,inputtext[1]);
                        BD2Text.setText(Integer.toString(inputtext[1]));
                    }else{
                        BD2Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
    BD3Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
        if("".equals((String) BD3Text.getText())) inputtext[2]=0;
        else
            try{
                if(Integer.parseInt((String) BD3Text.getText()) > 20){
                    if(unlock==1)
                        BD3Text.setText(Integer.toString(inputtext[2]));
                }
                else{
                    if(unlock==1){
                        inputtext[2] = Integer.parseInt((String) BD3Text.getText());
                        vmMachineryCPEngine.setQuantity(2,inputtext[2]);
                        BD3Text.setText(Integer.toString(inputtext[2]));
                    }else{
                        BD3Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
     BD4Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD4Text.getText())) inputtext[3]=0;
        else
            try{
                if(Integer.parseInt((String) BD4Text.getText()) > 20){
                    if(unlock==1)
                        BD4Text.setText(Integer.toString(inputtext[3]));
                }
                else{
                    if(unlock==1){
                        inputtext[3] = Integer.parseInt((String) BD4Text.getText());
                        vmMachineryCPEngine.setQuantity(3,inputtext[3]);
                        BD4Text.setText(Integer.toString(inputtext[3]));
                    }else{
                        BD4Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
}); 
     BD5Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD5Text.getText())) inputtext[4]=0;
        else
            try{
                if(Integer.parseInt((String) BD5Text.getText()) > 20){
                    if(unlock==1)
                    BD5Text.setText(Integer.toString(inputtext[4]));
                }
                else{
                    if(unlock==1){
                        inputtext[4] = Integer.parseInt((String) BD5Text.getText());
                        vmMachineryCPEngine.setQuantity(4,inputtext[4]);
                        BD5Text.setText(Integer.toString(inputtext[4]));
                    }else{
                        BD5Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});

     BD6Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD6Text.getText())) inputtext[5]=0;
        else
            try{
                if(Integer.parseInt((String) BD6Text.getText()) > 20){
                    if(unlock==1)
                        BD6Text.setText(Integer.toString(inputtext[5]));
                }
                else{
                    if(unlock==1){
                        inputtext[5] = Integer.parseInt((String) BD6Text.getText());
                        vmMachineryCPEngine.setQuantity(5,inputtext[5]);
                        BD6Text.setText(Integer.toString(inputtext[5]));
                    }else{
                        BD6Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
    BD7Text.getDocument().addDocumentListener(new DocumentListener(){
            @Override
                public void insertUpdate(DocumentEvent e){
                    Status();
                }

                @Override
                public void removeUpdate(DocumentEvent e){
                    Status();
                }

                @Override
                public void changedUpdate(DocumentEvent e){
                    Status();
                }

        public void Status(){
                    if("".equals((String) BD7Text.getText())) inputtext[6]=0;
        else
            try{
                if(Integer.parseInt((String) BD7Text.getText()) > 20){
                    if(unlock==1)
                        BD7Text.setText(Integer.toString(inputtext[6]));
                }
                else{
                    if(unlock==1){
                    inputtext[6] = Integer.parseInt((String) BD1Text.getText());
                    vmMachineryCPEngine.setQuantity(6,inputtext[6]);
                    BD7Text.setText(Integer.toString(inputtext[6]));
                    }else{
                        BD7Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
        }

    });
    BD8Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD8Text.getText())) inputtext[7]=0;
        else
            try{
                if(Integer.parseInt((String) BD8Text.getText()) > 20){
                    if(unlock==1)
                        BD8Text.setText(Integer.toString(inputtext[7]));
                }
                else{
                    if(unlock==1){
                        inputtext[7] = Integer.parseInt((String) BD8Text.getText());
                        vmMachineryCPEngine.setQuantity(7,inputtext[7]);
                        BD8Text.setText(Integer.toString(inputtext[7]));
                        }else{
                        BD8Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
    BD9Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD9Text.getText())) inputtext[8]=0;
        else
            try{
                if(Integer.parseInt((String) BD9Text.getText()) > 20){
                    if(unlock==1)
                        BD9Text.setText(Integer.toString(inputtext[8]));
                }
                else{
                    if(unlock==1){
                    inputtext[8] = Integer.parseInt((String) BD1Text.getText());
                    vmMachineryCPEngine.setQuantity(8,inputtext[8]);
                    BD9Text.setText(Integer.toString(inputtext[8]));
                    }else{
                        BD9Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
});
    BD10Text.getDocument().addDocumentListener(new DocumentListener(){
        @Override
            public void insertUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                Status();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e){
                Status();
            }
            
    public void Status(){
                if("".equals((String) BD10Text.getText())) inputtext[9]=0;
        else
            try{
                if(Integer.parseInt((String) BD10Text.getText()) > 20){
                    if(unlock==1)
                        BD10Text.setText(Integer.toString(inputtext[9]));
                }
                else{
                    if(unlock==1){
                    inputtext[9] = Integer.parseInt((String) BD10Text.getText());
                    vmMachineryCPEngine.setQuantity(9,inputtext[9]);
                    BD10Text.setText(Integer.toString(inputtext[9]));
                    }else{
                        BD10Text.setText("");
                    }
                    }
                
            }
            catch(Exception ex){
                
            }
    }
    
    
    
});
      
}
    
    public int getClose(){
        return close;
    }
    
    public void setClose(int close){
        this.close = close;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        MSCPanel = new javax.swing.JPanel();
        MSCTitle = new javax.swing.JLabel();
        PanelPart = new javax.swing.JPanel();
        DisplayBValue = new javax.swing.JLabel();
        DisplayCValue = new javax.swing.JLabel();
        CoinPanel = new javax.swing.JPanel();
        N10Coin = new javax.swing.JLabel();
        Coin10Label = new javax.swing.JLabel();
        N20Coin = new javax.swing.JLabel();
        Coin20Label = new javax.swing.JLabel();
        N50Coin = new javax.swing.JLabel();
        Coin50Label = new javax.swing.JLabel();
        N100Coin = new javax.swing.JLabel();
        Coin100Label = new javax.swing.JLabel();
        StatusPanel = new javax.swing.JPanel();
        StatusLabel = new javax.swing.JLabel();
        LockedLabel = new javax.swing.JLabel();
        UnlockedLabel = new javax.swing.JLabel();
        Status2Label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BrandPanel = new javax.swing.JPanel();
        B1Panel = new javax.swing.JLabel();
        BD1Text = new javax.swing.JTextField();
        B2Panel = new javax.swing.JLabel();
        BD2Text = new javax.swing.JTextField();
        B3Panel = new javax.swing.JLabel();
        BD3Text = new javax.swing.JTextField();
        B4Panel = new javax.swing.JLabel();
        BD4Text = new javax.swing.JTextField();
        B5Panel = new javax.swing.JLabel();
        BD5Text = new javax.swing.JTextField();
        B6Panel = new javax.swing.JLabel();
        BD6Text = new javax.swing.JTextField();
        B7Panel = new javax.swing.JLabel();
        BD7Text = new javax.swing.JTextField();
        B8Panel = new javax.swing.JLabel();
        BD8Text = new javax.swing.JTextField();
        B9Panel = new javax.swing.JLabel();
        BD9Text = new javax.swing.JTextField();
        B10Panel = new javax.swing.JLabel();
        BD10Text = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(600, 750));

        MSCPanel.setLayout(new java.awt.BorderLayout());

        MSCTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSCTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MSCTitle.setText("MACHINERY SIMULATION CONTROL PANEL");
        MSCTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MSCPanel.add(MSCTitle, java.awt.BorderLayout.PAGE_START);

        DisplayBValue.setText("DISPLAY/ENTER NEW VALUE");

        DisplayCValue.setText("DISPLAY/ENTER NEW VALUE");

        CoinPanel.setLayout(new java.awt.GridLayout(4, 2));

        N10Coin.setText("NUMBER OF 10c COINS ");
        CoinPanel.add(N10Coin);
        CoinPanel.add(Coin10Label);

        N20Coin.setText("NUMBER OF 20c COINS ");
        CoinPanel.add(N20Coin);
        CoinPanel.add(Coin20Label);

        N50Coin.setText("NUMBER OF 50c COINS");
        CoinPanel.add(N50Coin);
        CoinPanel.add(Coin50Label);

        N100Coin.setText("NUMBER OF 100c COINS");
        CoinPanel.add(N100Coin);
        CoinPanel.add(Coin100Label);

        StatusPanel.setLayout(new java.awt.GridLayout(2, 3));

        StatusLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        StatusLabel.setText("STATUS OF VENDING MACHINE");
        StatusPanel.add(StatusLabel);

        LockedLabel.setText("LOCKED ");
        StatusPanel.add(LockedLabel);

        UnlockedLabel.setText("UNLOCKED");
        StatusPanel.add(UnlockedLabel);

        Status2Label.setText("DOOR LOCK(change status if req)");
        StatusPanel.add(Status2Label);
        StatusPanel.add(jLabel13);

        BrandPanel.setLayout(new java.awt.GridLayout(10, 2));

        B1Panel.setText("NUMBER OF DRINKS CANS BRAND 1");
        BrandPanel.add(B1Panel);

        BD1Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD1TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD1Text);

        B2Panel.setText("NUMBER OF DRINKS CANS BRAND 2");
        BrandPanel.add(B2Panel);

        BD2Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD2TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD2Text);

        B3Panel.setText("NUMBER OF DRINKS CANS BRAND 3");
        BrandPanel.add(B3Panel);

        BD3Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD3TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD3Text);

        B4Panel.setText("NUMBER OF DRINKS CANS BRAND 4");
        BrandPanel.add(B4Panel);

        BD4Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD4TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD4Text);

        B5Panel.setText("NUMBER OF DRINKS CANS BRAND 5");
        BrandPanel.add(B5Panel);

        BD5Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD5TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD5Text);

        B6Panel.setText("NUMBER OF DRINKS CANS BRAND 6");
        BrandPanel.add(B6Panel);

        BD6Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD6TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD6Text);

        B7Panel.setText("NUMBER OF DRINKS CANS BRAND 7");
        BrandPanel.add(B7Panel);

        BD7Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD7TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD7Text);

        B8Panel.setText("NUMBER OF DRINKS CANS BRAND 8");
        BrandPanel.add(B8Panel);

        BD8Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD8TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD8Text);

        B9Panel.setText("NUMBER OF DRINKS CANS BRAND 9");
        BrandPanel.add(B9Panel);

        BD9Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD9TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD9Text);

        B10Panel.setText("NUMBER OF DRINKS CANS BRAND 10");
        BrandPanel.add(B10Panel);

        BD10Text.setMinimumSize(new java.awt.Dimension(8, 20));
        BD10Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BD10TextKeyTyped(evt);
            }
        });
        BrandPanel.add(BD10Text);

        javax.swing.GroupLayout PanelPartLayout = new javax.swing.GroupLayout(PanelPart);
        PanelPart.setLayout(PanelPartLayout);
        PanelPartLayout.setHorizontalGroup(
            PanelPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartLayout.createSequentialGroup()
                .addComponent(CoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
            .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DisplayBValue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BrandPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DisplayCValue, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPartLayout.setVerticalGroup(
            PanelPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(DisplayBValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayCValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        MSCPanel.add(PanelPart, java.awt.BorderLayout.CENTER);

        getContentPane().add(MSCPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BD1TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD1TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
            return;
        }
        
        try{
            inputtext[0] = Integer.parseInt((String)BD1Text.getText());
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_BD1TextKeyTyped

    private void BD2TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD2TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD2TextKeyTyped

    private void BD3TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD3TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD3TextKeyTyped

    private void BD4TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD4TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD4TextKeyTyped

    private void BD5TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD5TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD5TextKeyTyped

    private void BD6TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD6TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD6TextKeyTyped

    private void BD7TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD7TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD7TextKeyTyped

    private void BD8TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD8TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD8TextKeyTyped

    private void BD9TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD9TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD9TextKeyTyped

    private void BD10TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BD10TextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_BD10TextKeyTyped

    public void updateValidation(){
            if(vmMachineryCPEngine.validation()==true){
                        UnlockedLabel.setForeground(Color.green);
                        LockedLabel.setForeground(Color.black);
                        unlock=1;

                }
            else{
                        UnlockedLabel.setForeground(Color.black);
                        LockedLabel.setForeground(Color.green);
                        unlock=0;

            }
        
    }
     
    
    public void refreshPanel(){
        updateValidation();
        if(unlock==1){
            displayDrink();
            displayCoin();
            
        }
            
        
    }
        
    public void displayDrink(){
        BD1Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(0)));
        BD2Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(1)));
        BD3Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(2)));
        BD4Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(3)));
        BD5Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(4)));
        BD6Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(5)));
        BD7Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(6)));
        BD8Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(7)));
        BD9Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(8)));
        BD10Text.setText(Integer.toString(vmMachineryCPEngine.displayQuantity(9)));
    }
   
    public void displayCoin(){
        Coin10Label.setText(Integer.toString(vmMachineryCPEngine.displayCoin(10)));
        Coin20Label.setText(Integer.toString(vmMachineryCPEngine.displayCoin(20)));
        Coin50Label.setText(Integer.toString(vmMachineryCPEngine.displayCoin(50)));
        Coin100Label.setText(Integer.toString(vmMachineryCPEngine.displayCoin(100)));
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B10Panel;
    private javax.swing.JLabel B1Panel;
    private javax.swing.JLabel B2Panel;
    private javax.swing.JLabel B3Panel;
    private javax.swing.JLabel B4Panel;
    private javax.swing.JLabel B5Panel;
    private javax.swing.JLabel B6Panel;
    private javax.swing.JLabel B7Panel;
    private javax.swing.JLabel B8Panel;
    private javax.swing.JLabel B9Panel;
    private javax.swing.JTextField BD10Text;
    private javax.swing.JTextField BD1Text;
    private javax.swing.JTextField BD2Text;
    private javax.swing.JTextField BD3Text;
    private javax.swing.JTextField BD4Text;
    private javax.swing.JTextField BD5Text;
    private javax.swing.JTextField BD6Text;
    private javax.swing.JTextField BD7Text;
    private javax.swing.JTextField BD8Text;
    private javax.swing.JTextField BD9Text;
    private javax.swing.JPanel BrandPanel;
    private javax.swing.JLabel Coin100Label;
    private javax.swing.JLabel Coin10Label;
    private javax.swing.JLabel Coin20Label;
    private javax.swing.JLabel Coin50Label;
    private javax.swing.JPanel CoinPanel;
    private javax.swing.JLabel DisplayBValue;
    private javax.swing.JLabel DisplayCValue;
    private javax.swing.JLabel LockedLabel;
    private javax.swing.JPanel MSCPanel;
    private javax.swing.JLabel MSCTitle;
    private javax.swing.JLabel N100Coin;
    private javax.swing.JLabel N10Coin;
    private javax.swing.JLabel N20Coin;
    private javax.swing.JLabel N50Coin;
    private javax.swing.JPanel PanelPart;
    private javax.swing.JLabel Status2Label;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JLabel UnlockedLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    database database;
    int unlock=0;
    vmMachineryCPEngine vmMachineryCPEngine;
    
    
}
