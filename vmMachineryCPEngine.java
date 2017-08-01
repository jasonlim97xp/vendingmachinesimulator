/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author afiq1
 */
public class vmMachineryCPEngine {
    database database;
    vmMachineryCP machineryCP;
    int currentBrand=0;
    int currentPrice=0;
    int totalAmount=0,temp10,temp20,temp50,temp100;
    int balance=0;
    int lastVal;
    
    //Constructor
    public vmMachineryCPEngine(database database){
        this.database=database;
        int signal=0;
    }
    
    //Setter
    
    public int displayQuantity(int x){
       return database.getQuantity(x);
    }
    
    public void setQuantity(int j, int k){
        if(k<=20)
            database.quantity[j]=k;
            }
      

    
    public boolean validation(){
        return database.passwordValidation();
    }   
    
    //getters
    
    
    public int displayCoin(int x){
        return database.getCoin(x);
    }
    

    


    
    //Functions
    
/*    public int returnBalance(){
        if (totalAmount==currentPrice){
            return 0;
        }
        else{
            if((totalAmount-currentPrice)>=100){
                
            }
        }
    }*/
    


}
