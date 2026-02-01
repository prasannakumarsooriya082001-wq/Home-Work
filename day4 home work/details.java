import java.util.Scanner;

class details
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Enter your height: ");
		float height = scan.nextFloat();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		
	}
}