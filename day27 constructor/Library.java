import java.util.Scanner;


class Library
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
				
		LibraryManagement books[] = new LibraryManagement[100];
	
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
				{
					System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Title: ");
                    String title = sc1.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc1.nextLine();
					
					if(count == 100)
					{
						System.out.println("Library is full.");
					}
					else
					{
						books[count] = new LibraryManagement(id, title, author);
						count++;
					}
					
                    System.out.println("Book Added Successfully");
                    break;
				}
				
				case 2:
				{
					if (count == 0)
					{
						System.out.println("No books in library.");
					}
					else
					{
						for(int i = 0;i<count;i++)
						{
							books[i].display();
						}
					}
					break;
				}
				
				case 3:
				{
					System.out.print("Enter Book ID to Borrow: ");
                    int id = sc.nextInt();
					
					boolean found = false;
					
                    for(int i=0;i<count;i++)
                    {
                        if(books[i].bookId == id)
                        {
                            books[i].borrowBook();
							found = true;
							break;
                        }
                    }
					if(!found)
					{
						System.out.println("Invalid Book ID. Please try again.");
					}
                    break;
				}
				
				case 4:
				{
					System.out.print("Enter Book ID to Return: ");
                    int id = sc.nextInt();
					
					boolean found = false;

                    for(int i=0;i<count;i++)
                    {
                        if(books[i].bookId == id)
                        {
                            books[i].returnBook();
							found = true;
							break;
                        }
                    }
					
					if(!found)
					{
						System.out.println("Invalid Book ID. Please try again.");
					}
                    break;
				}
				
				case 5:
				{
					System.out.println("Exiting...");
					break;
				}
				
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
			
		}
	}
}