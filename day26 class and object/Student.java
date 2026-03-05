import java.util.Scanner;

class Student
{	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		StudentDetails sd = new StudentDetails();
		
		int choice = 0;
		
		while(choice != 4)
		{
			System.out.println("----- STUDENT DETAILS ----- ");
			System.out.println("1 -> Add Student Deatils");
			System.out.println("2 -> Update Student Details");
			System.out.println("3 -> Display Student Deatils");
			System.out.println("4 -> Exit");
			
			System.out.print("Enter the Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{	
					System.out.print("Enter The Student Name : ");
					String name = sc1.nextLine();
					
					sd.addStudent(name);
					System.out.println("Student details saved.");
					break;
				}
				
				case 2:
				{
					System.out.print("Enter roll number to update : ");
					int rollNo = sc.nextInt();
					
					sd.updateStudent(rollNo);
					
					break;
				}
				
				case 3:
				{
					sd.displayStudent();
					
					break;
				}
				
				case 4:
				{
					System.out.println("Exiting....");
					break;
				}
				
				default:
				{
					System.out.println("INVALID CHOICE.");
				}
			}
			
			
		}
		sc.close();
	}
	
	
}