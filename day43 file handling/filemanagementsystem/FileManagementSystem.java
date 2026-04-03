
package filemanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileManagementSystem 
{

    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        File f = new File("student.txt");
        f.createNewFile();
        
        int choice = 0;
        
        while(choice != 4)
        {
            System.out.println("====== File Management System ======");
            System.out.println("1. Write Data");
            System.out.println("2. Read Data");
            System.out.println("3. Append Data");
            System.out.println("4. Exit");
            
            System.out.print("Enter The Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the Input : ");

                    FileWriter fw = new FileWriter(f);
                    fw.write(sc1.nextLine());
                    
                    fw.close();
                    System.out.println("Written successfully");
                    System.out.println();
                    break;
                }
                
                case 2:
                {
                    if(f.exists())
                    {
                        Scanner sc2 = new Scanner(f);
                        
                        while(sc2.hasNextLine())
                        {
                            System.out.println(sc2.nextLine());
                        }
                        sc2.close();
                    }
                    else
                    {
                        System.out.println("File Not Exist");
                    }
                    System.out.println();
                    break;
                }
                
                case 3:
                {
                    System.out.print("Enter the Input : ");

                    if(f.exists())
                    {
                        FileWriter fw1 = new FileWriter(f, true);
                        fw1.write("\n"+sc1.nextLine());
                        fw1.close();
                        System.out.println("File Appended");
                    }
                    else
                    {
                        System.out.println("File Not Exist");
                    }
                    System.out.println();
                    
                    break;
                }
                
                case 4:
                {
                    System.out.println("Exiting...");
                    break;
                }
                
                default:
                {
                    System.out.println("Invalid Choice!");
                }
                
            }
        }
        
        
    }
    
}
