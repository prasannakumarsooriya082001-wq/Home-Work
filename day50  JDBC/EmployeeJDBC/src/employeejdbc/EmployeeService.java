
package employeejdbc;

import java.sql.SQLException;
import java.util.List;


public class EmployeeService 
{
    EmployeeDAO ed = new EmployeeDAO();
    
    public void addEmp(EmployeeModel em) throws ClassNotFoundException, SQLException
    {       
        int res = ed.addEmployee(em);
        
        if(res > 0)
        {
            System.out.println("Employee Added Succesfully...");
        }
        else
        {
            System.out.println("Employee Not Added!");
        }
    }
    
    public List viewEmp() throws ClassNotFoundException, SQLException
    {
        List list = ed.viewEmployee();
        return list;
    }
    
    public EmployeeModel searchEmp(int Emp_id) throws ClassNotFoundException, SQLException
    {
        EmployeeModel em = ed.searchEmployee(Emp_id);
        
        return em;
    }
    
    public void deleteEmp(int Emp_id) throws ClassNotFoundException, SQLException
    {       
        int res = ed.deleteEmployee(Emp_id);
        
        if(res > 0)
        {
            System.out.println("Employee Deleted Succesfully...");
        }
        else
        {
            System.out.println("Employee Not Deleted!");
        }
    }
}
