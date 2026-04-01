
package studentclubmanagementsystem;


public class ClubMember 
{
    String name;

    public ClubMember(String name) 
    {
        this.name = name;
    }
    
    void displayMembers()
    {
        System.out.println("Member Name : "+name);
    }
    
}
