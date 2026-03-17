
package linkedlist;


public class LinkedList 
{

   
    public static void main(String[] args) 
    {
       SinglyLinkedList sll = new SinglyLinkedList();
        
       sll.intsertBegin(30);
       sll.intsertBegin(20);
       sll.intsertBegin(10);
       
       sll.insertMiddle(25,3);
       
       sll.insertEnd(40);
       
       sll.display();
    }
    
}
