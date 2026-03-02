import java.util.Scanner;

class TraverseRec
{
	void traverse(int ar[],int i)
	{
		
		if (i<0)
		{
			return;
		}
		System.out.println(ar[i]+" ");
		
		traverse(ar,i-1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		TraverseRec tr =new TraverseRec();
		
		System.out.print("Enter array length : ");
		int len=sc.nextInt();
		
		int ar[] =new int[len];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the "+i+" index value : ");
			ar[i]=sc.nextInt();
		}
		
		tr.traverse(ar,ar.length-1);
	}
}
