
package royalbaker;


public class RoyalBaker {

    
    public static void main(String[] args)
    {
        double incredient[] = {1.2, 0.5, 2.3, 1.8};
        
        double total = 0;
        
        for(int i = 0;i<incredient.length;i++)
        {
            total += incredient[i];
        }
        
        double max = incredient[0];
        
        for(int i = 0;i<incredient.length;i++)
        {
            if(incredient[i] > max)
            {
                max = incredient[i];
            }
        }
        
        System.out.println(total + "," + max);
    }
    
}
