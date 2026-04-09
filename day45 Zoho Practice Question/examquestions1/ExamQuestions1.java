
package examquestions1;

public class ExamQuestions1 
{
    
    public static void main(String[] args) 
    {
        int n = 5;
        for(int i = 1 ; i <= n ;i++)
        {
            int num = i;//3
            for(int j = 1;j <= i;j++)
            {
                System.out.print(num+ " ");
                int next = n - j;//5-2=3
                
                num = num + next; //7+3=10
            }
            
            System.out.println(" ");
        }
    }
    
}
