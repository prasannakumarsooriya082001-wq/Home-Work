
package fibonacciseries;

import java.util.Scanner;


public class FibonacciSeries 
{

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.print("Fibonacci Series: ");

        for(int i = 1; i <= n; i++)
        {
            System.out.print(n1 + " ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    
    }
    
}
