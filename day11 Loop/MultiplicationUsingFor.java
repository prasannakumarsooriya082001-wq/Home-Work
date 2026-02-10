import java.util.Scanner;

class MultiplicationUsingFor
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i ;
		
        for(i = 1 ; i <=10 ; i++)
		{
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}