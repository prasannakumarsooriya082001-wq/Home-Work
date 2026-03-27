
package librarymanagementsystem;


public class Book 
{
    int bookId;
    String bookTitle;
    String authorName;
    boolean status = false;

    public Book(int bookId, String bookTitle, String authorName) 
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        status = true;
    }
    
    void display()
    {
        System.out.println("Book Id : "+bookId);
        System.out.println("Book Title : "+bookTitle);
        System.out.println("Author Name : "+authorName);
        System.out.println("Book Status : "+(status ? "Available" : "Not Available"));
    }
    
}
