package vendingmachine;
public class VendingMachine {


        public VendingMachine()
        {
                //<editor-fold defaultstate="collapsed" desc="Style look and feel">
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
               engine runtime = new engine();
               vmSimCP simCP = new vmSimCP(runtime);
               
               simCP.setVisible(true);
               for (int i=0;i<10;i++){
                   runtime.brand[i]=i;
                   //runtime.price[i]=i;
               }
               runtime.price[1]=100;
               runtime.price[2]=150;
               runtime.price[3]=200;
               runtime.price[4]=250;
               runtime.price[5]=180;
               runtime.price[6]=90;
               runtime.price[7]=130;
               runtime.price[8]=300;
               runtime.price[9]=240;
               runtime.price[0]=210;
               
        }
    public static void main(String[] args) {
        // TODO code application logic here
        new VendingMachine();
    }
}
