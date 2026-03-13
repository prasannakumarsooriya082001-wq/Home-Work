
package bankmanagementsystem;


public class BankAccount 
{
    private int  acccountNumber;
    private String accountHolderName;
    private double balance;

    


    public int getAcccountNumber() 
    {
        return acccountNumber;
    }

    public void setAcccountNumber(int acccountNumber) 
    {
        this.acccountNumber = acccountNumber;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    
    
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("You Have Deposited Successfully ...");
    }
    
    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("You Have Withdraw Rs :"+amount + " Successfully...");
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    
    void displayAccountDetails()
    {
        System.out.println("***** Account Details *****");
        System.out.println("Account Number: "+acccountNumber);
        System.out.println("Account Holder Name : "+ accountHolderName);
        System.out.println("Balance : "+balance);
    }
    
}
