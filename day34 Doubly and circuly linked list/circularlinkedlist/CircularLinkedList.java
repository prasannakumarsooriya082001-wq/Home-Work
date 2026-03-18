
package circularlinkedlist;

public class CircularLinkedList 
{


    public static void main(String[] args) 
    {
        CircularList cl = new CircularList();
        
        cl.insertBegining(20);
        cl.insertBegining(10);
        
        cl.insertEnd(30);
        cl.insertEnd(40);
        
        System.out.println("Circular Linked List: ");
        cl.forWardDisplay();
        
        cl.deleteBegining();
        System.out.println("After Deleting from Beginning: ");
        cl.forWardDisplay();
        
        cl.deleteEnd();
        System.out.println("After Deleting from End: ");
        
        cl.forWardDisplay();
    }
    
}
