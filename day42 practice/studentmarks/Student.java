
package studentmarks;


public class Student 
{
    String name;

    public Student(String name) 
    {
        this.name = name;
    }
    
    public class Marks
    {
        int mark1;
        int mark2;
        int mark3;

        public Marks(int mark1, int mark2, int mark3)
        {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        
        
        
        
        void display()
        {
            System.out.println("Student Name : "+name);
            System.out.println("Mark 1 : "+mark1);
            System.out.println("Mark 2 : "+mark2);
            System.out.println("Mark 3 : "+mark3);
        }
        
        void avg()
        {
            double avg  = (mark1+ mark2 +mark3)/3;
            System.out.println("Avearge : "+avg);
        }
        
        String getName()
        {
            return name;
        }
    }
}
