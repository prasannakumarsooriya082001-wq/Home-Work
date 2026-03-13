
package employeemanagementsystem1;

import java.util.Scanner;


public class EmployeeManagementSystem1 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        Employye emp = new Employye();
        
        System.out.print("Enter Employee Id : ");
        
        emp.setEmpId(sc.nextInt());
        
        System.out.print("Enter Employee Name : ");
        emp.setEmpName(sc1.nextLine());
        
        System.out.print("Enter the Designation : ");
        emp.setDesignation(sc1.nextLine());
        
        System.out.print("Enter The Salary : ");
        emp.setSalary(sc.nextInt());
        
        emp.displayEmployeeDetail();
    }
    
}
