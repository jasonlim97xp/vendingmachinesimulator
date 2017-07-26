package vendingmachine;

public class engine {
     boolean simulating,shutDown,custPanel,maintainerPanel;
     int totalAmount,coin10=0,coin20=0,coin50=0,coin100=0,totalCash;
     //Amount of Drink
     int[] brand = new int[10];
     //Price of drink
     int[] price= new int[10];
     //Number of can
     int[] quantity= new int[10];
     
     String password = "123abc";
    
    //Getters
     
    public String getPassword(){
        return password;
    }
     
    public int getQuantity(int x){
        return quantity[x];
    }
     
    public int get10c(){
        return coin10;
    }
    
    public int get20c(){
        return coin20;
    }
    
    public int get50c(){
        return coin50;
    }
    
    public int get100c(){
        return coin100;
    }
    
    public int getTotalCash(){
        return totalCash;
    }
     
    public void resetCash(){
        totalCash=0;
    }
    
    public boolean getSimulating(){
        return simulating;
    }
    
    public boolean getShutDown(){
        return shutDown;
    }
    
    public boolean getCustPanel(){
        return custPanel;
    }
    
    public int getTotalAmount(){
        return totalAmount;
    }
    
    public int getDrinkNumber(int x){
        return brand[x];
    }
    
    public int getPrice(int x){
        return price[x];
    }
    
    
    //Setters
    public void setSim(){
        simulating = !simulating;
    }
    
    public void setTotalAmount(int x){
        totalAmount=x;
    }    
    
    public void setQuantity(int j, int k){
        quantity[j]=k;
    }
    
    public void setPrice(int j, int k){
        price[j]=k;
    }
    //constructor 
    public engine(){
    simulating = false;
    shutDown = false;
    custPanel= false;
    totalAmount= 0;
    }
    
    //functions
    public void total(int x){
        totalAmount+=x;
        
        switch (x){
            case 10:
                coin10++;
                totalCash+=10;
                break;
            case 20:
                coin20++;
                totalCash+=20;
                break;
            case 50:
                coin50++;
                totalCash+=50;
                break;
            case 100:
                coin100++;
                totalCash+=100;
                break;
            default:
        }
    }
    
    public void canDeduction(int x){
        quantity[x]--;
    }
    
    public void coinDeduction(int x){
        switch (x){
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
            default:
        }
    }
}