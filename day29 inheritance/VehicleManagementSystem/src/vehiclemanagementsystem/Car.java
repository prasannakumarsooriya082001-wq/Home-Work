
package vehiclemanagementsystem;


public class Car extends Vehicle
{
    int seats;
    
    public Car(String brand, int year , int seats) {
        super(brand, year);
        
        this.seats = seats;
    }
    
    void displayInfo()
    {
       super.displayInfo();
        System.out.println("Seats : "+seats);
    }
    
}
