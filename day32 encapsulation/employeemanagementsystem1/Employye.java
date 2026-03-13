
package employeemanagementsystem1;


public class Employye 
{
    private int empId;
    private String empName;
    private String designation;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary cannot be negative");
    }
    
    void displayEmployeeDetail()
    {
        System.out.println("***** Employee Details *****");
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Name :" +empName);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}
