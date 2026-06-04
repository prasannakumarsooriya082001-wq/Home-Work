
package proxy;


public class MovieProxy implements Movie
{
    private int age;
    private MoviePlay movie;

    MovieProxy(int age) 
    {
        this.age = age;
        movie = new MoviePlay();
    }

    @Override
    public void watchMovie() 
    {
        if(age >= 18) 
        {
            System.out.println("Age Verified");
            movie.watchMovie();
        } 
        else 
        {
            System.out.println("Below 18");
            System.out.println("Access Denied");
        }
    }
    
}
