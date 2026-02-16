import java.util.Scanner;

class Char2DArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Row : ");
		int row = sc.nextInt();
		
		System.out.print("Enter the Column : ");
		int col = sc.nextInt();
		
		char arr[][] = new char[row][col];
		

		
		while(true)
		{
			
			System.out.println("--- MENU ---");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Exit");
		
			System.out.print("Enter the Choice : ");
			int choice = sc.nextInt();
		
			
			
			switch(choice)
			{
				case 1:
				{
					for(int i = 0 ; i < arr.length ; i++ )
					{
						for(int j = 0 ; j < arr[i].length ; j++)
						{
							System.out.print("Enter the arr[" + i + "," + j + "] :" );
							arr[i][j] = sc.next().charAt(0);
						}
					}
					break;
				}
			
				case 2:
				{
					for(int i = 0 ; i < arr.length ; i++ )
					{
						for(int j = 0 ; j < arr[i].length ; j++)
						{
							System.out.print(arr[i][j] +" ");
						}
						System.out.println();
					}
					break;
				}
			
				case 3:
				{
					System.out.println("Exiting....");
					break;
				}
			
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
			
			if(choice == 3 )
			{
				break;
			}
		}	
		
	}
}