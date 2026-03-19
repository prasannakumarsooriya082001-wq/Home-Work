
package supermarketbillingsystem;

import java.util.Scanner;


public class SupermarketBillingSystem 
{

  
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       Scanner sc1 =new Scanner(System.in);
       int choice = 0;
       
       Billing b = new Billing();
       
       while(choice != 5)
       {
           System.out.println("***** SuperMarket Billing System *****");
           System.out.println("1. Add Item");
           System.out.println("2. Undo Last Item");
           System.out.println("3. View Last Scanned Item");
           System.out.println("4. Display All Items");
           System.out.println("5. Exit");
           
           System.out.print("Enter the Choice : ");
           choice = sc.nextInt();
           
           switch(choice)
           {
           
               case 1:
               {
                   System.out.print("Enter Item Name : ");
                   String item = sc1.nextLine();
                   b.addItem(item);
                   break;
               }
               
               case 2:
               {
                   b.undoLastItem();
                   break;
               }
               
               case 3:
               {
                   b.ViewLastScannedItem();
                   break;
               }
               
               case 4:
               {
                   b.displayAllItem();
                   break;
               }
               
               case 5:
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
