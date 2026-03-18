
package doublylinkedlist1;


public class DoublyList 
{
    Node head;
    Node tail;
    
    void insertBegining(int data)
    {
        
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
            tail = newNode;           
        }
        
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }       
    }
    
   void insertEnd(int data)
   {
       Node newNode = new Node(data);
       
       if(head == null)
       {
            head = newNode;
            tail = newNode;           
       }
       else
       {
           newNode.prev = tail;
           tail.next = newNode;
           tail = newNode;
       }
       
   }
   
   void deleteBegining()
   {
       head = head.next;      
   }
    
   void deleteEnd()
   {
       Node temp = head;
       
       while(temp != null)
       {
           if(temp.next.next == null)
           {
               temp.next = null;
           }
           temp = temp.next;
       }
   }
   
    void forWardDisplay()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("Lsit is Empty");
        }
        else
        {
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    
    
    
    void backDisplay()
    {
        Node temp = tail;
        if(temp == null)
        {
            System.out.println("Lsit is Empty");
        }
        else
        {
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp=temp.prev;
            }
            System.out.println();
        }
    }
    
    
    
    
}
