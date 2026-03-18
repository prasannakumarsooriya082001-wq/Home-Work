
package circularlinkedlist;


public class CircularList 
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
            head.next = head;
            tail.next = tail;
        }
        
        else
        {
            
            newNode.next = head;
            tail.next = newNode;
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
            head.next = head;
            tail.next = tail;
       }
       else
       {
           newNode.next = head;
           tail.next = newNode;
           tail = newNode;
       }
       
   }
   
   void deleteBegining()
   {
       if(head == tail)
       {
           head = null;
           tail = null;
       }
       else
       {
           head = head.next; 
           tail.next = head;
       }
         
   }
    
   void deleteEnd()
   {
       
       
       if(head == tail)
       {
           head = null;
           tail = null;
       }
       
       Node temp = head;
       
       while(temp.next != tail)
       {
           temp = temp.next;
       }
       temp.next=head;
       tail = temp;
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
            
            do
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }while(temp != head);
            System.out.println();
        }
    }
    
    
    
    
    
}
