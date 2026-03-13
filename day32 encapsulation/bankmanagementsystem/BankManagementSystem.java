
package bankmanagementsystem;

import java.util.Scanner;


public class BankManagementSystem 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        BankAccount ba = new BankAccount();
        
        System.out.print("Enter Account Number : ");
        
        ba.setAcccountNumber(sc.nextInt());
        
        System.out.print("Enter Account Holder Name : ");
        ba.setAccountHolderName(sc1.nextLine());
        
        System.out.print("Enter The Balance : ");
        ba.setBalance(sc.nextInt());
        
        
        int choice = 0;
        
        while(choice != 4)
        {
            System.out.println("************** Bank Management System ***************");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter The Amount To Be Deposited : ");
                    double amount = sc.nextInt();
                    ba.deposit(amount);
                    break;
                }
                
                case 2:
                {
                    System.out.print("Enter Withdraw Amount : ");
                    double amount = sc.nextInt();
                    ba.withdraw(amount);
                    break;
                }
                
                case 3:
                {
                    ba.displayAccountDetails();                   
                    break;
                }
                
                case 4:
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
