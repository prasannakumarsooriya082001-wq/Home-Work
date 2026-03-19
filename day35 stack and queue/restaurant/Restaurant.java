
package restaurant;

import java.util.Scanner;


public class Restaurant 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       Scanner sc1 =new Scanner(System.in);
       int choice = 0;
       
       Order o = new Order();
       
       while(choice != 5)
       {
           System.out.println("***** Restaurant *****");
           System.out.println("1. Add Order");
           System.out.println("2. Serve Order");
           System.out.println("3. View Next Order");
           System.out.println("4. Display All Order");
           System.out.println("5. Exit");
           
           System.out.print("Enter the Choice : ");
           choice = sc.nextInt();
           
           switch(choice)
           {
           
               case 1:
               {
                   System.out.print("Enter Order : ");
                   String item = sc1.nextLine();
                   o.addOrder(item);
                   break;
               }
               
               case 2:
               {
                   o.serveOrder();
                   break;
               }
               
               case 3:
               {
                   o.nextOrder();
                   break;
               }
               
               case 4:
               {
                   o.displayOrder();
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
