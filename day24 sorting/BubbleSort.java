import java.util.Arrays;

class BubbleSort
{
	int bubble(int[] ar,int count)
	{
		for(int i = 0;i<ar.length-1;i++)
		{
			for(int j = 0;j<ar.length-1-i;j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args)
	{
		int ar[]={5,1,4,2,8,3};
		
		int count = 0 ;
		
		BubbleSort bs = new BubbleSort();
		
		int ans = bs.bubble(ar, count);
		
		System.out.println(Arrays.toString(ar) + " Number of Passes : "+ ans);
		
		
		
	}
}