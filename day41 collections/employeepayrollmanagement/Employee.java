
package employeepayrollmanagement;

public class Employee 
{
    int empId;
    String empName;
    String department;
    double bSalary;

    public Employee(int empId, String empName, String department, double bSalary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.bSalary = bSalary;
    }
    
    
    void display()
    {
        System.out.println("Employee Id : "+empId);
        System.out.println("Empoyee Name : "+empName);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+bSalary);
    }
    
    
}
