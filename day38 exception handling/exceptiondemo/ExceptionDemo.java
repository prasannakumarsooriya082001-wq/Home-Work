
package exceptiondemo;

import java.util.Scanner;


public class ExceptionDemo {

 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice = 0;
        
        while (choice != 4) 
        {
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. Null Pointer Exception");
            System.out.println("3. Array Index Exception");
            System.out.println("4. Exit");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch(choice) 
            {

                case 1:
                {
                    try 
                    {
                        System.out.print("Enter value of a: ");
                        int a = sc.nextInt();
                        System.out.print("Enter value of b: ");
                        int b = sc.nextInt();
                        System.out.println("Result: " + (a / b));
                    } 
                    catch (ArithmeticException e) 
                    {
                        System.out.println("Cannot divide by zero!");
                    }
                    finally
                    {
                        System.out.println("Program Completed...");
                    }
                    break;
                }

                case 2:
                {
                    try 
                    {
                        System.out.print("Enter string: ");
                        String s = sc1.nextLine();
                        if(s.equals("null"))
                        {
                            s = null;
                        }
                        System.out.println("Length: " + s.length());
                    } 
                    catch (NullPointerException e) 
                    {
                        System.out.println("String cannot be null!");
                    }
                    finally
                    {
                        System.out.println("Program Completed...");
                    }
                    break;
                    
                }

                case 3:
                {
                    int arr[] = {10, 20, 30};
                    try 
                    {
                        System.out.print("Enter Index : ");
                        int i = sc.nextInt();
                        System.out.println(arr[i]);
                    } 
                    catch (ArrayIndexOutOfBoundsException e) 
                    {
                        System.out.println("Invalid index!");
                    }
                    finally
                    {
                        System.out.println("Program Completed...");
                    }
                    break;
                    
                }

                case 4:
                {
                    System.out.println("Exiting..");
                    break;
                }
                
                default:
                {
                    System.out.println("Inavlid Choice...");
                }
            }
        }
    }
    
}
