
package studentmanagementsystem;

import java.util.*;


public class StudentManagementSystem 
{

  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Student> as = new ArrayList();
        
        int choice = 0;
        
        Student stu;
        
        while(choice != 6)
        {
            System.out.println("===== Student Management System  =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter The Roll Number :  ");
                    int rollNo = sc.nextInt();
                    
                    System.out.print("Enter The Name :  ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter The Age :  ");
                    int age = sc.nextInt();
                    
                    System.out.print("Enter The Course :  ");
                    String course = sc1.nextLine();
                    
                    System.out.print("Enter The Marks :  ");
                    int marks = sc.nextInt();
                    
                    as.add(new Student(rollNo, name, age, course, marks));
                    break;
                }
                
                case 2:
                {
                    for(Student st:as)
                    {
                        st.display();
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter The Roll Number To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Student st:as)
                    {
                        if(st.rollNo == search)
                        {
                            st.display();
                            break;
                        }
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.print("Enter The Roll Number To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Student st:as)
                    {
                        if(st.rollNo == search)
                        {
                            System.out.print("Enter The Mark : ");
                            st.marks = sc.nextInt();
                        }
                    }
                    break;
                    
                }
                
                case 5:
                {
                    System.out.print("Enter The Roll Number To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Student st:as)
                    {
                        if(st.rollNo == search)
                        {
                            as.remove(st);
                            break;
                        }
                    }
                    break;
                    
                }
                
                case 6:
                {
                    System.out.println("Exiting...");
                    break;
                }
                
                default:
                {
                    System.out.println("Invalid Choice!");
                }
            }
        }
        
        
       
    }
    
}
