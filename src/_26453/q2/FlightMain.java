package _26453.q2;

import java.util.Scanner;

public class FlightMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== FLIGHT BOOKING SYSTEM ===\n");

        // Entity information
        int id = getIntInput("Enter entity ID (> 0): ", 1, Integer.MAX_VALUE);
        String createdDate = getStringInput("Enter created date: ");
        String updatedDate = getStringInput("Enter updated date: ");

        // Airport information
        String airportName = getStringInput("Enter airport name: ");
        String code = getAirportCodeInput("Enter airport code (3 uppercase letters, e.g., KGL): ");
        String location = getStringInput("Enter airport location: ");

        // Airline information
        String airlineName = getStringInput("Enter airline name: ");
        String airlineCode = getAirlineCodeInput("Enter airline code (2-4 letters, e.g., RW): ");
        String contactEmail = getEmailInput("Enter airline contact email: ");

        // Flight information
        String flightNumber = getStringInput("Enter flight number: ");
        String departure = getStringInput("Enter departure city: ");
        String destination = getStringInput("Enter destination city: ");
        double baseFare = getDoubleInput("Enter base fare: ", 0.01, Double.MAX_VALUE);

        // Pilot information
        String pilotName = getStringInput("Enter pilot name: ");
        String licenseNumber = getStringInput("Enter pilot license number: ");
        int experienceYears = getIntInput("Enter pilot experience years (>= 2): ", 2, 50);

        // Cabin Crew information
        String crewName = getStringInput("Enter cabin crew name: ");
        String role = getStringInput("Enter crew role (e.g., Flight Attendant): ");
        String shift = getShiftInput("Enter shift (Day/Night): ");

        // Passenger information
        String passengerName = getStringInput("Enter passenger name: ");
        int age = getIntInput("Enter passenger age (> 0): ", 1, 150);
        String gender = getGenderInput("Enter gender (Male/Female/Other): ");
        String contact = getStringInput("Enter passenger contact: ");

        // Booking information
        String bookingDate = getStringInput("Enter booking date: ");
        String seatNumber = getStringInput("Enter seat number (e.g., 12A): ");
        String travelClass = getTravelClassInput("Enter travel class (Economy/Business/First): ");

        // Payment information
        String paymentDate = getStringInput("Enter payment date: ");
        String paymentMethod = getStringInput("Enter payment method (e.g., Credit Card): ");
        double amountPaid = getDoubleInput("Enter amount paid: ", 0.01, Double.MAX_VALUE);

        // Ticket information
        String ticketNumber = getStringInput("Enter ticket number: ");
        String issueDate = getStringInput("Enter ticket issue date: ");
        double taxes = getDoubleInput("Enter taxes and fees: ", 0.0, Double.MAX_VALUE);
        double discounts = getDoubleInput("Enter discounts: ", 0.0, Double.MAX_VALUE);

        // Create Ticket object
        Ticket ticket = new Ticket(
                id, createdDate, updatedDate,
                airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid,
                ticketNumber, issueDate, taxes, discounts
        );

        // Display the ticket
        System.out.println("\n");
        ticket.displayInfo();

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

    private static String getAirportCodeInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String code = scanner.nextLine().trim();
            if (code.matches("[A-Z]{3}")) {
                return code;
            }
            System.out.println("Invalid airport code! Must be exactly 3 uppercase letters.");
        }
    }

    private static String getAirlineCodeInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String code = scanner.nextLine().trim();
            if (code.matches("[A-Za-z]{2,4}")) {
                return code;
            }
            System.out.println("Invalid airline code! Must be 2-4 letters.");
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

    private static String getShiftInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String shift = scanner.nextLine().trim();
            if (shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night")) {
                return shift;
            }
            System.out.println("Invalid shift! Must be 'Day' or 'Night'.");
        }
    }

    private static String getGenderInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String gender = scanner.nextLine().trim();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") ||
                    gender.equalsIgnoreCase("Other")) {
                return gender;
            }
            System.out.println("Invalid gender! Must be 'Male', 'Female', or 'Other'.");
        }
    }

    private static String getTravelClassInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String travelClass = scanner.nextLine().trim();
            if (travelClass.equalsIgnoreCase("Economy") || travelClass.equalsIgnoreCase("Business") ||
                    travelClass.equalsIgnoreCase("First")) {
                return travelClass;
            }
            System.out.println("Invalid class! Must be 'Economy', 'Business', or 'First'.");
        }
    }
}