import java.util.Scanner;

class swapValues
{
	
	void swap(int ar[])
	{
		int temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
	}
	
	public static void main(String[] args)
	{
		swapValues sv = new swapValues();
		
		int ar[]={10,20};
		
		System.out.println("a = "+ar[0]+", b = "+ar[1]);
		
		sv.swap(ar);
		
		System.out.println("a = "+ar[0]+", b = "+ar[1]);
	}
	
}