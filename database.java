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
    
    vmMachineryCP machineryPanel;
    
    //Password
    String password="123abc",maintainerPasswordInput="";
    
    //Quantity
    int[] quantity= new int[10];
    //Price
    int[] price=new int[10];
    
    
    public database(){
        //For Testing
        for (int i=0;i<10;i++){
            quantity[i]=5;
        }
        price[0]=70;
        price[1]=50;
        price[2]=100;
        price[3]=40;
        price[4]=60;
        price[5]=120;
        price[6]=150;
        price[7]=30;
        price[8]=90;
        price[9]=80;
        
        coin10=0;
        coin20=0;
        coin50=0;
        coin100=0;
        //Testing Ends
    }
    
    //setter
    public void setDrinkType(int x){
        currentBrand=x;
    }
    
    public void setMaintainerPasswordInput(String x){
        maintainerPasswordInput=x;
        //maintainerPasswordInput.replaceAll("\\s", "");//Remove whitespace
    }
    
    public void ejectDrink(int x){
        quantity[x]--;
    }
    
    public void setPrice(int j,int k){
        price[j]=k;
    }
    
    public void setQuantity(int j, int k){
        quantity[j]=k;
    }
    
    
    
    //getter
    public boolean passwordValidation(){
        if (maintainerPasswordInput.replaceAll("\\s", "").equals(password))
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
    
    public void returnCoin(int x){
        while(x>0){
            if (x>=100 && coin100!=0){
                x-=100;
                coin100--;
          }else if (x>=50 && coin50!=0){
              x-=50;
              coin50--;
          }else if (x>=20 && coin20!=0){
              x-=20;
              coin20--;
          }else if (x>=10 && coin10!=0){
              x-=10;
              coin10--;
          }
    }
    }
    
    public void receiveTotalCoin(int ten,int twenty,int fifty,int hundred){
        coin10+=ten;
        coin20+=twenty;
        coin50+=fifty;
        coin100+=hundred;
    }
    
    public int totalCash(){
        totalCash=0;
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
    
    public void resetCash(){
        
        totalCash=0;
        coin10=0;
        coin20=0;
        coin50=0;
        coin100=0;
    }
    
    public void flushPasswordInput(){
        maintainerPasswordInput=" ";
    }

    public int getCoin10() {
        return coin10;
    }

    public int getCoin20() {
        return coin20;
    }

    public int getCoin50() {
        return coin50;
    }

    public int getCoin100() {
        return coin100;
    }

    public boolean checkCoin(){//true if sufficient change
        return ((coin10>=2)&&(coin20>=1)&&(coin50>=1));
    }
    
    void quantity(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
