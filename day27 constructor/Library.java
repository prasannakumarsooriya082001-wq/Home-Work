
import java.util.Scanner;


class Library
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
				 LibraryManagement lm=null;
	
		int count = 0;
		
		int choice = 0;
		
		while(choice != 5)
		{
			System.out.println("***** Library Management System *****");
			System.out.println("1. Add a New Book");
			System.out.println("2. Display All Book");
			System.out.println("3. Borrow a Book");
			System.out.println("4. Return a Book");
			System.out.println("5. Exit");
			
			System.out.print("Enter The Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Title: ");
                    String title = sc1.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc1.nextLine();
					
					 lm =new LibraryManagement(id,title,author);
					
                    System.out.println("Book Added Successfully");
                    break;
				
				
				case 2:
				
					lm.display();
					break;
				
				
				
				
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
			
		}
	}
}