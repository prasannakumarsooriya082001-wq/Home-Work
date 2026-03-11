
package calculatearea;


public class Square extends Shape
{

    public Square(int side) {
        super(side);
    }

    @Override
    void calculateArea() 
    {
        double ans = value * value;
        
        System.out.println("AREA OF SQUARE : "+ans);
    }
    
}
