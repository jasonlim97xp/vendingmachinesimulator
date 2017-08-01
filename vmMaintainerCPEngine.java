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
    
    
    public boolean validation(){
        return database.passwordValidation();
    }
    
    //Functions
    public void collectCash(){
        database.resetCash();
    }
    
    
}