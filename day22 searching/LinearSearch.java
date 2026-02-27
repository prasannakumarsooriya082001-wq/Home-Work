import java.util.Scanner;

class LinearSearch
{
	int linear(int ar[], int target)
	{
		for(int i = 0;i<ar.length;i++)
		{
			if(ar[i] == target)
			{
				return i;
			}
		}	
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		LinearSearch ls = new LinearSearch();
		
		System.out.print("Enter Array length : ");
		int len =sc.nextInt();
		
		int ar[] = new int[len];
		
		System.out.println("Enter " + len + " elements (space separated):");
		for(int i =0 ;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Enter The Target : ");
		int target =sc.nextInt();
		
		int res = ls.linear(ar, target);
		
		System.out.println("Index value : "+res);
	}
}