package _26453.q5;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String createdDate, String updatedDate,
                   String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone);
        setStudentName(studentName);
        setStudentID(studentID);
        setAge(age);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.println("Invalid student name! Name cannot be empty.");
        } else {
            this.studentName = studentName;
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if (studentID == null || studentID.trim().isEmpty()) {
            System.out.println("Invalid student ID! ID cannot be empty.");
        } else {
            this.studentID = studentID;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age! Age must be greater than 0.");
        } else {
            this.age = age;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
    }
}