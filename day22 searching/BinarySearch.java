import java.util.Scanner;

class BinarySearch
{
	int binary(int ar[], int target)
	{
		int start = 0;
		int end = ar.length-1;
		int mid;
		
		while(start <= end)
		{
			mid = (start+end)/2;
			
			if(ar[mid] == target)
			{
				return mid;
			}
			else if(ar[mid] < target)
			{
				start = mid +1;
			}
			else if(ar[mid] > target)
			{
				end = mid -1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		BinarySearch bs = new BinarySearch();
		
		System.out.print("Enter Array length : ");
		int len =sc.nextInt();
		
		int ar[] = new int[len];
		
		System.out.print("Enter Array values in sorted order only");
		
		for(int i =0 ;i<ar.length;i++)
		{
			System.out.print("Enter the "+ i + " index value : ");
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Enter The Target : ");
		int target =sc.nextInt();
		
		int res = bs.binary(ar, target);
		
		System.out.println("Index value : "+res);
	}
}