package _26453.q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String createdDate, String updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        setPilotName(pilotName);
        setLicenseNumber(licenseNumber);
        setExperienceYears(experienceYears);
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        if (pilotName == null || pilotName.trim().isEmpty()) {
            System.out.println("Invalid pilot name! Name cannot be empty.");
        } else {
            this.pilotName = pilotName;
        }
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            System.out.println("Invalid license number! License number cannot be empty.");
        } else {
            this.licenseNumber = licenseNumber;
        }
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2) {
            System.out.println("Invalid experience years! Experience must be at least 2 years.");
        } else {
            this.experienceYears = experienceYears;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pilot Name: " + pilotName);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Experience Years: " + experienceYears);
    }
}