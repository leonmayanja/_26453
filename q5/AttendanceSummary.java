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
        System.out.println("\n=== ATTENDANCE SUMMARY REPORT ===");
        super.displayInfo();
        System.out.println("Report Date: " + reportDate);
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("\n=== ATTENDANCE STATISTICS ===");
        int totalSessions = totalPresent + totalAbsent;
        System.out.println("Total Sessions: " + totalSessions);
        System.out.printf("Attendance Percentage: %.2f%%%n", generateSummary());
    }
}