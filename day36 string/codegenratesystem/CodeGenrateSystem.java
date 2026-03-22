
package codegenratesystem;


import java.util.Scanner;


public class CodeGenrateSystem {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Enter Your Name : ");
        StringBuilder name = new StringBuilder(sc.nextLine());
        
        System.out.print("Enter Your Department : ");
        StringBuilder department = new StringBuilder(sc.nextLine());
        
        System.out.print("Enter Your Year : ");
        int year = sc.nextInt();
        
        
        String name1 = name.substring(0, 3);
        String department1 =  department.substring(0, 3);
        
        String name2 = name1.toString().toUpperCase();
        String department2 = department1.toString().toUpperCase();
        
        String gentrateCode = name2 +" -"+ department2+" -" + year;
        
        System.out.println(gentrateCode);
        
        
    }
    
}
