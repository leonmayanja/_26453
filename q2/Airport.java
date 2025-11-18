package _26453.q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        setAirportName(airportName);
        setCode(code);
        setLocation(location);
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        if (airportName == null || airportName.trim().isEmpty()) {
            System.out.println("Invalid airport name! Name cannot be empty.");
        } else {
            this.airportName = airportName;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || !code.matches("[A-Z]{3}")) {
            System.out.println("Invalid airport code! Code must be exactly 3 uppercase letters.");
        } else {
            this.code = code;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty()) {
            System.out.println("Invalid location! Location cannot be empty.");
        } else {
            this.location = location;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Airport Name: " + airportName);
        System.out.println("Airport Code: " + code);
        System.out.println("Location: " + location);
    }
}