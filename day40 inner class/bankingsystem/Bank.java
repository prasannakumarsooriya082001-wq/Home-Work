
package bankingsystem;


public class Bank 
{
    Node head;
    Node tail;
    
    void createAccount(int accountNumber, double balance, String accountHolderName)
    {
        BankAccount bc =  new BankAccount(accountHolderName, accountNumber, balance);
        Node newNode = new Node(bc);
        
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Account Created Successfully...");
               
    }
    
    void accountDetails(int accountNumber)
    {
        Node temp = head;
        boolean isCheck = false;
        if(temp == null)
        {
            System.out.println("No Account Found...");
        }
        else
        {
            while(temp != null)
            {
                if(temp.data.accountNumber == accountNumber)
                {
                    System.out.println("Account Holder Name : "+temp.data.accountHolderName);
                    System.out.println("Account Number : "+temp.data.accountNumber);
                    System.out.println("Account Balance : "+temp.data.balance);
                    isCheck = true;
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
            if(!isCheck)
            {
                System.out.println("The Account is Not Found...");
            }
        }
    }
    
    void allAccountDetails()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No Account Found...");
        }
        else
        {
            while(temp != null)
            {
                System.out.println("Account Holder Name : "+temp.data.accountHolderName);
                System.out.println("Account Number : "+temp.data.accountNumber);
                System.out.println("Account Balance : "+temp.data.balance);
                temp = temp.next;
            }
        }
    }
    
    void depositBalance(int accountNumber, double damount)
    {
        Node temp = head;
        boolean isCheck = false;
        if(temp == null)
        {
            System.out.println("No Account Found...");
        }
        else
        {
            while(temp != null)
            {
                if(temp.data.accountNumber == accountNumber)
                {
                    BankAccount.Transaction bt = temp.data.new Transaction();
                    bt.depositAmount(damount);
                    isCheck = true;
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
            
            if(!isCheck)
            {
                System.out.println("The Account is Not Found...");
            }
        }
    }
    
    void withDrawBalance(int accountNumber, double wamount)
    {
        Node temp = head;
        boolean isCheck = false;
        if(temp == null)
        {
            System.out.println("No Account Found...");
        }
        else
        {
            while(temp != null)
            {
                if(temp.data.accountNumber == accountNumber)
                {
                    BankAccount.Transaction bt = temp.data.new Transaction();
                    bt.withdrawAmount(wamount);
                    isCheck = true;
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
            
            if(!isCheck)
            {
                System.out.println("The Account is Not Found...");
            }
        }
    }
}
