
package employeemanagementsystem;


public class EmployeeManagementSystem 
{

    
    public static void main(String[] args) 
    {
        System.out.println("Employee Management System");
        System.out.println("-------------------------");

        
        Employee em = new Employee("Alice", 50000.0);
        Manager mn = new Manager("Bob", 50000.0,"IT");
        
        
        System.out.println("EMPLOYEE : ");
        em.displayInfo();
        
        System.out.println("MANAGER  : ");
        mn.displayInfo();
    }
    
}
