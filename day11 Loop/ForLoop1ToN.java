import java.util.Scanner;

class ForLoop1ToN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i ;
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		for(i = 1 ; i <= num ; i++)
		{
			System.out.println(i);
		}
		
		sc.close();
	}
}