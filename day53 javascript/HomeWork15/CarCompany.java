package HomeWork.HomeWork15;

import java.lang.reflect.Field;

public class CarCompany 
{

    public static Car createCarEngine() throws Exception
    {
        Car car = Car.class.getDeclaredConstructor().newInstance();
        Field field = Car.class.getDeclaredField("engine");

        if(field.isAnnotationPresent(MyAnnotaion.class))
        {
            Engine engine = Engine.class.getDeclaredConstructor().newInstance();
            field.setAccessible(true);
            field.set(car, engine);
        }

        return car;
    }
}
