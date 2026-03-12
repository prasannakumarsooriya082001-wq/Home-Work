
package matrix;

import java.util.Scanner;


public class Matrix {

    
    
    public static void main(String[] args) 
    {
        
       int mat[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int top = 0, bottom = 3, left = 0, right = 3;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");
            top++;

            for(int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
            right--;

            for(int i = right; i >= left; i--)
                System.out.print(mat[bottom][i] + " ");
            bottom--;

            for(int i = bottom; i >= top; i--)
                System.out.print(mat[i][left] + " ");
            left++;
        }
    }
    
}
