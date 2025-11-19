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
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "                         FLIGHT TICKET");
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "Ticket Number: " + ticketNumber);
        System.out.println(sid + "Issue Date: " + issueDate);
        System.out.println(sid + "-".repeat(70));

        System.out.println(sid);
        System.out.println(sid + "--- PASSENGER INFORMATION ---");
        System.out.println(sid + "Name: " + getPassengerName());
        System.out.println(sid + "Age: " + getAge());
        System.out.println(sid + "Gender: " + getGender());
        System.out.println(sid + "Contact: " + getContact());

        System.out.println(sid);
        System.out.println(sid + "--- FLIGHT DETAILS ---");
        System.out.println(sid + "Airline: " + getAirlineName() + " (" + getAirlineCode() + ")");
        System.out.println(sid + "Flight Number: " + getFlightNumber());
        System.out.println(sid + "From: " + getDeparture());
        System.out.println(sid + "To: " + getDestination());
        System.out.println(sid + "Airport: " + getAirportName() + " (" + getCode() + ")");

        System.out.println(sid);
        System.out.println(sid + "--- BOOKING DETAILS ---");
        System.out.println(sid + "Booking Date: " + getBookingDate());
        System.out.println(sid + "Seat Number: " + getSeatNumber());
        System.out.println(sid + "Travel Class: " + getTravelClass());

        System.out.println(sid);
        System.out.println(sid + "--- CREW INFORMATION ---");
        System.out.println(sid + "Pilot: " + getPilotName() + " (License: " + getLicenseNumber() + ")");
        System.out.println(sid + "Cabin Crew: " + getCrewName() + " (" + getRole() + " - " + getShift() + " shift)");

        System.out.println(sid);
        System.out.println(sid + "--- FARE BREAKDOWN ---");
        System.out.println(sid + String.format("Base Fare:              $%.2f", getBaseFare()));
        System.out.println(sid + String.format("Taxes & Fees:           $%.2f", taxes));
        System.out.println(sid + String.format("Discounts:             -$%.2f", discounts));
        System.out.println(sid + "-".repeat(70));
        System.out.println(sid + String.format("TOTAL FARE:             $%.2f", calculateFare()));

        System.out.println(sid);
        System.out.println(sid + "--- PAYMENT INFORMATION ---");
        System.out.println(sid + "Payment Date: " + getPaymentDate());
        System.out.println(sid + "Payment Method: " + getPaymentMethod());
        System.out.println(sid + String.format("Amount Paid: $%.2f", getAmountPaid()));

        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "Thank you for choosing " + getAirlineName() + "!");
        System.out.println(sid + "Have a pleasant flight!");
        System.out.println(sid + "=".repeat(70));
    }
}