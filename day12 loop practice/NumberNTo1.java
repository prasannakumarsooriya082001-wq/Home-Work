import java.util.Scanner;

class NumberNTo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; num-- )
		{
			System.out.print(num + " ");
		}
		sc.close();
	}
}