import java.util.Scanner;


class TrafficSignal
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Signal Color (R,Y,G) : ");
		char signalColor = scan.next().charAt(0);
		
		switch (signalColor)
		{
			case 'R' :
			{
				String color = "STOP";
				System.out.println(color);
				break;
			}
			case 'Y' :
			{
				String color = "READY";
				System.out.println(color);
				break;
			}
			case 'G' :
			{
				String color = "Go";
				System.out.println(color);
				break;
			}
			default : 
					System.out.println("Invalid Signal Color");
		}
	}
}