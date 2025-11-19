package _26453.q2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(int id, String createdDate, String updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears);
        setCrewName(crewName);
        setRole(role);
        setShift(shift);
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        if (crewName == null || crewName.trim().isEmpty()) {
            System.out.println("Invalid crew name! Name cannot be empty.");
        } else {
            this.crewName = crewName;
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role == null || role.trim().isEmpty()) {
            System.out.println("Invalid role! Role cannot be empty.");
        } else {
            this.role = role;
        }
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (shift == null || (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))) {
            System.out.println("Invalid shift! Shift must be 'Day' or 'Night'.");
        } else {
            this.shift = shift;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Crew Name: " + crewName);
        System.out.println("Role: " + role);
        System.out.println("Shift: " + shift);
    }
}