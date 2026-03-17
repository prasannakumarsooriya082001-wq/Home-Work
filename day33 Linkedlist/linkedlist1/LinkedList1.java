
package linkedlist1;


public class LinkedList1 
{

    
    public static void main(String[] args)
    {
        
       SinglyLinkedList sll = new SinglyLinkedList();
        
       sll.intsertBegin("Ravi");
       sll.intsertBegin("Kumar");
       sll.intsertBegin("Arun");
       
       sll.insertMiddle("Vijay",3);
       
       sll.insertEnd("Ajay");
       
       sll.display();
    }
    
}
