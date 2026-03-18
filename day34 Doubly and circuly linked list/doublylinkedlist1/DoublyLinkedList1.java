
package doublylinkedlist1;

public class DoublyLinkedList1 
{

    
    public static void main(String[] args) 
    {
        DoublyList dl  = new DoublyList();
        
        
        
        dl.insertBegining(20);
        dl.insertBegining(10);
        
        
                
        dl.insertEnd(30);
        dl.insertEnd(40);
        
        
        System.out.println("Forward Display: ");
        dl.forWardDisplay();
        
        System.out.println("Backward Display: ");
        dl.backDisplay();
        
        
        dl.deleteBegining();
        System.out.println("After Deleting from Beginning: ");
        dl.forWardDisplay();
        
        dl.deleteEnd();
        System.out.println("After Deleting from End: ");
        dl.forWardDisplay();

        
        
    }
    
}
