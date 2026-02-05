import java.util.Scanner;


class OrderStatus
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Order Code (P,S,D,C) : ");
		char OrderCode = scan.next().charAt(0);
		
		switch (OrderCode)
		{
			case 'P' ->
					System.out.println("Order Placed");
			case 'S' ->
					System.out.println("Shipped");
			case 'D' ->
					System.out.println("Delivered");
			case 'C' ->
					System.out.println("Cancelled");
			default -> 
					System.out.println("Invalid Order Code");
		}
	}
}