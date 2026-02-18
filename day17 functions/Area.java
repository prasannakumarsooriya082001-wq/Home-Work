import java.util.Scanner;

class Area
{
	double areaOfRectangle (double len ,double bre)
	{
		double area = len * bre;
		
		return area;
	}
	
	double areaOfCircle (double radius)
	{
		double area = 3.14 * radius * radius;
		
		return area;
	}
	
	double areaOfSquare (double side)
	{
		double area = side * side;
		
		return area;
	}
	
	double areaOfTriangle (double height, double base)
	{
		double area = 0.5 * height * base;
		
		return area;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		int choice = 0;
		
		while(choice != 5)
		{
			System.out.println("***** MENU ***** ");
			System.out.println("1 -> Area Of Rectangle");
			System.out.println("2 -> Area Of Circle");
			System.out.println("3 -> Area Of Square");
			System.out.println("4 -> Area Of Triangle");
			System.out.println("5 -> Exit");
			
			System.out.print("Enter Your Choice : ");
			choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.print("Enter the Length : ");
					double len =sc.nextInt();
					
					System.out.print("Enter the Breath : ");				
					double bre =sc.nextInt();
					
					double result = area.areaOfRectangle(len, bre);
					
					System.out.println("Area Of Rectangle is : " + result);
					break;
					
				}
				
				case 2:
				{
					System.out.print("Enter the Radius : ");
					double rad =sc.nextInt();
					
					double result = area.areaOfCircle(rad);
					
					System.out.println("Area Of Circle is : " + result);
					break;
					
				}
				
				case 3:
				{
					System.out.print("Enter the Side value : ");
					double side =sc.nextInt();
					
					double result = area.areaOfSquare(side);
					
					System.out.println("Area Of Square is : " + result);
					break;
					
				}
				
				case 4:
				{
					System.out.print("Enter the Height : ");
					double height =sc.nextInt();
					
					System.out.print("Enter the Base : ");				
					double base =sc.nextInt();
					
					double result = area.areaOfTriangle(height, base);
					
					System.out.println("Area Of Triangle is : " + result);
					break;
					
				}
				
				case 5:
				{
					System.out.println("You Are Exiting.....");
				}
			}
			
			
		}
	}
	


}