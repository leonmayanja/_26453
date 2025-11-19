package _26453.q5;

import java.util.Scanner;

public class AttendanceMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== ATTENDANCE MANAGEMENT SYSTEM ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Institution information
        String institutionName = getStringInput("Enter institution name: ");
        String code = getCodeInput("Enter institution code (min 3 chars): ");
        String address = getStringInput("Enter institution address: ");

        // Department information
        String departmentName = getStringInput("Enter department name: ");
        String departmentHead = getStringInput("Enter department head: ");

        // Course information
        String courseName = getStringInput("Enter course name: ");
        String courseCode = getStringInput("Enter course code: ");
        int credits = getIntInput("Enter course credits (> 0): ", 1, Integer.MAX_VALUE);

        // Instructor information
        String instructorName = getStringInput("Enter instructor name: ");
        String email = getEmailInput("Enter instructor email: ");
        String phone = getPhoneInput("Enter instructor phone (10 digits): ");

        // Student information
        String studentName = getStringInput("Enter student name: ");
        String studentID = getStringInput("Enter student ID: ");
        int age = getIntInput("Enter student age (> 0): ", 1, 150);

        // Class Session information
        String sessionDate = getStringInput("Enter session date: ");
        String topic = getStringInput("Enter session topic: ");

        // Attendance Record information
        String recordStudentID = getStringInput("Enter attendance record student ID: ");
        String sessionID = getStringInput("Enter session ID: ");
        String status = getStatusInput("Enter attendance status (Present/Absent): ");

        // Leave Request information
        String requestDate = getStringInput("Enter leave request date: ");
        String reason = getStringInput("Enter leave reason: ");
        boolean approved = getBooleanInput("Is leave approved? (yes/no): ");

        // Attendance Summary information
        String reportDate = getStringInput("Enter report date: ");
        int totalPresent = getIntInput("Enter total present: ", 0, Integer.MAX_VALUE);
        int totalAbsent = getIntInput("Enter total absent: ", 0, Integer.MAX_VALUE);

        // Create AttendanceSummary object
        AttendanceSummary summary = new AttendanceSummary(
                id, createdDate, updatedDate,
                institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                recordStudentID, sessionID, status,
                requestDate, reason, approved,
                reportDate, totalPresent, totalAbsent
        );

        // Display the attendance summary
        System.out.println("\n");
        summary.displayInfo();

        scanner.close();
    }

    // Helper methods for input validation
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int getIntInput(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value < min || value > max) {
                    System.out.println("Value must be between " + min + " and " + max);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    private static String getPhoneInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String phone = scanner.nextLine().trim();
            if (phone.matches("\\d{10}")) {
                return phone;
            }
            System.out.println("Invalid phone number! Must be exactly 10 digits.");
        }
    }

    private static String getEmailInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String email = scanner.nextLine().trim();
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                return email;
            }
            System.out.println("Invalid email format!");
        }
    }

    private static String getCodeInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String code = scanner.nextLine().trim();
            if (code.length() >= 3) {
                return code;
            }
            System.out.println("Code must be at least 3 characters!");
        }
    }

    private static String getStatusInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String status = scanner.nextLine().trim();
            if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
                return status;
            }
            System.out.println("Invalid status! Must be 'Present' or 'Absent'.");
        }
    }

    private static boolean getBooleanInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("y") || input.equals("true")) {
                return true;
            } else if (input.equals("no") || input.equals("n") || input.equals("false")) {
                return false;
            }
            System.out.println("Invalid input! Please enter 'yes' or 'no'.");
        }
    }
}