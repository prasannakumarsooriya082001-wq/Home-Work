
package proxy;


public class Proxy
{

    
    public static void main(String[] args)
    {
        Movie customer = new MovieProxy(20);
        customer.watchMovie();
    }
    
}
