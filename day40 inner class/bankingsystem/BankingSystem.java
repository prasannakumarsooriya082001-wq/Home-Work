
package bankingsystem;

import java.util.Scanner;


public class BankingSystem 
{

    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice = 0;
        
        Bank b = new Bank();
        
        while(choice != 6)
        {
            System.out.println("===== BANK ACCOUNT MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Account");
            System.out.println("6. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the Account Number : ");
                    int accountNumber = sc.nextInt();
                    
                    System.out.print("Enter The Balance : ");
                    double balance = sc.nextDouble();
                    
                    System.out.print("Enter Account Holder Name : ");
                    String name = sc1.nextLine();

                    b.createAccount(accountNumber, balance, name);
                    
                    break;                   
                }
                
                case 2:
                {
                    System.out.print("Enter Account Number : ");
                    int aNumber = sc.nextInt();
                    System.out.print("Enter The Amount To Be Deposited : ");
                    double damount = sc.nextDouble();
                    
                    b.depositBalance(aNumber, damount);
                    break;                                     
                }
                
                case 3:
                {
                    System.out.print("Enter Account Number : ");
                    int aNumber = sc.nextInt();
                    System.out.print("Enter The Amount To Be WithDraw : ");
                    double wamount = sc.nextDouble();
                    
                    b.withDrawBalance(aNumber, wamount);
                    break;
                }
                
                case 4:
                {
                    System.out.print("Enter Account Number : ");
                    int aNumber = sc.nextInt();
                    
                    b.accountDetails(aNumber);
                    break;
                }
                
                case 5:
                {
                    b.allAccountDetails();
                    break;                   
                }
                
                case 6:
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
