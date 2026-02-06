import java.util.Scanner;

class BookShop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Book Shop");
		System.out.println("1. Academic Books");
		System.out.println("2. Story Books");
		System.out.println("3. Magazines");
		System.out.println("4. Competitive Exam Books");
		System.out.println("5. Comics");
		
		System.out.print("Enter the Choice : ");
		int choice = sc.nextInt();
		
		if (choice == 1)
		{
			System.out.println("1. Maths ");
			System.out.println("2. Science");
			
			System.out.print("Enter the Option : ");
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Maths - Rs.200 ");
			}
			else if (option == 2)
			{
				System.out.println("Science - Rs.250 ");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		else if (choice == 2)
		{
			System.out.println("1. Adventure Story ");
			System.out.println("2. Moral Story");
			
			System.out.print("Enter the Option : ");
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Adventure Story - Rs.150 ");
			}
			else if (option == 2)
			{
				System.out.println("Moral Story - Rs.120 ");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		else if (choice == 3)
		{
			System.out.println("1. Weekly Magazine ");
			System.out.println("2. Monthly Magazine");
			
			System.out.print("Enter the Option : ");
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Weekly Magazine - Rs.50 ");
			}
			else if (option == 2)
			{
				System.out.println("Monthly Magazine - Rs.120 ");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		else if (choice == 4)
		{
			System.out.println("1. Banking Exam Book ");
			System.out.println("2. SSC Exam Book");
			
			System.out.print("Enter the Option : ");
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Banking Exam Book - Rs.400 ");
			}
			else if (option == 2)
			{
				System.out.println("SSC Exam Book - Rs.350 ");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		else if (choice == 5)
		{
			System.out.println("1. Kids Comics ");
			System.out.println("2. Superhero Comics");
			
			System.out.print("Enter the Option : ");
			int option = sc.nextInt();
			
			if(option == 1)
			{
				System.out.println("Kids Comics - Rs.80 ");
			}
			else if (option == 2)
			{
				System.out.println("Superhero Comics - Rs.120 ");
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		else
		{
			System.out.println("The Book is not available");
		}
	}
}