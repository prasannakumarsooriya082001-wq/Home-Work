import java.util.Scanner;

class Marks
{
	Scanner sc = new Scanner(System.in);
	int mark[] = new int[100];
	int score = 0;
	
	
	void addScore()
	{
		System.out.print("Enter the Marks : ");
		mark[score]=sc.nextInt();
		score++;
		
	}
	
	void displayScore()
	{
		if(score == 0)
		{
			System.out.println("NO Marks Added ...");
		}
		else
		{
			for(int i = 0;i<score;i++)
			{
				System.out.println("Mark " +(i +1)+" : " + mark[i]);
			}
		}
	}
	
	void passScore()
	{
		int pass = 0;
		
		for(int i=0;i<score;i++)
		{
			if(mark[i]>=40)
			{
				pass++;
			}
		}
		System.out.println("Total Pass Count :" + pass);
	}
	
	void failScore()
	{
		int fail = 0;
		
		for(int i=0;i<score;i++)
		{
			if(mark[i]<40)
			{
				fail++;
			}
		}
		System.out.println("Total Fail Count :" + fail);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		Marks ex = new Marks();
		
		while(choice!=5)
		{
			System.out.println("----- Marks Calculations -----");
            System.out.println("1. Add Score");
            System.out.println("2. Display All Score");
            System.out.println("3. Count Pass Score");
            System.out.println("4. Count Fail Score");
            System.out.println("5. Exit");
			
            System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					ex.addScore();
					break;
				}
				case 2:
				{
					ex.displayScore();
					break;
				}
				case 3:
				{
					ex.passScore();
					break;
				}
				case 4:
				{
					ex.failScore();
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