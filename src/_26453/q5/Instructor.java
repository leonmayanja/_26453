package _26453.q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits);
        setInstructorName(instructorName);
        setEmail(email);
        setPhone(phone);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        if (instructorName == null || instructorName.trim().isEmpty()) {
            System.out.println("Invalid instructor name! Name cannot be empty.");
        } else {
            this.instructorName = instructorName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid email! Please enter a valid email address.");
        } else {
            this.email = email;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            System.out.println("Invalid phone! Phone must be exactly 10 digits.");
        } else {
            this.phone = phone;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Instructor Name: " + instructorName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}