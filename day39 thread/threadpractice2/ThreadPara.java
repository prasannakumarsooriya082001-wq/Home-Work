
package threadpractice2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadPara extends Thread
{
    String text = "HAI HAI SIR HOW CAN I HELP YOU CAN YOU TELL ME ABOUT JAVA SURE JAVA IS A PROGRAMMING LANGUAGE";
    
    @Override
    public void run() 
    {
        for(int i = 0 ;i<text.length();i++)
        {
            System.out.println(text.charAt(i));
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPara.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
