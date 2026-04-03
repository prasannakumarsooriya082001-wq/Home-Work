package biodata;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData 
{

    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        //  Personal Details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc1.nextInt();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Date of Birth: ");
        String dob = sc.nextLine();

        System.out.print("Enter Blood Group: ");
        String blood = sc.nextLine();

        // Education
        System.out.print("Enter Qualification: ");
        String qual = sc.nextLine();

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter CGPA/Percentage: ");
        String cgpa = sc.nextLine();

        // Professional
        System.out.print("Enter Skills: ");
        String skills = sc.nextLine();

        System.out.print("Enter Experience (years): ");
        String exp = sc.nextLine();

        // Contact
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        // Family
        System.out.print("Enter Father Name: ");
        String father = sc.nextLine();

        System.out.print("Enter Mother Name: ");
        String mother = sc.nextLine();

        // Writing to file
        FileWriter fw = new FileWriter("biodata.txt");

        fw.write("=========== BIO DATA ===========\n");

        fw.write("\n*** Personal Details ***\n");
        fw.write("Name : " + name + "\n");
        fw.write("Age : " + age + "\n");
        fw.write("Gender : " + gender + "\n");
        fw.write("DOB : " + dob + "\n");
        fw.write("Blood Group : " + blood + "\n");

        fw.write("\n*** Education ***\n");
        fw.write("Qualification : " + qual + "\n");
        fw.write("College : " + college + "\n");
        fw.write("CGPA : " + cgpa + "\n");

        fw.write("\n*** Skills ***\n");
        fw.write("Skills : "+skills + "\n");
        fw.write("Experience : " + exp + " Years\n");

        fw.write("\n*** Contact ***\n");
        fw.write("Phone : " + phone + "\n");
        fw.write("Email : " + email + "\n");
        fw.write("Address : " + address + "\n");

        fw.write("\n*** Family ***\n");
        fw.write("Father Name : " + father + "\n");
        fw.write("Mother Name : " + mother + "\n");

        fw.write("\n================================");

        fw.close();

        System.out.println("\n Bio Data saved successfully in biodata.txt");
        
        Scanner sc3  = new Scanner("biodata.txt");
        
        while(sc3.hasNextLine())
        {
            System.out.println(sc3.nextLine());
        }
        sc3.close();
        
        sc1.close();
        sc.close();
    }

}
