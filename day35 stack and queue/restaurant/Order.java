
package restaurant;

import java.util.Queue;
import java.util.LinkedList;

public class Order 
{
    Queue q = new LinkedList();
    
    void addOrder(String item)
    {
        q.offer(item);
    }
    
    void serveOrder()
    {
        if (q.isEmpty()) 
        {
            System.out.println("No orders to serve");
        } 
        else 
        {
            System.out.println("Served order: " + q.poll());
        }
    }
    
    void nextOrder()
    {
        if (q.isEmpty()) 
        {
            System.out.println("No orders available");
        } 
        else 
        {
            System.out.println("Next order: " + q.peek());
        }
    }
    
    void displayOrder()
    {
        if (q.isEmpty()) 
        {
            System.out.println("No pending orders");
        } 
        else 
        {
            System.out.println("Pending orders: " + q);
        }
    }
}
