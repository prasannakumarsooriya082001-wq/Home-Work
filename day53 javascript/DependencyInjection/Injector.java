package HomeWork.DependencyInjection;

import java.lang.reflect.Field;

public class Injector 
{
    public static Car createCarEngine() throws Exception
    {
        Car car = Car.class.getDeclaredConstructor().newInstance();
        Field field = Car.class.getDeclaredField("engine");

        if(field.isAnnotationPresent(inject.class))
        {
            Engine engine = Engine.class.getDeclaredConstructor().newInstance();
            field.setAccessible(true);
            field.set(car, engine);
        }
        

        return car;
    }
    
}
