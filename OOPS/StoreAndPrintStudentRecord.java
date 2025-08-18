package OOPS;

public class StoreAndPrintStudentRecord {
    public static void main(String[] args) {
        // Create an array of 5 Student objects
        Student[] students = new Student[5];

        // Initialize students
        students[0] = new Student(35, "Ashish kumar", 97.4f);
        students[1] = new Student(21, "Rohit Sharma", 88.5f);
        students[2] = new Student(12, "Priya Verma", 91.2f);
        students[3] = new Student(18, "Ankit Yadav", 76.3f);
        students[4] = new Student(25, "Neha Singh", 82.9f);

        // Print student details
        for (Student s : students) {
            System.out.println("Roll No: " + s.roll);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("------------------------");
        }
    }

    static class Student {
        int roll;
        String name;
        float marks;

        // Constructor
        Student(int roll, String name, float marks) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
    }
}
