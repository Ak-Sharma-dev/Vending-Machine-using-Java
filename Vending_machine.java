import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Scanner sc = new Scanner(System.in);
       int x=1;
       int candies = 200, chips = 50, gums = 150, cookies = 80;
       int candies_p = 2, chips_p = 10, gums_p = 3, cookies_p = 5;
       while(x!=0) {
           System.out.println("*** Welcome to Candy Shop ***\n" +
                   "To select an item, enter\n" +
                   "1 for Candy\n" +
                   "2 for Chips\n" +
                   "3 for Gum\n" +
                   "4 for Cookies\n" +
                   "9 to exit");
           int s_item = sc.nextInt();
           int total_price=0;
           if(s_item==9)
               break;
           System.out.print("Enter the Quantity: ");
           int quantity = sc.nextInt();
           if(s_item==1 && quantity>candies ||s_item==2 && quantity>chips ||s_item==3 && quantity>gums ||
                   s_item==4 && quantity>cookies){
               System.out.println("Invalid quantity chosen");
               continue;
           }
           else{
               if(s_item==1)
               total_price = quantity*candies_p;
               else if(s_item==2)
               total_price = quantity*chips_p;
               else if(s_item==3)
               total_price = quantity*gums_p;
               else if(s_item==4)
               total_price = quantity*cookies_p;
               System.out.println("Pay the amount of : "+total_price);
               int price;
               while(total_price!=0){
                   price = sc.nextInt();
                   total_price=total_price-price;
                   if(total_price!=0)
                   System.out.println("Pay the remaining amount of : "+total_price);
               }
           }
           if(s_item==1)
               candies-=quantity;
           else if(s_item==2)
               chips-=quantity;
           else if(s_item==3)
               gums-=quantity;
           else if(s_item==4)
               cookies-=quantity;
           System.out.println("Collect your item at the bottom and enjoy.");
       }
    }
}
