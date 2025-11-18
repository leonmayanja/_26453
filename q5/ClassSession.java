package _26453.q5;

public class ClassSession extends Student {
    private String sessionDate;
    private String topic;

    public ClassSession(int id, String createdDate, String updatedDate,
                        String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        String sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone, studentName, studentID, age);
        setSessionDate(sessionDate);
        setTopic(topic);
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        if (sessionDate == null || sessionDate.trim().isEmpty()) {
            System.out.println("Invalid session date! Date cannot be null or empty.");
        } else {
            this.sessionDate = sessionDate;
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if (topic == null || topic.trim().isEmpty()) {
            System.out.println("Invalid topic! Topic cannot be null or empty.");
        } else {
            this.topic = topic;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Session Date: " + sessionDate);
        System.out.println("Topic: " + topic);
    }
}