package _26453.q5;

public class LeaveRequest extends AttendanceRecord {
    private String requestDate;
    private String reason;
    private boolean approved;

    public LeaveRequest(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic,
                        String recordStudentID, String sessionID, String status,
                        String requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone, studentName, studentID, age,
                sessionDate, topic, recordStudentID, sessionID, status);
        setRequestDate(requestDate);
        setReason(reason);
        setApproved(approved);
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        if (requestDate == null || requestDate.trim().isEmpty()) {
            System.out.println("Invalid request date! Date cannot be empty.");
        } else {
            this.requestDate = requestDate;
        }
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        if (reason == null || reason.trim().isEmpty()) {
            System.out.println("Invalid reason! Reason cannot be empty.");
        } else {
            this.reason = reason;
        }
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Leave Request Date: " + requestDate);
        System.out.println("Reason: " + reason);
        System.out.println("Approved: " + (approved ? "Yes" : "No"));
    }
}