package smartloginsystem;

import java.util.Scanner;


class AccountLockedException extends Exception 
{

    public AccountLockedException(String message) 
    {
        super(message);
    }
}

public class SmartLoginSystem 
{

    String correctUsername = "admin";
    String correctPassword = "1234";

    int attempts = 3;

    
    void login(String username, String password) throws AccountLockedException 
    {

        if (attempts == 0) 
        {
            throw new AccountLockedException("Account Locked! Too many failed attempts.");
        }

        if (username.equals(correctUsername) && password.equals(correctPassword)) 
        {
            System.out.println("Login Successful!");
            attempts = 3;
        } 
        else 
        {
            attempts--;
            if (attempts == 0) 
            {
                throw new AccountLockedException("Account Locked! Too many failed attempts.");
            } 
            else
            {
                System.out.println("Invalid credentials. Remaining attempts: " + attempts);
            }
        }
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        SmartLoginSystem sls = new SmartLoginSystem();

        while(choice != 2)
        {
            System.out.println("***** LOGIN MENU *****");
            System.out.println("1. Login");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter username: ");
                    String user = sc.nextLine();

                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();

                    try 
                    {
                        sls.login(user, pass);
                    } 
                    catch (AccountLockedException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }

        sc.close();
    }
}
