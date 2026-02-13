import java.util.Scanner;

class MenuDrivenArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		
		int ar[] = new int[len];
		
		while(true)
		{
			System.out.println("MENU");
            System.out.println("1. Insert elements");
            System.out.println("2. Display elements");
            System.out.println("3. Count Even numbers");
            System.out.println("4. Count Odd numbers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
		
			switch(choice)
			{
				case 1 :
				
					
					for(int i = 0; i<ar.length; i++)
					{
						System.out.print("Enter the "+ i + " Index Number : ");
						ar[i]=sc.nextInt();
					}
					break;
			
				case 2 :
					for(int i = 0; i<ar.length; i++)
					{
						System.out.println(ar[i] + " ");
			
					}
					break;
				
				case 3 :
					int even = 0;
		
					for(int i = 0 ; i<ar.length ; i++)
					{
						if (ar[i] % 2 == 0)
						{
							even++;
						}
					}
					System.out.println("The EVEN Number : " + even);
					break;
				
				case 4 :
					int odd = 0;
		
					for(int i = 0 ; i<ar.length ; i++)
					{
						if (ar[i] % 2 == 1)
						{
							odd++;
						}
					}
					System.out.println("The ODD Number : " + odd);
					break;
			
				case 5 : 
					System.out.println("Exiting...");
					break;
			
				default : 
					System.out.println("Invalid Choice ...");
			}
			
			if (choice == 5)
				{
				break;
				}
		}
			
			
		sc.close();
	}
}