
package com.mycompany.arrayutils;


public class ArrayUtils 
{
    public int max(int ar[])
    {
        int max = ar[0];
        for(int i = 0;i<ar.length;i++)
        {
            if(ar[i] > max)
            {
                max = ar[i];
            }
        }
        return max;
    }
    
    
    public int min(int ar[])
    {
        int min = ar[0];
        for(int i = 0;i<ar.length;i++)
        {
            if(ar[i] < min)
            {
                min = ar[i];
            }
        }
        return min;
    }
    
}
