package _26453.q5;

import _26453.q4.Department;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String createdDate, String updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead);
        setCourseName(courseName);
        setCourseCode(courseCode);
        setCredits(credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            System.out.println("Invalid course name! Name cannot be empty.");
        } else {
            this.courseName = courseName;
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            System.out.println("Invalid course code! Code cannot be empty.");
        } else {
            this.courseCode = courseCode;
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits <= 0) {
            System.out.println("Invalid credits! Credits must be greater than 0.");
        } else {
            this.credits = credits;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }
}