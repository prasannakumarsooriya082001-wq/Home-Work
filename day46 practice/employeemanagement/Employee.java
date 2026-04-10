
package employeemanagement;


public class Employee 
{
    int employeeId;
    String employeeName;
    String employeeDeapartment;

    public Employee(int employeeId, String employeeName, String employeeDeapartment)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDeapartment = employeeDeapartment;
    }
    
    void ViewDetails()
    {
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Department : "+employeeDeapartment);
    }
}
