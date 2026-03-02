import java.util.Scanner;

class swapTwoValues
{
	int a,b;
	
	void swap(swapTwoValues sv )
	{
		int temp = sv.a;
		sv.a=sv.b;
		sv.b=temp;
	}
	
	public static void main(String[] args)
	{
		swapTwoValues sv = new swapTwoValues();
		
		sv.a=10;
		sv.b=20;
		
		System.out.println("a = "+sv.a+", b = "+sv.b);
		
		sv.swap(sv);
		
		System.out.println("a = "+sv.a+", b = "+sv.b);
	}
	
}