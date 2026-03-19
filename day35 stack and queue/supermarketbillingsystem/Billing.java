
package supermarketbillingsystem;

import java.util.Stack;

public class Billing 
{
    Stack s = new Stack();
    void addItem(String Item)
    {
        s.push(Item);
    }
    
    void undoLastItem()
    {
        if (s.empty()) 
        {
            System.out.println("No items to remove");
        } 
        else 
        {
            
            System.out.println("Removed last scanned item: " + s.pop());
        }
    }
    
    void ViewLastScannedItem()
    {
        if (s.empty()) 
        {
            System.out.println("No items in stack");
        } 
        else 
        {
            System.out.println("Last scanned item: " + s.peek());
        }       
    }
    
    void displayAllItem()
    {
        if (s.empty()) 
        {
            System.out.println("No items scanned");
        } 
        else 
        {
            System.out.println("Scanned items: " + s);
        }
    }
    
    
    
}
