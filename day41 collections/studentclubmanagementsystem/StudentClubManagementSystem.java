
package studentclubmanagementsystem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentClubManagementSystem 
{

    public static void main(String[] args) 
    {
        Scanner sc = new  Scanner(System.in);
        Scanner sc1 = new  Scanner(System.in);
        
        Set<String> s  = new HashSet();
        
        int choice = 0;
        
        while(choice != 6)
        {
            System.out.println("===== Student Club Management System =====");
            System.out.println("1. Add Members");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Total Members");
            System.out.println("6. Exit");
            
            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the Member Name To Add : ");
                    String str = sc1.nextLine();
                    
                    
                    s.add(str);
                    break;
                }
                
                case 2:
                {
                    System.out.print("Enter the Member Name To Remove : ");
                    String str = sc1.nextLine();
                    
                    if(s.remove(str))
                    {
                        
                        System.out.println("Member Removed Successfully.");
                    }
                    else
                    {
                        System.out.println("Member Not Found.");
                    }
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter the Member Name To Be Search : ");
                    String str = sc1.nextLine();
                    
                    if(s.contains(str))
                    {
                        System.out.println("Member is Present.");
                    }
                    else
                    {
                        System.out.println("Member is Not Present.");
                    }
                    break;
                }
                
                case 4:
                {
                    System.out.println("Members : "+s);
                    break;
                }
                
                case 5:
                {
                    System.out.println("Total Members : "+s.size());
                    break;
                }
                
                case 6:
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
