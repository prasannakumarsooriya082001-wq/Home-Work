
package onlineshoppingbillgenerator;

import java.util.Scanner;


public class OnlineShoppingBillGenerator 
{

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        Product.shopName = "Mano Fabrics Online Store";
        

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        String name = sc1.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);

        System.out.println();
        p.display();
    }
    
}
