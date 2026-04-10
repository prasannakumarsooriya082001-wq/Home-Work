
package employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManagement 
{

    
    public static void main(String[] args) 
    {
        ArrayList<Employee> al = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice = 0;
        
        
        
        while(choice != 4)
        {
            System.out.println("***** Employee Management *****");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter Employee Id : ");
                    int id = sc.nextInt();
                    
                    System.out.print("Enter Employee Name : ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter Employee Department : ");
                    String dep = sc1.nextLine();
                    
                    al.add(new Employee(id, name, dep));
                    
                    System.out.println("Employee Added.");
                    break;
                }
                
                case 2:
                {
                    for(Employee emp:al)
                    {
                        emp.ViewDetails();
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter Employee Id To Search : ");
                    int id = sc.nextInt();
                    
                    for(Employee emp : al)
                    {
                        if(id == emp.employeeId)
                        {
                            emp.ViewDetails();
                            break;
                        }       
                        else
                        {
                            System.out.println("No Employee Is There In This Id!");
                        }
                    }
                    
                    break;
                }
                
                case 4:
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
