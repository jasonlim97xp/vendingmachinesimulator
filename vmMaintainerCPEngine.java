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
public class vmMaintainerCPEngine {
    database database;
    vmMaintainerCP mainCP;
    int currentBrand=0;
    int currentPrice=0;
    int totalAmount=0,temp10,temp20,temp50,temp100;
    int balance=0;
    
    //Constructor
    public vmMaintainerCPEngine(database database){
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
    
    //Setter
    
    public void setInput(String x){
        database.setMaintainerPasswordInput(x);
    }
    
    public void changePrice(int j,int k){
        database.setPrice(j, k);
    }
    
    //getters
    public int getTotalAmount(){
        return totalAmount;
    }
    
    public int displayTotalCash(){
        return database.totalCash();
    }
    
    public int displayCoin(int x){
        return database.getCoin(x);
    }
    
    public String getPassword(){
        return database.getPassword();
    }
    
    public boolean validation(){
        return database.passwordValidation();
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
    
    
    public void dispense(int x){
        database.ejectDrink(x);
    }
}
