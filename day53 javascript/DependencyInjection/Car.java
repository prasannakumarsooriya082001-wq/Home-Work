package HomeWork.DependencyInjection;

public class Car 
{
    @inject
    private Engine engine;
    public void drive()
    {
        engine.start();
        System.out.println("Car is Running...");

    }
    
}
