package projectName;

public class CustomerPrime extends Customer {
    double money;
    boolean hasCart;
    int numItems;
    int coupons;

    public CustomerPrime(double money, boolean hasCart, int numItems, int coupons) {
        
        super(money, hasCart, numItems);
        this.money = money;
        this.hasCart = hasCart;
        this.numItems = numItems; 
        this.coupons = coupons;
        
    }
    public void hasCoupons(){
        int OGnumItems = numItems;
        // System.out.println (OGnumItems);
        
        for(int i = 0; i< coupons; i++){
            
            numItems = (int) (numItems - numItems/4);
            
        }
        // System.out.println("num Items : " + numItems);
        // System.out.println(money);
        canBuy(numItems, " Customer Prime ", OGnumItems);
    }
}
