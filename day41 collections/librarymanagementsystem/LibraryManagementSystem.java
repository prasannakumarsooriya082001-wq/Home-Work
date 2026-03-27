
package librarymanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManagementSystem {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Book> ab = new ArrayList();
        
        int choice = 0;
        
        Book book;
        
        while(choice != 7)
        {
            System.out.println("===== Book Management System  =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Delete Book");
            System.out.println("6. View All Book");
            System.out.println("7. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter The Book Id :  ");
                    int bookId = sc.nextInt();
                    
                    System.out.print("Enter The Title :  ");
                    String name = sc1.nextLine();
                    
                    System.out.print("Enter The Author Name :  ");
                    String name1 = sc1.nextLine();
                    
                    ab.add(new Book(bookId, name, name1));
                    System.out.println("Book Added Succesfully.");
                    break;
                }
                
                case 2:
                {
                    System.out.print("Enter The Book Id To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Book st:ab)
                    {
                        if(st.bookId == search)
                        {
                            st.display();
                            break;
                        }
                        else
                        {
                            System.out.println("No Book In This Id");
                        }
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter The Book Id : ");
                    int search = sc.nextInt();
                    
                    for(Book st:ab)
                    {
                        if(st.bookId == search)
                        {
                            if(st.status)
                            {
                                st.status = false;
                                System.out.println("Book Issued ...");
                                break;
                            }  
                            else
                            {  
                                System.out.println("Book Not Available.");
                            }
                        }
                    }
                    break;
                    
                }
                
                case 4:
                {
                    System.out.print("Enter The Book Id : ");
                    int search = sc.nextInt();
                    
                    for(Book st:ab)
                    {
                        if(st.bookId == search)
                        {
                            if(!st.status)
                            {
                                st.status = true;
                                System.out.println("Book Returned ...");
                                break;
                            }
                            else
                            {
                                System.out.println("Waring!!!");
                            }
                        }
                    }
                    break;
                    
                }
                
                case 5:
                {
                    System.out.print("Enter The Book Id To Be Search : ");
                    int search = sc.nextInt();
                    
                    for(Book st:ab)
                    {
                        if(st.bookId == search)
                        {
                            ab.remove(st);
                            break;
                        }
                    }
                    break;
                    
                }
                case 6:
                {
                    for(Book st:ab)
                    {
                        st.display();
                    }
                    break;
                }
                
                case 7:
                {
                    System.out.println("Exiting...");
                    break;
                }
                
                default:
                {
                    System.out.println("Invalid Choice!");
                }
            }
        }
    }
    
}
