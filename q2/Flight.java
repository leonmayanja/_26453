package _26453.q2;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, String createdDate, String updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail);
        setFlightNumber(flightNumber);
        setDeparture(departure);
        setDestination(destination);
        setBaseFare(baseFare);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.trim().isEmpty()) {
            System.out.println("Invalid flight number! Flight number cannot be empty.");
        } else {
            this.flightNumber = flightNumber;
        }
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        if (departure == null || departure.trim().isEmpty()) {
            System.out.println("Invalid departure! Departure cannot be empty.");
        } else {
            this.departure = departure;
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null || destination.trim().isEmpty()) {
            System.out.println("Invalid destination! Destination cannot be empty.");
        } else {
            this.destination = destination;
        }
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        if (baseFare <= 0) {
            System.out.println("Invalid base fare! Fare must be greater than 0.");
        } else {
            this.baseFare = baseFare;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure: " + departure);
        System.out.println("Destination: " + destination);
        System.out.println("Base Fare: RWF" + baseFare);
    }
}