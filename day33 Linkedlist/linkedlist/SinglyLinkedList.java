
package linkedlist;


public class SinglyLinkedList 
{
    Node head;
    
    void intsertBegin(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next=newNode;
        }
    }
    
    
    void insertMiddle(int data, int position) {

        Node newNode = new Node(data);

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    void display()
    {
        Node temp=head;
        
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        
    }
}
