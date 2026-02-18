import java.util.Scanner;

class Calculator 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Calculator -----");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (choice) 
		{

            case 1:
                result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Multiplication Result: " + result);
                break;

            case 4:
                if (num2 == 0) 
				{
                    System.out.println("Error: Division by zero is not allowed.");
                } 
				else 
				{
                    result = num1 / num2;
                    System.out.println("Division Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }

        sc.close();
    }
}