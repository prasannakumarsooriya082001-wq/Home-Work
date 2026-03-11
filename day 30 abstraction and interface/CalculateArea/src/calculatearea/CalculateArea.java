
package calculatearea;

import java.util.Scanner;


public class CalculateArea {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        int choice = 0;
        
        while(choice != 3)
        {
            System.out.println("----- Shape Area Calculator -----");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            
            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the Radius : ");
                    int radius = sc.nextInt();
                    
                    Circle cr = new Circle(radius);
                    cr.calculateArea();
                    break;                  
                }
                
                case 2:
                {
                    System.out.print("Enter the Side : ");
                    int side = sc.nextInt();
                    
                    Square cr = new Square(side);
                    cr.calculateArea();
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
