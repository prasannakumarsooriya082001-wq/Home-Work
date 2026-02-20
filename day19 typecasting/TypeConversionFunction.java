import java.util.Scanner;

class TypeConversionFunction
{
	Scanner sc = new Scanner(System.in);
	
	double intToDouble()
	{
		System.out.print("Enter The integer value : ");
        int integerValue = sc.nextInt();
		double doubleValue = integerValue;
		return doubleValue;
	}
	
	int doubleToInt()
	{
		System.out.print("Enter The double value : ");
        double doubleValue = sc.nextDouble();
        int integerValue = (int) doubleValue; 
		return integerValue;
	}
	
	int charToInt()
	{
		System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        int integer = character; 
		return integer;
	}
	
	char intToChar()
	{
		System.out.print("Enter an integer value: ");
        int number = sc.nextInt();
        char character = (char) number; 
		return character;
	}
	
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        int choice = 0;
		
		TypeConversionFunction type =new TypeConversionFunction();

        while(choice != 5)
        {
            System.out.println("----- TYPE CONVERSION -----");
            System.out.println("1. int -> double");
            System.out.println("2. double -> int");
            System.out.println("3. char -> int");
            System.out.println("4. int -> char");
            System.out.println("5. Exit");
			
            System.out.print("Enter your choice: ");
            choice = sc1.nextInt();

            switch(choice)
            {
                case 1:
				{
                    double doubleValue = type.intToDouble();
                    System.out.println("Converted Integer Value to double value : " + doubleValue);
                    break;
				}
				
                case 2:
				{
                    int integerValue = type.doubleToInt();
                    System.out.println("Converted Double Value to integer value : " + integerValue);
                    break;
				}
				
                case 3:
				{
                    int integer = type.charToInt();
                    System.out.println("Converted Character to Integer Value : " + integer);
                    break;
				}
				
                case 4:
				{
                    char character = type.intToChar();
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

        sc1.close();
    }
}