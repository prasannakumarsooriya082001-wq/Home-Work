
package studentmanagementsystem;


public class Student 
{
    int rollNo;
    String name;
    int age;
    String course;
    int marks;

    public Student(int rollNo, String name, int age, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    
    void display()
    {
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+age);
        System.out.println("Course : "+course);
        System.out.println("Student Marks : "+marks);
    }
    
}
