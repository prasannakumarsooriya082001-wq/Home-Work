import java.util.Scanner;

class DoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int i = 1;
		
		do
		{
			System.out.println(i);
			i++;
			
			if (i > num)
			{
				break;
			}
		}while(true);
		
		sc.close();
	}
}