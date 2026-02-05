import java.util.Scanner;


class Language
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Language Number : ");
		int language = scan.nextInt();
		
		
		switch (language)
		{
			case 1 :
					System.out.println("Tamil");
					break;
			case 2 :
					System.out.println("English");
					break;
			case 3 :
					System.out.println("Hindi");
					break;
			case 4 :
					System.out.println("Malayalam");
					break;
			default : 
					System.out.println("Invalid Language Number");
		}
	}
}