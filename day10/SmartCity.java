import java.util.Scanner;

class SmartCity
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("SMART CITY UTILITY MENU");
        System.out.println("Electricity Bill -> 1");
        System.out.println("Water Bill -> 2");
        System.out.println("Internet Plan -> 3");
        System.out.println("Exit -> 4");
		
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) 
		{

            case 1:
                
                System.out.print("Enter the units : ");
                int units = sc.nextInt();
                int bill = 0;

                if (units <= 100) 
				{
                    bill = units * 2;
                } 
                else if (units <= 300) 
				{
                    bill = units * 3;
                } 
                else 
				{
                    bill = units * 5;
                }

                System.out.println("Electricity Bill : Rs" + bill);
                break;

            case 2:
                
                System.out.println("House Type : ");
                System.out.println("Apartment -> 1");
                System.out.println("Individual House -> 2");
				
				System.out.print("Select the House Type : ");
                int houseType = sc.nextInt();

                if (houseType >= 1 && houseType <= 2) 
				{
					if (houseType == 1)
					{
						System.out.println("Water Bill : Rs300");
					}
					else if (houseType == 2) 
					{
                        System.out.println("Water Bill : Rs500");
					} 
					else 
					{
						System.out.println("Invalid House Type");
					}
                }
				else
				{
					System.out.println("Invalid House Type");
				}
                
                break;

            case 3:
                
                System.out.println("Internet Plan:");
                System.out.println("Basic Plan -> 1");
                System.out.println("Standard Plan -> 2");
                System.out.println("Premium Plan -> 3");
				
				System.out.print("Select the Internet Plan : ");
                int plan = sc.nextInt();
				

                if (plan >= 1 && plan <= 3) 
				{

					if (plan == 1) 
					{
						System.out.println("Basic : Rs399");
					}
					else if (plan == 2) 
					{
						System.out.println("Standard : Rs699");
					}
					else if (plan == 3) 
					{
						System.out.println("Premium : Rs999");
					}
					else 
					{
						System.out.println("Invalid Plan");
					}
				}
				else 
				{
					System.out.println("Invalid Plan Choice");
				}
                break;

            case 4:
			
                System.out.println("Thank you for using Smart City Utility System");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}