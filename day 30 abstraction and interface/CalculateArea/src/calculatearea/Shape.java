
package calculatearea;


public abstract class Shape 
{
    int value;
    
    Shape(int value)
    {
        this.value = value;
    }
    
    abstract void calculateArea();
}
