package _26453.q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        setAirlineName(airlineName);
        setAirlineCode(airlineCode);
        setContactEmail(contactEmail);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        if (airlineName == null || airlineName.trim().isEmpty()) {
            System.out.println("Invalid airline name! Name cannot be empty.");
        } else {
            this.airlineName = airlineName;
        }
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}")) {
            System.out.println("Invalid airline code! Code must be 2-4 letters.");
        } else {
            this.airlineCode = airlineCode;
        }
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid contact email! Please enter a valid email address.");
        } else {
            this.contactEmail = contactEmail;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Airline Code: " + airlineCode);
        System.out.println("Contact Email: " + contactEmail);
    }
}