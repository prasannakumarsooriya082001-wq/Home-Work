
package employeejdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class EmployeeJDBC {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice = 0;
        
        EmployeeModel em = null;
        EmployeeService es = new EmployeeService();
        
        while(choice != 5)
        {
            System.out.println("***** Employee Management System *****");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees"); 
            System.out.println("3. Search Employee by ID"); 
            System.out.println("4. Delete Employee"); 
            System.out.println("5. Exit");
            
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter Employee Name : ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter Employee Salary : ");
                    double salary = sc.nextDouble();
                    
                    em = new EmployeeModel(name, salary);
                    es.addEmp(em);
                    
                    break;
                }
                
                case 2:
                {
                    List<EmployeeModel> list = es.viewEmp();
                    for(EmployeeModel emm : list)
                    {
                        System.out.println("*******************");
                        System.out.println("Employee Id : "+ emm.getEmp_id());
                        System.out.println("Employee Name : "+emm.getEmp_name());
                        System.out.println("Employee Salary : "+emm.getEmp_salary());
                        System.out.println("*******************");
                    }
                    break;  
                }
                
                case 3:
                {
                    System.out.print("Enter Employee Id To Search : ");
                    int id = sc.nextInt();
                    
                    em = es.searchEmp(id);
                    
                    if(em == null)
                    {
                        System.out.println("No Employee Found!");
                    }
                    else
                    {
                        System.out.println("*******************");
                        System.out.println("Employee Id : "+ em.getEmp_id());
                        System.out.println("Employee Name : "+em.getEmp_name());
                        System.out.println("Employee Salary : "+em.getEmp_salary());
                        System.out.println("*******************");
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.print("Enter Employee Id To Delete : ");
                    int id = sc.nextInt();
                    
                    es.deleteEmp(id);
                    break;
                }
                
                case 5:
                {
                    System.out.println("Exiting...");
                    break;
                }
                
                default:
                {
                    System.out.println("Invaild Choice!");
                }
            }
        }
        
    }
    
}
