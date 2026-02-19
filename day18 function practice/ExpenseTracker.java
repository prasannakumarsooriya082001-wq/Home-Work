import java.util.Scanner;

class ExpenseTracker
{
	Scanner sc = new Scanner(System.in);
	int br[] = new int[100];
	int expense=0;
	
	void addExpense()
	{
		System.out.print("Enter the Expense Amount : ");
		br[expense]=sc.nextInt();
		expense++;
		
	}
	
	void viewExpense()
	{
		if(expense == 0)
		{
			System.out.println("No Expenses Added...");
		}
		else
		{
			for(int i = 0;i<expense;i++)
			{
				System.out.println("Expense " +(i +1)+" : " + br[i]);
			}
		}
	}
	
	void totalExpense()
	{
		int total =0;
		
		for(int i=0;i<expense;i++)
		{
			total+=br[i];
		}
		System.out.println("Total Expense :" + total);
	}
	
	void highestExpense()
	{
		int highest = 0;
		for(int i=0;i<expense;i++)
		{
			if(br[i] > highest)
			{
				highest = br[i];
			}
		}
		System.out.println("Highest Expense : "+ highest);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		ExpenseTracker ex = new ExpenseTracker();
		
		while(choice!=5)
		{
			System.out.println("----- Daily Expense Tracker -----");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
			
            System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					ex.addExpense();
					break;
				}
				case 2:
				{
					ex.viewExpense();
					break;
				}
				case 3:
				{
					ex.totalExpense();
					break;
				}
				case 4:
				{
					ex.highestExpense();
					break;
				}
				case 5:
				{
					System.out.println("Exiting...");
					break;
				}
				default : 
				{
					System.out.println("Invalid Choice...");
				}
			}
		}
	}
}