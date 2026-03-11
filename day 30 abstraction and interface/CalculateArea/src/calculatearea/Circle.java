
package calculatearea;


public class Circle extends Shape
{
    

    public Circle(int radius) {
        super(radius);
    }

    @Override
    void calculateArea() 
    {
        double ans = 3.14 * value * value;
        System.out.println("AREA OF CIRCLE : "+ans);
    }
    
}
