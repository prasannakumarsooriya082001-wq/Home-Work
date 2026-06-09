
package employeejdbc;


public class EmployeeModel 
{
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public EmployeeModel() {
    }

    public EmployeeModel(String emp_name, double emp_salary) {
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    
    
}
