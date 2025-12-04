// Two types of variables: instance and static variables 
// Variables use camelCase
// Constants use uppercase 

class Student {

    String studentName; // instance variable, belongs to object
    static int studentCount = 0; // static variable, belongs to class
    static final String SCHOOL_NAME = "CSAEA"; 

    Student(String n) { // behavior called from class 
        studentName = n; // n is the student name, belongs to specific object
        System.out.println(n + " is a student at " + SCHOOL_NAME); 

        studentCount++; 

        System.out.println("Number of students: " + studentCount); 

    }


}

public class Variables {
    public static void main(String[] args) {

        new Student("Alex"); 
        new Student("Ben");
        new Student("Benjamin");
        new Student("Benny");
        new Student("BenTen");
        new Student("Bent");

    }
}