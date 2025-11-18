package _26453.q1;

import java.util.Scanner;

public class StockMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== STOCK MANAGEMENT SYSTEM ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Warehouse information
        String warehouseName = getStringInput("Enter warehouse name: ");
        String location = getStringInput("Enter warehouse location: ");
        String contactNumber = getPhoneInput("Enter warehouse contact (10 digits): ");

        // Category information
        String categoryName = getStringInput("Enter category name: ");
        String categoryCode = getCategoryCodeInput("Enter category code (alphanumeric, min 3 chars): ");

        // Supplier information
        String supplierName = getStringInput("Enter supplier name: ");
        String supplierEmail = getEmailInput("Enter supplier email: ");
        String supplierPhone = getPhoneInput("Enter supplier phone (10 digits): ");

        // Product information
        String productName = getStringInput("Enter product name: ");
        double unitPrice = getDoubleInput("Enter unit price: ", 0.01, Double.MAX_VALUE);
        int stockLimit = getIntInput("Enter stock limit: ", 0, Integer.MAX_VALUE);

        // Stock Item information
        int quantityAvailable = getIntInput("Enter quantity available: ", 0, Integer.MAX_VALUE);
        int reorderLevel = getIntInput("Enter reorder level: ", 0, Integer.MAX_VALUE);

        // Purchase information
        String purchaseDate = getStringInput("Enter purchase date: ");
        int purchasedQuantity = getIntInput("Enter purchased quantity: ", 1, Integer.MAX_VALUE);
        String purchaseSupplierName = getStringInput("Enter purchase supplier name: ");

        // Sale information
        String saleDate = getStringInput("Enter sale date: ");
        int soldQuantity = getIntInput("Enter sold quantity: ", 1, Integer.MAX_VALUE);
        String customerName = getStringInput("Enter customer name: ");

        // Inventory information
        int totalItems = getIntInput("Enter total items in inventory: ", 0, Integer.MAX_VALUE);
        double stockValue = getDoubleInput("Enter total stock value: ", 0.0, Double.MAX_VALUE);

        // Stock Report information
        String reportDate = getStringInput("Enter report date: ");
        String remarks = getStringInput("Enter remarks: ");

        // Create StockReport object
        StockReport report = new StockReport(
                id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue,
                reportDate, remarks
        );

        // Generate and display the report
        System.out.println("\n");
        report.generateReport();

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
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}RWF")) {
                return email;
            }
            System.out.println("Invalid email format!");
        }
    }

    private static String getCategoryCodeInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String code = scanner.nextLine().trim();
            if (code.matches("[a-zA-Z0-9]+") && code.length() >= 3) {
                return code;
            }
            System.out.println("Code must be alphanumeric and at least 3 characters!");
        }
    }
}
