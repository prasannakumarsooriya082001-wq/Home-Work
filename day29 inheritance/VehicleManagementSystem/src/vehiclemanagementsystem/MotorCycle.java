
package vehiclemanagementsystem;


public class MotorCycle extends Vehicle
{
    String type;

    public MotorCycle(String brand, int year, String type) 
    {
        super(brand, year);
        this.type = type;
    }
    

    void displayInfo()
    {
       super.displayInfo();
        System.out.println("Type : "+type);
    }
    
    
}
