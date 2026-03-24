
package test;

import java.util.Scanner;

public class Test 
{
     static void validate(int id) throws InvalidUserIdException 
     {
        if (id <= 0) 
        {
            throw new InvalidUserIdException("User ID must be positive");
        } 
        else 
        {
            System.out.println("Valid User ID: " + id);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter User ID: ");
            String input = sc.nextLine();

            int id = Integer.parseInt(input);

            validate(id);

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("User ID must be a number");
        } 
        catch (InvalidUserIdException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Program Completed...");
        }
    }
    
}
