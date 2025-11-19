package _26453.q2;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact);
        setBookingDate(bookingDate);
        setSeatNumber(seatNumber);
        setTravelClass(travelClass);
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        if (bookingDate == null || bookingDate.trim().isEmpty()) {
            System.out.println("Invalid booking date! Date cannot be empty.");
        } else {
            this.bookingDate = bookingDate;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            System.out.println("Invalid seat number! Seat number cannot be empty.");
        } else {
            this.seatNumber = seatNumber;
        }
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        if (travelClass == null || (!travelClass.equalsIgnoreCase("Economy") &&
                !travelClass.equalsIgnoreCase("Business") && !travelClass.equalsIgnoreCase("First"))) {
            System.out.println("Invalid travel class! Class must be 'Economy', 'Business', or 'First'.");
        } else {
            this.travelClass = travelClass;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Booking Date: " + bookingDate);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Travel Class: " + travelClass);
    }
}