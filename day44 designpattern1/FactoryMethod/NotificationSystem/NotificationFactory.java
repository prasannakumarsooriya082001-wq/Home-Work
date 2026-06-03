
package notificationsystem;


abstract public class NotificationFactory 
{
    abstract Notification createNotification();
    
    void notification()
    {
        Notification n = createNotification();
        n.sendMessage();
    }
}
