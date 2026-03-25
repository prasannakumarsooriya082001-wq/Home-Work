
package threadpractice1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadName extends Thread
{
     String[] names = {"DIWAKAR", "KARTHIK", "RAJESH", "SATHISH", "SURYA"};
     
     @Override
     public void run()
     {
         for(int i = 0; i < names.length;i++)
        {
            System.out.println(names[i]);
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(ThreadName.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
     }
     
}
