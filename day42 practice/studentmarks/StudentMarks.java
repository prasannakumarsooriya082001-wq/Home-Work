
package studentmarks;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentMarks {

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Student.Marks> al  = new ArrayList();
        
        for(int i= 0 ;i<3;i++)
        {
            System.out.print("Enter the Name  : ");
            String name = sc1.nextLine();
        
            Student st =new Student(name);
            
            System.out.print("Enter the mark1 : ");
            int mark1 = sc.nextInt();
        
            System.out.print("Enter the mark2 : ");
            int mark2 = sc.nextInt();
        
            System.out.print("Enter the mark3 : ");
            int mark3 = sc.nextInt();
            
            Student.Marks sm = st.new Marks(mark1,mark2,mark3);

            al.add(sm);
            
        }
        
        System.out.print("Enter the Name to search : ");
        String name = sc1.nextLine();
        
        for(Student.Marks smm:al)
        {
            if(smm.getName().equalsIgnoreCase(name))
            {
                smm.display();
                smm.avg();
            }
        }
        

    }
    
}
