

package com.mycompany.stringtesting;

import java.util.Scanner;


public class StringTesting 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("1.Duplicate 2.Remove Space 3.Reverse");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                findDuplicate(str);
                break;
            case 2:
                System.out.println(str.replace(" ", ""));
                break;
            case 3:
                System.out.println(new StringBuilder(str).reverse());
                break;
        }
    }

    static void findDuplicate(String str) 
    {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
            for (int j = i + 1; j < ch.length; j++) 
            {
                if (ch[i] == ch[j]) 
                {
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
    }
}
