
package adapterpattern;

import java.util.Scanner;


public class AdapterPattern 
{

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Marks: ");
        int marks = sc.nextInt();
        
        OldMarkSystem oldSystem = new OldMarkSystem(marks);

        
        GradeSystem adapter = new MarkAdapter(oldSystem);

       
        System.out.println("Grade: " + adapter.getGrade());
    }
    
}
