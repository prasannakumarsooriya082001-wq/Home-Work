import java.util.Scanner;

class ArrayNew
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		
		int ar[] = new int[len];
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.print("Enter the "+ i + " Index Number : ");
			ar[i]=sc.nextInt();
		}
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.print(ar[i] + " ");
			
		}
		
		
		sc.close();
	}
}