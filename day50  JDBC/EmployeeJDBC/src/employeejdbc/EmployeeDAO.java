
package employeejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO 
{
    public Connection dbConnection() throws ClassNotFoundException, SQLException
    {  
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Employee_Details";
        String userName = "postgres";
        String pass = "prasanna@08";
        Connection con = DriverManager.getConnection(url, userName, pass);
       
        return con;
    }
    
    public int addEmployee(EmployeeModel em) throws ClassNotFoundException, SQLException
    {
        try 
        {
            Connection conn = dbConnection();

            PreparedStatement psmt = conn.prepareStatement("insert into employee (emp_name,emp_salary) values (?,?)");

            psmt.setString(1, em.getEmp_name());
            psmt.setDouble(2, em.getEmp_salary());

            int res = psmt.executeUpdate();

            conn.close();
            psmt.close();

            return res;
        } 
        catch (Exception e) 
        {
            System.out.println("Error : " + e.getMessage());

            return 0;
        }
    }
    
    
    public List viewEmployee() throws ClassNotFoundException, SQLException
    {
        
        List<EmployeeModel> list = new ArrayList();
        
        try 
        {
            Connection conn = dbConnection();
            
            PreparedStatement psmt = conn.prepareStatement("select * from employee");
            
            ResultSet rs = psmt.executeQuery();

            while(rs.next())
            {
                EmployeeModel em = new EmployeeModel();
                
                em.setEmp_id(rs.getInt("emp_id"));
                em.setEmp_name(rs.getString("emp_name"));
                em.setEmp_salary(rs.getDouble("emp_salary"));
                
                list.add(em);
            }

            conn.close();
            psmt.close();

            return list;
        } 
        catch (Exception e) 
        {
            System.out.println("Error : " + e.getMessage());
        }
        
        return null;
    }
    
    
    
    public EmployeeModel searchEmployee(int Emp_id) throws ClassNotFoundException, SQLException
    {
        try 
        {
            Connection conn = dbConnection();

            EmployeeModel em = new EmployeeModel();
                            
            PreparedStatement psmt = conn.prepareStatement("select * from employee where emp_id = ?");

            psmt.setInt(1, Emp_id);

            ResultSet rs  = psmt.executeQuery();
            
            if(rs.next())
            {                
                em.setEmp_id(rs.getInt("emp_id"));
                em.setEmp_name(rs.getString("emp_name"));
                em.setEmp_salary(rs.getDouble("emp_salary"));             
            }

            conn.close();
            psmt.close();

            return em;
        } 
        catch (Exception e) 
        {
            System.out.println("Error : " + e.getMessage());
            return null;
        }
    }
    
    
     public int deleteEmployee(int Emp_id) throws ClassNotFoundException, SQLException
    {
        try 
        {
            Connection conn = dbConnection();

            EmployeeModel em = new EmployeeModel();
                            
            PreparedStatement psmt = conn.prepareStatement("delete from employee where emp_id = ?");

            psmt.setInt(1, Emp_id);

            int res  = psmt.executeUpdate();

            conn.close();
            psmt.close();

            return res;
        } 
        catch (Exception e) 
        {
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
    }
    
    
    
    
}
