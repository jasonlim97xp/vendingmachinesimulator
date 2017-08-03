/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Lee Boon Kong
 */
public class vmCustPanelEngine {
    database database;
    vmCustPanel custPanel;
    int currentBrand=0;
    int currentPrice=0;
    int totalAmount=0,temp10,temp20,temp50,temp100;
    int balance=0;
    
    //Constructor
    public vmCustPanelEngine(database database){
        this.database=database;
        int signal=0;
    }
    
    public void receiveSignal(int x){
        switch(x){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                if(database.getQuantity(x)==0){
                    break;
               } 
                else{
                    currentBrand=x;
                    currentPrice=database.getPrice(x);
                    totalAmount=0;
                   break;
                }
                case 20: //20 for terminate signal
                terminate();
                break;
        }
    }
    
    public void resetBalance(){
        balance=0;
    }
    
    //getters
    public int getTotalAmount(){
        return totalAmount;
    
    }
    
    public int checkAvailability(int x){
        return database.getQuantity(x);
    }
    
    public int checkPrice(int x){
        return database.getPrice(x);
    }
    
    public int getCurrentPrice(){
        return currentPrice;
    }
    
    public int getCurrentBrand(){
        return currentBrand;
    }
    
    //Functions
    public void terminate(){
        //dispense all temp10,temp20,temp50,temp100;
        balance=((temp10*10)+(temp20*20)+(temp50*50)+(temp100*100));
        temp10=0;
        temp20=0;
        temp50=0;
        temp100=0;
        currentBrand=0;
        currentPrice=0;
        totalAmount=0;
    }
    
/*    public int returnBalance(){
        if (totalAmount==currentPrice){
            return 0;
        }
        else{
            if((totalAmount-currentPrice)>=100){
                
            }
        }
    }*/
    
    public void receiveCoin(int x){
        totalAmount+=x;
        switch (x) {
            case 10:
                temp10++;
                break;
            case 20:
                temp20++;
                break;
            case 50:
                temp50++;
                break;
            case 100:
                temp100++;
            default:
                break;
        }
        
        if (totalAmount>=currentPrice){
            dispense(currentBrand);
            database.receiveTotalCoin(temp10,temp20,temp50,temp100);
            
            if(checkChange()==true){
                database.returnCoin(totalAmount-currentPrice); 
            }
        }
    }
    
    public int amount10(){
        return database.getCoin10();
    }

    public int amount20(){
        return database.getCoin20();
    }

    public int amount50(){
        return database.getCoin50();
    }

    public int amount100(){
        return database.getCoin100();
    }
    
    public boolean checkChange(){
        return database.checkCoin();
    }
    
    public void dispense(int x){
        database.ejectDrink(x);
    }
    
    public void reset(){
        temp10=0;
        temp20=0;
        temp50=0;
        temp100=0;
        currentBrand=0;
        currentPrice=0;
        totalAmount=0;
    }
}
