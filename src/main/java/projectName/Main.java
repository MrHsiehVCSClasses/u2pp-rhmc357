package projectName;
import java.util.*;

public class Main 
{
    public static void main(String[] args) {
        Customer myCustomer = new Customer(50.4, true, 44);
        Double allMoney = myCustomer.money;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Let's see how many items you have in your cart. (press enter to begin!))");
        String input = myScanner.nextLine();
        System.out.println (input);
        
        myCustomer.checkNumItems();
        System.out.println(myCustomer.hasSpace);
        
        String toBuy;
        Integer toBuynum;
        System.out.println("How many items would you like to buy?");
        toBuy = myScanner.nextLine();
        toBuynum = Integer.parseInt(toBuy);
        
        myCustomer.canBuy(toBuynum, " my Customer ", toBuynum);
        
        CustomerPrime myCustomerPrime = new CustomerPrime(allMoney, true, toBuynum, 3);
        myCustomerPrime.hasCoupons();
        
        CostcoCustomer myCostcoCustomer = new CostcoCustomer(allMoney, true, toBuynum);
        myCostcoCustomer.hasCostco();


        myScanner.close();

        

        









        // Items myItem = new Items();
        // String input = myScanner.nextLine();
        // if (input == "fruit"){
        
        //     myItem.item(input);
        // }
        
    }
}
