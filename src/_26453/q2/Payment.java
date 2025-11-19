package _26453.q2;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass,
                   String paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);
        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
        setAmountPaid(amountPaid);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            System.out.println("Invalid payment date! Date cannot be empty.");
        } else {
            this.paymentDate = paymentDate;
        }
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            System.out.println("Invalid payment method! Method cannot be empty.");
        } else {
            this.paymentMethod = paymentMethod;
        }
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        if (amountPaid <= 0) {
            System.out.println("Invalid amount paid! Amount must be greater than 0.");
        } else {
            this.amountPaid = amountPaid;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount Paid: RWF" + amountPaid);
    }
}