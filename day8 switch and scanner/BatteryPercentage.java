import java.util.Scanner;


class BatteryPercentage
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Battery Percentage : ");
		int batteryPercentage = scan.nextInt();
		
		if (batteryPercentage >= 80)
		{
			System.out.println("Battery Full");
		}
		else if ((batteryPercentage >= 30) && (batteryPercentage <= 70))
		{
			System.out.println("Battery Normal");
		}
		else if (batteryPercentage < 30)
		{
			System.out.println("Low Battery - Charge Now ");
		}
	}
}