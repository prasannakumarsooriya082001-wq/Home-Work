import java.util.Scanner;

class TypeConversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 5)
        {
            System.out.println("----- TYPE CONVERSION -----");
            System.out.println("1. int -> double");
            System.out.println("2. double -> int");
            System.out.println("3. char -> int");
            System.out.println("4. int -> char");
            System.out.println("5. Exit");
			
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
				{
                    System.out.print("Enter The integer value : ");
                    int integerValue = sc.nextInt();
                    double doubleValue = integerValue;   
                    System.out.println("Converted Integer Value to double value : " + doubleValue);
                    break;
				}
				
                case 2:
				{
                    System.out.print("Enter The double value : ");
                    double doubleValue = sc.nextDouble();
                    int integerValue = (int) doubleValue;   
                    System.out.println("Converted Double Value to integer value : " + integerValue);
                    break;
				}
				
                case 3:
				{
                    System.out.print("Enter a character: ");
                    char character = sc.next().charAt(0);
                    int integer = character;   
                    System.out.println("Converted Character to Integer Value : " + integer);
                    break;
				}
				
                case 4:
				{
                    System.out.print("Enter an integer value: ");
                    int number = sc.nextInt();
                    char character = (char) number;   
                    System.out.println("Converted Integer Value to  character: " + character);
                    break;
				}
				
                case 5:
				{
                    System.out.println("Exiting...");
                    break;
				}
				
                default:
				{
                    System.out.println("Invalid choice");
				}
            }

        } 

        sc.close();
    }
}