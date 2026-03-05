import java.util.Scanner;

class BankAccount
{	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		AccountProcess ac = new AccountProcess();
		
		int choice = 0;
		
		while(choice != 4)
		{
			System.out.println("----- BANK ACCOUNT PROCESS ----- ");
			System.out.println("1 -> Deposit Amount");
			System.out.println("2 -> WithDraw Amount");
			System.out.println("3 -> Display Amount");
			System.out.println("4 -> Exit");
			
			System.out.print("Enter the Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{	
					System.out.print("Enter the Amount To be Deposited : ");
					int deposit = sc.nextInt();
					
					double depositAmount = ac.depositAmount(deposit);
					System.out.println("YOU HAVE DEPOSITED  : RS " + depositAmount);
					break;
				}
				
				case 2:
				{
					System.out.print("Enter the Amount To be WithDraw : ");
					int withdraw = sc.nextInt();
					
					if (withdraw <= ac.amount)
					{
						double withDrawAmount = ac.withDrawAmount(withdraw);
						System.out.println("YOU HAVE WITHDRAW  : RS " + withDrawAmount);
					}
					else
					{
						System.out.println("Insufficient Balance !");
					}
					break;
				}
				
				case 3:
				{
					
					double displayAmount = ac.displayAmount();
					System.out.println("YOU HAVE  : RS " + displayAmount);
					break;
				}
				
				case 4:
				{
					System.out.println("Exiting....");
					break;
				}
				
				default:
				{
					System.out.println("INVALID CHOICE.");
				}
			}
			
			
		}
		sc.close();
	}
	
	
}