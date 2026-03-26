
package bankingsystem;


public class BankAccount 
{
    String accountHolderName;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) 
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    
    
    class Transaction
    {
        public void depositAmount(double amount)
        {   
            balance+=amount;
            System.out.println("You Have Deposited Successfully...");
        }
        
        public void withdrawAmount(double amount)
        {
            if(amount < balance)
            {
                balance-=amount;
                System.out.println("You Have Successfully Withdraw : Rs"+ amount);
            }
            else
            {
                System.out.println("Insufficient Balance!");
            }
        }
        
        
    }
}
