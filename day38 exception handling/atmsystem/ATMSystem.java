
package atmsystem;

import java.util.Scanner;


public class ATMSystem 
{
    double balance = 5000; 

    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        
        ATMSystem atm = new ATMSystem();
        
        while(choice != 3)
        {
            System.out.println("***** ATM MENU *****");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            
            switch (choice) 
            {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    try 
                    {                      
                        atm.withdraw(amount);
                    } 
                    catch (InsufficientBalanceException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    atm.checkBalance();
                    break;

                case 3:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
  
    }
    
    void withdraw(double amount) throws InsufficientBalanceException 
        {

            if (amount > balance) 
            {
                throw new InsufficientBalanceException("Insufficient Balance!");
            } 
            else 
            {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        }

        void checkBalance() 
        {
        System.out.println("Current Balance: " + balance);
        }
    
}
