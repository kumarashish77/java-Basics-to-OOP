 class Course {
    static  int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments =0;
        this.enrolledStudents = new String[maxCapacity];
    }


    static void setMaxCapacity(int maxCapicity){
        Course.maxCapacity = maxCapicity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    void unenrolledStudent(){
        System.out.println("Student removed");
        enrollments--;
    }
}
