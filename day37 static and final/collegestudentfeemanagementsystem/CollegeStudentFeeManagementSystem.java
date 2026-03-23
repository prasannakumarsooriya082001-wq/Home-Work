
package collegestudentfeemanagementsystem;

import java.util.Scanner;


public class CollegeStudentFeeManagementSystem
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        Student.collegeName = "Magizhchi Arts and Science College";
        
        System.out.print("Enter Student 1 Id : ");
        int id1 = sc.nextInt();
        System.out.print("Enter Student 1 Name : ");
        String name1 = sc1.nextLine();
        System.out.print("Enter Tuition Fee : ");
        double fee1 = sc.nextDouble();
        
        System.out.print("Enter Student 2 Id : ");
        int id2 = sc.nextInt();
        System.out.print("Enter Student 2 Name : ");
        String name2 = sc1.nextLine();
        System.out.print("Enter Tuition Fee : ");
        double fee2 = sc.nextDouble();
        
        Student s1 = new Student(id1, name1, fee1);
        Student s2 = new Student(id2, name2, fee2);
        
        s1.displayDetails();
        s2.displayDetails();
        
        Student.displayStudentCount();
        
        
        
    }
    
}
