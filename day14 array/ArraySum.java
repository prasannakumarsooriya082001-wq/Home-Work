import java.util.Scanner;

class ArraySum
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
		
		int sum = ar[0]+ar[1];
		System.out.println("The Sum is : " + sum);
		
		sc.close();
	}
}