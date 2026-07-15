package HomeWork.DependencyInjection;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Car car = Injector.createCarEngine();
        car.drive();
        
    }
    
}
