import java.util.Scanner;

class PBVAR //pass by value and reference
{
	
	int marks;
	void passByValue(int marks)
	{
		marks+=10;
		System.out.println("Inside Method Call : "+ marks);
	}
	
	void passByReference(PBVAR s)
	{
		s.marks += 10;
		System.out.println("Inside Method : "+ s.marks);
	}
	
	void passByValue1(String name)
	{
		name += " kumar";
		System.out.println("Inside Method : "+ name);
	}
	
	void passByReference1(int br[])
	{
		br[0] = 10;
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		
		
		PBVAR vr = new PBVAR();
		
		int choice = 0;
		//int marks;
		
		while(choice != 5)
		{
			System.out.println("***** MENU OPTIONS *****");
			System.out.println("1. Pass By Value - Increase Marks");
			System.out.println("2. Pass By Reference - Update Student Marks");
			System.out.println("3. Pass By Value - Change String");
			System.out.println("4. Pass By Reference - Modify Array");
			System.out.println("5. Exit");
			
			System.out.print("Enter the Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.print("Enter the Mark : ");
					int mark = sc.nextInt();
					
					System.out.println("Before Method Call : " + mark);
					
					vr.passByValue(mark);
					
					System.out.println("After Method Call : " + mark);
					
					break;
				}
				
				case 2:
				{
					
					
					System.out.print("Enter the Student Marks : ");		
					vr.marks =sc.nextInt();
					
					System.out.println("Before method call : " + vr.marks);
					
					vr.passByReference(vr);
					
					System.out.println("After method call : " + vr.marks);
					
					break;
				}
				
				case 3:
				{
					System.out.print("Enter the Name : ");
					String str = sc1.nextLine();
					
					System.out.println("Before Method Call : "+ str);
					
					vr.passByValue1(str);
					
					System.out.println("After Method Call : "+ str);
					
					break;
				}
				
				case 4:
				{
					int arr[] = new int[3];
					
					for(int i =0 ;i<3;i++)
					{
						System.out.print("Enter the "+ i + " Index Value : ");
						arr[i]=sc.nextInt();
					}
					
					System.out.print("Before Method Call : ");
					for(int i =0 ;i<3;i++)
					{
						System.out.print(arr[i]+ " ");			
					}
					
					vr.passByReference1(arr);
					
					System.out.println();
					System.out.print("After Method Call : ");
					for(int i =0 ;i<3;i++)
					{
						System.out.print(arr[i]+ " ");			
					}
					System.out.println();
					break;
				}
				
				case 5:
				{
					System.out.print("Program Exited Successfully...");
					break;
				}
				
				default:
				{
					System.out.print("Invalid Choice ...");				
				}
			}
			
			
		}
	}
}