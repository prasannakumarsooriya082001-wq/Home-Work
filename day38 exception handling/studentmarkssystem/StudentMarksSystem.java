
package studentmarkssystem;

import java.util.Scanner;

public class StudentMarksSystem 
{

    int marks = -1; 

   
    void enterMarks(int m) 
    {

        if (m < 0 || m > 100) 
        {
            throw new IllegalArgumentException("Invalid Marks! Enter between 0 and 100.");
        }

        marks = m;
        System.out.println("Marks saved successfully.");
    }

    
    void displayMarks() 
    {
        if (marks == -1) 
        {
            System.out.println("No marks entered.");
        } 
        else 
        {
            System.out.println("Student Marks: " + marks);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        StudentMarksSystem sms = new StudentMarksSystem();

        while (choice != 3) {

            System.out.println("\n***** STUDENT MARKS SYSTEM *****");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter marks: ");
                    int m = sc.nextInt();

                    try 
                    {
                        sms.enterMarks(m);
                    } 
                    catch (IllegalArgumentException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    sms.displayMarks();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}