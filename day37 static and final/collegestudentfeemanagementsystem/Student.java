
package collegestudentfeemanagementsystem;


public class Student
{
    int studentId;
    String studentName;
    double tuitionFee;
    double totalFee;
    
    static String collegeName;
    static int studentCount;
    
    final int ADMISSION_FEE = 5000;

    public Student(int studentId, String studentName, double tuitionFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
        studentCount++;
    }
    
    
    
    
    double calculateTotalFee()
    {       
        return tuitionFee + ADMISSION_FEE; 
    }
    
    void displayDetails()
    {
        System.out.println("College Name : "+collegeName);
        System.out.println("Student Id : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("Total Fees : "+calculateTotalFee());   
    }
    
    static void displayStudentCount()
    {
        System.out.println("Total Student : "+studentCount);
    }
}
