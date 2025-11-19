package _26453.q5;

public class AttendanceRecord extends ClassSession {
    private String recordStudentID;
    private String sessionID;
    private String status;

    public AttendanceRecord(int id, String createdDate, String updatedDate,
                            String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            String sessionDate, String topic,
                            String recordStudentID, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone, studentName, studentID, age,
                sessionDate, topic);
        setRecordStudentID(recordStudentID);
        setSessionID(sessionID);
        setStatus(status);
    }

    public String getRecordStudentID() {
        return recordStudentID;
    }

    public void setRecordStudentID(String recordStudentID) {
        if (recordStudentID == null || recordStudentID.trim().isEmpty()) {
            System.out.println("Invalid student ID! ID cannot be empty.");
        } else {
            this.recordStudentID = recordStudentID;
        }
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        if (sessionID == null || sessionID.trim().isEmpty()) {
            System.out.println("Invalid session ID! ID cannot be empty.");
        } else {
            this.sessionID = sessionID;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || (!status.equalsIgnoreCase("Present") && !status.equalsIgnoreCase("Absent"))) {
            System.out.println("Invalid status! Status must be 'Present' or 'Absent'.");
        } else {
            this.status = status;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Record Student ID: " + recordStudentID);
        System.out.println("Session ID: " + sessionID);
        System.out.println("Attendance Status: " + status);
    }
}