
package adapterpattern;


public class MarkAdapter implements GradeSystem
{
    OldMarkSystem oldmarksystem;

    public MarkAdapter(OldMarkSystem oldmarksystem) {
        this.oldmarksystem = oldmarksystem;
    }
    
    
    
    @Override
    public String getGrade() 
    {
        int marks = oldmarksystem.totalMarks;

        if (marks >= 90) 
        {
            return "A";
        } 
        else if (marks >= 75) 
        {
            return "B";
        } 
        else if (marks >= 60) 
        {
            return "C";
        } 
        else if (marks >= 50) 
        {
            return "D";
        } 
        else 
        {
            return "F";
        }
    }
    
    
}
