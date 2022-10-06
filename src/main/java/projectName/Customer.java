package projectName;

public class Customer {
    public double money;
    public boolean hasCart;
    public int numItems;
    
    public Customer(double money, boolean hasCart, int numItems){
        this.money = money;
        this.hasCart = hasCart;
        this.numItems = numItems;
    }
    

    public String hasSpace;
    public String checkNumItems() {
        
        if (hasCart == true) {
            hasSpace = "You have " + numItems + " items in your cart";
            return hasSpace;
        }
        else {
            if (numItems > 8){
                hasSpace = "too many items, grab a cart";
                return hasSpace;
            }
            hasSpace = "you're good";
            return hasSpace;
        }
        
        
            

    }
    String canBuyItem;
    public void canBuy(Integer toBuynum, String CustomerType, int itemAmount) {
        // System.out.println(money);
        // System.out.println(toBuynum);
        if (toBuynum > money){
            canBuyItem = "Sorry, " + CustomerType + " you do not have enough money for these " + itemAmount + " Items";
            System.out.println(canBuyItem);
        }
        else{
            canBuyItem = "You" + CustomerType + "have " + money + " and you can buy these " + itemAmount + " items!";
            System.out.println(canBuyItem);
        }
    }
} 
