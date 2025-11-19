package _26453.q3;

import java.util.Scanner;

public class TaxMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== TAX ADMINISTRATION SYSTEM ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Tax Authority information
        String authorityName = getStringInput("Enter tax authority name: ");
        String region = getStringInput("Enter region: ");
        String email = getEmailInput("Enter authority email: ");

        // Tax Category information
        String categoryName = getStringInput("Enter tax category name: ");
        double rate = getDoubleInput("Enter tax rate (%): ", 0.01, 100.0);
        String code = getCodeInput("Enter category code (min 3 chars): ");

        // Taxpayer information
        String tin = getTINInput("Enter taxpayer TIN (9 digits): ");
        String taxpayerName = getStringInput("Enter taxpayer name: ");
        String address = getStringInput("Enter address: ");

        // Employer information
        String employerName = getStringInput("Enter employer name: ");
        String employerTIN = getTINInput("Enter employer TIN (9 digits): ");
        String contact = getPhoneInput("Enter employer contact (10 digits): ");

        // Employee information
        String employeeName = getStringInput("Enter employee name: ");
        double salary = getDoubleInput("Enter employee salary: ", 0.01, Double.MAX_VALUE);
        String employeeTIN = getTINInput("Enter employee TIN (9 digits): ");

        // Tax Declaration information
        String declarationMonth = getStringInput("Enter declaration month (e.g., January 2025): ");
        double totalIncome = getDoubleInput("Enter total income: ", 0.0, Double.MAX_VALUE);

        // Tax Assessment information
        String assessmentDate = getStringInput("Enter assessment date: ");
        double assessedTax = getDoubleInput("Enter assessed tax: ", 0.0, Double.MAX_VALUE);

        // Payment information
        String paymentDate = getStringInput("Enter payment date: ");
        double paymentAmount = getDoubleInput("Enter payment amount: ", 0.01, Double.MAX_VALUE);

        // Tax Record information
        String receiptNo = getStringInput("Enter receipt number: ");
        double taxCredits = getDoubleInput("Enter tax credits: ", 0.0, Double.MAX_VALUE);

        // Create TaxRecord object
        TaxRecord record = new TaxRecord(
                id, createdDate, updatedDate,
                authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeTIN,
                declarationMonth, totalIncome,
                assessmentDate, assessedTax,
                paymentDate, paymentAmount,
                receiptNo, taxCredits
        );

        // Display the tax record
        System.out.println("\n");
        record.displayInfo();

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
            if (code.length() >= 3) {
                return code;
            }
            System.out.println("Code must be at least 3 characters!");
        }
    }
}