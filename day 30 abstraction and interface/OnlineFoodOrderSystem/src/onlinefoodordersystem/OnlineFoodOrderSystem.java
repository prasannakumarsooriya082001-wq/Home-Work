
package onlinefoodordersystem;

import java.util.Scanner;
public class OnlineFoodOrderSystem 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        FoodOrder fo = null;
        
        int choice = 0;
        
        while(choice != 3)
        {
            System.out.println("----- Online Food Order System -----");
            System.out.println("1. Place Order");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            
            System.out.print("Enter the Choice :  ");
            choice = sc.nextInt();
            
            
            switch(choice)
            {
                case 1: 
                {
                    System.out.print("Enter the Customer Name : ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter the Food Item Name : ");
                    String fin = sc1.nextLine();
                    
                    System.out.print("Enter the Price : ");
                    int price = sc.nextInt();
                    
                    fo = new FoodOrder(name, fin, price);
                    fo.placeOrder();
                    break;
                    
                }
                case 2:
                {    
                    fo.showBill();
                    break;
                    
                }
                
                case 3:
                {
                    System.out.println("Exiting...");
                    break;
                }
                
                default:
                {
                    System.out.println("Invalid Choice!");
                }
                    
                
            }
        }
        
    }
    
}
