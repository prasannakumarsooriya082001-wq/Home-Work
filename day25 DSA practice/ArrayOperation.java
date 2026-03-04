import java.util.Scanner;

import java.util.Arrays;

class ArrayOperation
{
	Scanner sc1 = new Scanner(System.in);
	
	void acceptElements(int ar[])
	{
		System.out.print("Enter the Elements (separated by space) : ");
		for(int i = 0;i<ar.length;i++)
		{
			ar[i] = sc1.nextInt();
		}
		
		System.out.println("Array Elements accepted..");
	}
	
	void displayArray(int ar[])
	{
		System.out.print("Array Elements : ");
		for(int i = 0;i<ar.length;i++)
		{
			
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	void bubbleSort(int ar[])
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
		}	
		
		System.out.println("Array is Sorted..");
	}
	
	int[] mergeSort(int ar[])
	{
		if(ar.length<=1)
		{
			return ar;
		}
		int mid = ar.length/2;
		int left[] = mergeSort(Arrays.copyOfRange(ar,0,mid));
		int right[] = mergeSort(Arrays.copyOfRange(ar,mid,ar.length));
		return conquer(left,right);
	}
	
	int[] conquer(int left[],int right[])
	{
		int i =0;
		int j =0;
		int k =0;
		int newArray[] = new int[left.length+right.length];
		
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				newArray[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newArray[k]=right[j];
				j++;
				k++;
			}		
		}
		while(i<left.length)
		{
			newArray[k]=left[i];
				i++;
				k++;
		}
		while(j<right.length)
		{
			newArray[k]=right[j];
				j++;
				k++;
		}
		return newArray;
	}
	
	void selectionSort(int ar[])
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
            int minIndex = i;
            for (int j = i + 1; j < ar.length; j++) 
			{					
				if (ar[j] < ar[minIndex]) 
				{
                    minIndex = j;
                }
            }
			int temp = ar[i];
            ar[i] = ar[minIndex];
            ar[minIndex] = temp;					
		}
		
		System.out.println("Array is Sorted..");
	}
	
	int linearSearch(int ar[],int target)
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
	
	int binarySearch(int ar[],int target)
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
		
		ArrayOperation ao = new ArrayOperation();
		
		System.out.print("Enter array lenght : ");
		int len = sc.nextInt();
		
		int ar[] = new int[len];
		
		int choice = 0;
		
		boolean isSort = false;
		
		while(choice != 5)
		{
			System.out.println("***** Array Operation *****");
			System.out.println("1. Accept Elements");
			System.out.println("2. Display the Array");
			System.out.println("3. Sort The Array");
			System.out.println("4. Search For An Element");
			System.out.println("5. Exit");
			
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					ao.acceptElements(ar);
					break;
				}
				
				case 2:
				{
					ao.displayArray(ar);
					break;
				}
				
				case 3:
				{
					System.out.println("** Sorting option **");
					System.out.println("1. Bubble Sort");
					System.out.println("2. Merge Sort");
					System.out.println("3. Selection Sort");
					
					System.out.print("Entre the Option : ");
					int sortOption = sc.nextInt();
					
					switch(sortOption)
					{
						case 1:
						{
							ao.bubbleSort(ar);
							break;
						}
						
						case 2:
						{
							ar = ao.mergeSort(ar);
							System.out.println("Array is Sorted..");
							break;
						}
						
						case 3:
						{
							ao.selectionSort(ar);
							break;
						}
						
						default:
						{
							System.out.println("Invalid Sorting Option..");
							break;
						}
					}
					isSort = true;
					break;				
				}
				
				case 4:
				{
					System.out.println("** Searching option **");
					System.out.println("1. Linear Search");
					System.out.println("2. Binary Search");
					
					System.out.print("Enter the Option : ");
					int searchOption = sc.nextInt();
					
					System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
					
					switch(searchOption)
					{
						case 1:
						{
							int ans = ao.linearSearch(ar,key);
							if (ans != -1)
							{
								System.out.println("Element found in the index : "+ans);
							}
							else
							{
								System.out.println("Element not found..");
							}
							break;
						}
						
						case 2:
						{
							if(!isSort)
							{
								System.out.println("Array must be sorted before Binary Search!");
                                break;
							}
							
							int ans = ao.binarySearch(ar,key);
							if (ans != -1)
							{
								System.out.println("Element found in the index : "+ans);
							}
							else
							{
								System.out.println("Element not found..");
							}
							
							break;
						}
						
						default:
						{
							System.out.println("Invalid Searching Option..");
							break;
						}
					}
					break;
				}
				
				case 5:
				{
					System.out.println("Exiting....");
					break;
				}
				
				default:
				{
					System.out.println("Invalid Choice..");
					break;
				}
			}
			
		}
		sc.close();
	}
}