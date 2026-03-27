
package employeepayrollmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollManagement 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Employee> ae = new ArrayList();
        
        int choice = 0;
        
        Employee emp;
        
        while(choice != 7)
        {
            System.out.println("===== Employee Management System  =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee ");
            System.out.println("4. Delete Employee");
            System.out.println("5. Calculate Net Salary : ");
            System.out.println("6. View All Employee");
            System.out.println("7. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter The Employee Id :  ");
                    int eId = sc.nextInt();
                    
                    System.out.print("Enter The Employee Name :  ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter The Department :  ");
                    String dep = sc1.nextLine();
                    
                    System.out.print("Enter the Basic Salary : ");
                    double salary = sc.nextDouble();
                    
                    ae.add(new Employee(eId, name, dep, salary));
                    
                    System.out.println("Employee Added.");
                    break;
                }
                
                case 2:
                {
                    System.out.print("Enter The Employee Id To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Employee st:ae)
                    {
                        if(st.empId == search)
                        {
                            st.display();
                            break;
                        }
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter The Employee Id To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Employee st:ae)
                    {
                        if(st.empId == search)
                        {
                            System.out.print("Enter The Salary : ");
                            st.bSalary = sc.nextDouble();
                            break;
                        }
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.print("Enter The Employee Id To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Employee st:ae)
                    {
                        if(st.empId == search)
                        {
                            ae.remove(st);
                            break;
                        }
                    }
                    break;
                }
                
                case 5:
                {
                   System.out.print("Enter The Employee Id To Be Search : ");
                   int search = sc.nextInt();
                    
                    for(Employee st:ae)
                    {
                        if(st.empId == search)
                        {
                            double netSalary = (st.bSalary + (st.bSalary *0.2) +(st.bSalary * 0.1)-(st.bSalary * 0.05));
                            System.out.println("Net Salary : " +netSalary);
                            break;
                        }
                    }
                    break;
                    
                }
                
                case 6:
                {
                    for(Employee st:ae)
                    {
                        st.display();
                    }
                    break;
                }
                
                case 7:
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
