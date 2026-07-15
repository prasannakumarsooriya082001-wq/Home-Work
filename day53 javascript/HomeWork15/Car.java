package HomeWork.HomeWork15;

public class Car 
{
    @MyAnnotaion
    private Engine engine;

    public void drive()
    {
        engine.start();
        System.out.println("Car is Running...");
    }
    
}
