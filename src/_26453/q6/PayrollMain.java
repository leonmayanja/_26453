package _26453.q6;

import java.util.Scanner;

public class PayrollMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== PAYROLL MANAGEMENT SYSTEM (RSSB) ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Organization information
        String orgName = getStringInput("Enter organization name: ");
        String orgCode = getCodeInput("Enter organization code (min 3 chars): ");
        String rssbNumber = getRssbInput("Enter RSSB number (8 digits): ");
        String contactEmail = getEmailInput("Enter organization email: ");

        // Department information
        String deptName = getStringInput("Enter department name: ");
        String deptCode = getCodeInput("Enter department code (min 3 chars): ");
        String managerName = getStringInput("Enter manager name: ");

        // Employee information
        int employeeID = getIntInput("Enter employee ID (>= 1000): ", 1000, Integer.MAX_VALUE);
        String fullName = getStringInput("Enter employee full name: ");
        String position = getStringInput("Enter employee position: ");
        double baseSalary = getDoubleInput("Enter base salary: ", 0.01, Double.MAX_VALUE);
        boolean rssbRegistered = getBooleanInput("Is employee RSSB registered? (yes/no): ");

        // Payroll Period information
        int month = getIntInput("Enter payroll month (1-12): ", 1, 12);
        int year = getIntInput("Enter payroll year (>= 2000): ", 2000, 2100);
        String startDate = getStringInput("Enter period start date: ");
        String endDate = getStringInput("Enter period end date: ");

        // Salary Structure information
        double basicPay = getDoubleInput("Enter basic pay: ", 0.0, Double.MAX_VALUE);
        double transportAllowance = getDoubleInput("Enter transport allowance: ", 0.0, Double.MAX_VALUE);
        double housingAllowance = getDoubleInput("Enter housing allowance: ", 0.0, Double.MAX_VALUE);

        // Deduction information
        double rssbContribution = getDoubleInput("Enter RSSB contribution (typically 3% of gross): ", 0.0, Double.MAX_VALUE);
        double tax = getDoubleInput("Enter income tax: ", 0.0, Double.MAX_VALUE);
        double otherDeductions = getDoubleInput("Enter other deductions: ", 0.0, Double.MAX_VALUE);

        // Allowance information
        double overtimePay = getDoubleInput("Enter overtime pay: ", 0.0, Double.MAX_VALUE);
        double bonus = getDoubleInput("Enter bonus: ", 0.0, Double.MAX_VALUE);
        double otherAllowances = getDoubleInput("Enter other allowances: ", 0.0, Double.MAX_VALUE);

        // Payslip information
        String payslipNumber = getStringInput("Enter payslip number: ");
        String paymentDate = getStringInput("Enter payment date: ");
        String paymentMethod = getStringInput("Enter payment method (e.g., Bank Transfer): ");

        // Create Payslip object
        Payslip payslip = new Payslip(
                id, createdDate, updatedDate,
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance,
                rssbContribution, tax, otherDeductions,
                overtimePay, bonus, otherAllowances,
                payslipNumber, paymentDate, paymentMethod
        );

        // Generate and display the payslip
        System.out.println("\n");
        payslip.generatePayslip();

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

    private static String getRssbInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String rssb = scanner.nextLine().trim();
            if (rssb.matches("\\d{8}")) {
                return rssb;
            }
            System.out.println("Invalid RSSB number! Must be exactly 8 digits.");
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