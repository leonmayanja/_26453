package _26453.q5;

public class AttendanceSummary extends LeaveRequest {
    private String reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, String createdDate, String updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             String sessionDate, String topic,
                             String recordStudentID, String sessionID, String status,
                             String requestDate, String reason, boolean approved,
                             String reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone, studentName, studentID, age,
                sessionDate, topic, recordStudentID, sessionID, status,
                requestDate, reason, approved);
        setReportDate(reportDate);
        setTotalPresent(totalPresent);
        setTotalAbsent(totalAbsent);
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.trim().isEmpty()) {
            System.out.println("Invalid report date! Date cannot be empty.");
        } else {
            this.reportDate = reportDate;
        }
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        if (totalPresent < 0) {
            System.out.println("Invalid total present! Cannot be negative.");
        } else {
            this.totalPresent = totalPresent;
        }
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public void setTotalAbsent(int totalAbsent) {
        if (totalAbsent < 0) {
            System.out.println("Invalid total absent! Cannot be negative.");
        } else {
            this.totalAbsent = totalAbsent;
        }
    }

    /**
     * Generates attendance summary with percentage calculation
     * Formula: (totalPresent / totalSessions) × 100
     * @return attendance percentage
     */
    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) {
            return 0.0;
        }
        return (totalPresent * 100.0) / totalSessions;
    }

    @Override
    public void displayInfo() {
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=== ATTENDANCE SUMMARY REPORT ===");
        System.out.println(sid + "ID: " + getId());
        System.out.println(sid + "Created Date: " + getCreatedDate());
        System.out.println(sid + "Updated Date: " + getUpdatedDate());
        //System.out.println(sid + "Institution Name: " + getInstitutionName());
        //System.out.println(sid + "Code: " + getCode());
        System.out.println(sid + "Address: " + getAddress());
        //System.out.println(sid + "Department Name: " + getDepartmentName());
        //System.out.println(sid + "Department Head: " + getDepartmentHead());
        System.out.println(sid + "Course Name: " + getCourseName());
        System.out.println(sid + "Course Code: " + getCourseCode());
        System.out.println(sid + "Credits: " + getCredits());
        System.out.println(sid + "Instructor Name: " + getInstructorName());
        System.out.println(sid + "Email: " + getEmail());
        System.out.println(sid + "Phone: " + getPhone());
        System.out.println(sid + "Student Name: " + getStudentName());
        System.out.println(sid + "Student ID: " + getStudentID());
        System.out.println(sid + "Age: " + getAge());
        System.out.println(sid + "Session Date: " + getSessionDate());
        System.out.println(sid + "Topic: " + getTopic());
        System.out.println(sid + "Record Student ID: " + getRecordStudentID());
        System.out.println(sid + "Session ID: " + getSessionID());
        System.out.println(sid + "Attendance Status: " + getStatus());
        System.out.println(sid + "Leave Request Date: " + getRequestDate());
        System.out.println(sid + "Reason: " + getReason());
        System.out.println(sid + "Approved: " + (isApproved() ? "Yes" : "No"));
        System.out.println(sid + "Report Date: " + reportDate);
        System.out.println(sid + "Total Present: " + totalPresent);
        System.out.println(sid + "Total Absent: " + totalAbsent);
        System.out.println(sid);
        System.out.println(sid + "=== ATTENDANCE STATISTICS ===");
        int totalSessions = totalPresent + totalAbsent;
        System.out.println(sid + "Total Sessions: " + totalSessions);
        System.out.println(sid + String.format("Attendance Percentage: %.2f%%", generateSummary()));
    }
}