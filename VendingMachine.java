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
        
            /*database database= new database();
            vmCustPanelEngine vmCustPanelEngine=new vmCustPanelEngine(database);
            vmMaintainerCPEngine vmMaintainerCPEngine = new vmMaintainerCPEngine(database);
            vmMachineryCPEngine vmMachineryCPEngine = new vmMachineryCPEngine(database);
            vmCustPanel custPanel= new vmCustPanel(vmCustPanelEngine);
            vmMaintainerCP mainCP= new vmMaintainerCP(vmMaintainerCPEngine);
            vmMachineryCP machineryPanel = new vmMachineryCP (vmMachineryCPEngine);
            
            vmSimCP vmSimCP= new vmSimCP(custPanel,mainCP,machineryPanel);*/
            
            database database= new database();//Initiate Database
            
            vmCustPanelEngine vmCustPanelEngine=new vmCustPanelEngine(database);
            vmCustPanel custPanel= new vmCustPanel(vmCustPanelEngine);//Initiate custPanel Interface and Engine
            
            vmMachineryCPEngine vmMachineryCPEngine= new vmMachineryCPEngine(database);
            vmMachineryCP vmMachineryCP = new vmMachineryCP(vmMachineryCPEngine);//Initiate MachineryCP and Engine
            
            vmMaintainerCPEngine vmMaintainerCPEngine = new vmMaintainerCPEngine(database);
            vmMaintainerCP vmMaintainerCP = new vmMaintainerCP(vmMaintainerCPEngine);// Initiate MaintainerCP and Engine
            
            vmSimCP vmSimCP= new vmSimCP(custPanel,vmMaintainerCP,vmMachineryCP);
            
                           
        }
    public static void main(String[] args) {
        // TODO code application logic here
        new VendingMachine();
    }
}
