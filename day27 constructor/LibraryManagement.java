class LibraryManagement
{
	int bookId;
	String title;
	String author;
	boolean isAvailable = true;
	
	LibraryManagement(int bookId, String title, String author)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	
	void display()
	{
		System.out.println("--------------------");
		System.out.println("Book Id : "+ bookId);
		System.out.println("Title : "+ title);
		System.out.println("Author : "+ author);
		System.out.println("Status : "+ (isAvailable ? "Available" : "Not Available" ));
		System.out.println("--------------------");
	}
	
	void borrowBook()
	{
		if(isAvailable)
        {
            isAvailable = false;
            System.out.println("Book Borrowed Successfully");
        }
        else
        {
            System.out.println("Book Already Borrowed");
        }
	}
	
	void returnBook()
	{
		isAvailable = true;
        System.out.println("Book Returned Successfully");
	}
}