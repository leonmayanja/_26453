package _26453.q2;

public class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;
    private double taxes;
    private double discounts;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate, double taxes, double discounts) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        setTicketNumber(ticketNumber);
        setIssueDate(issueDate);
        setTaxes(taxes);
        setDiscounts(discounts);
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        if (ticketNumber == null || ticketNumber.trim().isEmpty()) {
            System.out.println("Invalid ticket number! Number cannot be empty.");
        } else {
            this.ticketNumber = ticketNumber;
        }
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        if (issueDate == null || issueDate.trim().isEmpty()) {
            System.out.println("Invalid issue date! Date cannot be empty.");
        } else {
            this.issueDate = issueDate;
        }
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        if (taxes < 0) {
            System.out.println("Invalid taxes! Taxes cannot be negative.");
        } else {
            this.taxes = taxes;
        }
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        if (discounts < 0) {
            System.out.println("Invalid discounts! Discounts cannot be negative.");
        } else {
            this.discounts = discounts;
        }
    }

    /**
     * Calculates the final fare
     * Formula: baseFare + taxes - discounts
     * @return final calculated fare
     */
    public double calculateFare() {
        return getBaseFare() + taxes - discounts;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("                         FLIGHT TICKET");
        System.out.println("=".repeat(70));
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("-".repeat(70));

        System.out.println("\n--- PASSENGER INFORMATION ---");
        System.out.println("Name: " + getPassengerName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact: " + getContact());

        System.out.println("\n--- FLIGHT DETAILS ---");
        System.out.println("Airline: " + getAirlineName() + " (" + getAirlineCode() + ")");
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("From: " + getDeparture());
        System.out.println("To: " + getDestination());
        System.out.println("Airport: " + getAirportName() + " (" + getCode() + ")");

        System.out.println("\n--- BOOKING DETAILS ---");
        System.out.println("Booking Date: " + getBookingDate());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Travel Class: " + getTravelClass());

        System.out.println("\n--- CREW INFORMATION ---");
        System.out.println("Pilot: " + getPilotName() + " (License: " + getLicenseNumber() + ")");
        System.out.println("Cabin Crew: " + getCrewName() + " (" + getRole() + " - " + getShift() + " shift)");

        System.out.println("\n--- FARE BREAKDOWN ---");
        System.out.printf("Base Fare:              RWF%.2f%n", getBaseFare());
        System.out.printf("Taxes & Fees:           RWF%.2f%n", taxes);
        System.out.printf("Discounts:             -RWF%.2f%n", discounts);
        System.out.println("-".repeat(70));
        System.out.printf("TOTAL FARE:             RWF%.2f%n", calculateFare());

        System.out.println("\n--- PAYMENT INFORMATION ---");
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.printf("Amount Paid: RWF%.2f%n", getAmountPaid());

        System.out.println("\n" + "=".repeat(70));
        System.out.println("Thank you for choosing " + getAirlineName() + "!");
        System.out.println("Have a pleasant flight!");
        System.out.println("=".repeat(70));
    }
}