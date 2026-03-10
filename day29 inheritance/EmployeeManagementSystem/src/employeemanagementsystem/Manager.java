
package employeemanagementsystem;


public class Manager extends Employee
{
    String department;
    
    public Manager(String name, double salary, String department) {
        super(name , salary);
        this.department = department;
    }
    
    
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Department : "+ department);
    }
}
