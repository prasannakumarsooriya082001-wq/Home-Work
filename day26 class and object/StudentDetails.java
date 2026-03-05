import java.util.Scanner;

class StudentDetails
{
	Scanner sc = new Scanner(System.in);
	
	String std[] = new String[10];
	
	int rollNumber[] = new int[10]; 
	int rollNo = 100;
	
	int count = 0;
	
	void addStudent(String name)
	{
		std[count] = name;
		rollNumber[count] = ++rollNo;
		count++;
	}
	
	void updateStudent(int rollNo)
	{
		boolean found = false;
		
		for(int i = 0; i<count;i++)
		{
			if(rollNo == rollNumber[i])
			{
				System.out.print("Enter The New Name : ");
				String newName = sc.nextLine();
				std[i] = newName; 
				System.out.println("Student Name Updated.");

				found = true;
			}
		}
		
		if(!found)
		{
			System.out.println("Student not found");
		}
	}
	
	void displayStudent()
	{
		if(count == 0)
		{
			System.out.println("No student found");
			return;
		}
		for(int i = 0;i<count;i++)
		{
			System.out.println("Name "+ (i+1) +": " + std[i] + " Roll Number : "+rollNumber[i]);
		}
	}
	
	
}