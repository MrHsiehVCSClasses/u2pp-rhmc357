package projectName;

public class CostcoCustomer extends Customer{

    public CostcoCustomer(double money, boolean hasCart, int numItems) {
        super(money, hasCart, numItems);
        
    }
    public void hasCostco(){
        numItems = numItems*2;
        int OGnumItems = numItems;
        System.out.println ("OG items: " + OGnumItems);
        
        for(int i = 0; i< 2; i++){
            
            numItems = (int) (numItems - numItems/2);
            
        }
        System.out.println("num Items : " + numItems);
        System.out.println("money: " + money);
        canBuy(numItems, " Costco Customer ", OGnumItems);
    }
    
}
