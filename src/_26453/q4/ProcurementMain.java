package _26453.q4;

import java.util.Scanner;

public class ProcurementMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== PROCUREMENT MANAGEMENT SYSTEM ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Organization information
        String orgName = getStringInput("Enter organization name: ");
        String address = getStringInput("Enter organization address: ");
        String contactEmail = getEmailInput("Enter organization email: ");

        // Department information
        String deptName = getStringInput("Enter department name: ");
        String deptCode = getCodeInput("Enter department code (alphanumeric, min 3 chars): ");

        // Supplier information
        String supplierName = getStringInput("Enter supplier name: ");
        String supplierTIN = getTINInput("Enter supplier TIN (9 digits): ");
        String contact = getPhoneInput("Enter supplier contact (10 digits): ");

        // Product information
        String productName = getStringInput("Enter product name: ");
        double unitPrice = getDoubleInput("Enter unit price: ", 0.01, Double.MAX_VALUE);
        int quantity = getIntInput("Enter quantity: ", 0, Integer.MAX_VALUE);

        // Purchase Order information
        String poNumber = getStringInput("Enter PO number: ");
        String orderDate = getStringInput("Enter order date: ");
        double totalAmount = getDoubleInput("Enter total amount: ", 0.01, Double.MAX_VALUE);

        // Delivery information
        String deliveryDate = getStringInput("Enter delivery date: ");
        String deliveredBy = getStringInput("Enter delivered by: ");

        // Inspection information
        String inspectorName = getStringInput("Enter inspector name: ");
        String status = getStatusInput("Enter inspection status (Passed/Failed): ");
        String remarks = getStringInput("Enter inspection remarks: ");

        // Invoice information
        String invoiceNo = getStringInput("Enter invoice number: ");
        double invoiceAmount = getDoubleInput("Enter invoice amount: ", 0.01, Double.MAX_VALUE);

        // Procurement Report information
        String reportDate = getStringInput("Enter report date: ");
        String summary = getStringInput("Enter procurement summary: ");

        // Create ProcurementReport object
        ProcurementReport report = new ProcurementReport(
                id, createdDate, updatedDate,
                orgName, address, contactEmail,
                deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount,
                reportDate, summary
        );

        // Display the procurement report
        System.out.println("\n");
        report.displayInfo();

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

    private static double getDoubleInput(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine().trim());
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

    private static String getTINInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String tin = scanner.nextLine().trim();
            if (tin.matches("\\d{9}")) {
                return tin;
            }
            System.out.println("Invalid TIN! Must be exactly 9 digits.");
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
            if (code.matches("[a-zA-Z0-9]+") && code.length() >= 3) {
                return code;
            }
            System.out.println("Code must be alphanumeric and at least 3 characters!");
        }
    }

    private static String getStatusInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String status = scanner.nextLine().trim();
            if (status.equalsIgnoreCase("Passed") || status.equalsIgnoreCase("Failed")) {
                return status;
            }
            System.out.println("Invalid status! Must be 'Passed' or 'Failed'.");
        }
    }
}