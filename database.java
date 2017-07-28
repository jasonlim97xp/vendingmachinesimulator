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
public class database {
    int totalAmount,coin10=0,coin20=0,coin50=0,coin100=0,totalCash;
    int currentBrand=0;
    
    //Password
    String password="123abc",maintainerPasswordInput;
    
    //Quantity
    int[] quantity= new int[10];
    //Price
    int[] price=new int[10];
    //
    public database(){
        //for testing
        quantity[0]=5;
        price[0]=70;
        coin10=10;
        coin20=10;
        coin50=10;
        coin100=10;
        //endtesting
    }
    
    //setter
    public void setDrinkType(int x){
        currentBrand=x;
    }
    
    public void setMaintainerPasswordInput(String x){
        maintainerPasswordInput=x;
    }
    
    public void ejectDrink(int x){
        quantity[x]--;
    }
    
    public void setPrice(int j,int k){
        price[j]=k;
    }
    
    
    
    //getter
    public boolean passwordValidation(){
        if (maintainerPasswordInput.equals(password))
            return true;
        else
            return false;
    }
    
    public int getPrice(int x){
        return price[x];
    }
    
   
    
    public String getPassword(){
        return password;
    }
    
    public int getQuantity(int x){
        return quantity[x];
    }
    
    //Function
    
     public int getCoin(int x){
        int temp;
        switch(x){
            case 10:
                temp= coin10;
                break;
            case 20:
                temp= coin20;
                break;
            case 50:
                temp= coin50;
                break;
            case 100:
                temp= coin100;
                break;
            default:
                temp=0;
        }
        return temp;
    }
    
    public void returnCoin(int x){//Not complete
        switch(x){
                case 10:
                    coin10--;
                    break;
                case 20:
                    coin20--;
                    break;
                case 50:
                    coin50--;
                    break;
                case 100:
                    coin100--;
                    break;
                        }
    }
    
    public void receiveTotalCoin(int ten,int twenty,int fifty,int hundred){
        coin10+=ten;
        coin20+=twenty;
        coin50+=fifty;
        coin100+=hundred;
    }
    
    public int totalCash(){
        for(int i=0;i<coin10;i++){
            totalCash+=10;
        }
        
        for(int i=0;i<coin20;i++){
            totalCash+=20;
        }
        
        for(int i=0;i<coin50;i++){
            totalCash+=50;
        }
        
        for(int i=0;i<coin100;i++){
            totalCash+=100;
        }
        
        return totalCash;
    }
    
    public void checkBalanceAvailability(){
        
    }
    
    public void returnChange(){
        
    }
    
    public void clearBalance(){
        
    }
}
