
package notificationsystem;

public class NotificationSystem
{

    public static void main(String[] args) throws InterruptedException 
    {
        NotificationFactory factory ;
        
        factory = new EmailFactory();
        factory.notification();
        
        Thread.sleep(2000);
        
        factory = new PushFactory();
        factory.notification();
        
        Thread.sleep(2000);
        
        factory = new SMSFactory();
        factory.notification();
        
        
    }
    
}
