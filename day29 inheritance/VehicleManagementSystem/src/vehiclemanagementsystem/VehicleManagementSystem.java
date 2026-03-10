
package vehiclemanagementsystem;


public class VehicleManagementSystem 
{

    
    public static void main(String[] args) 
    {
        System.out.println("Vehicle Management System");
        System.out.println("-------------------------");
        
        
        Car car  = new Car("Toyota", 2022 , 5);
        MotorCycle mc = new MotorCycle("Yamaha", 2020,"Sports");
        
        
        System.out.println("CAR :");
        car.displayInfo();
        System.out.println("BIKE :");
        mc.displayInfo();
    }
    
}
