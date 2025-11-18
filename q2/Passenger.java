package _26453.q2;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        setPassengerName(passengerName);
        setAge(age);
        setGender(gender);
        setContact(contact);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        if (passengerName == null || passengerName.trim().isEmpty()) {
            System.out.println("Invalid passenger name! Name cannot be empty.");
        } else {
            this.passengerName = passengerName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age! Age must be greater than 0.");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("Male") &&
                !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            System.out.println("Invalid gender! Gender must be 'Male', 'Female', or 'Other'.");
        } else {
            this.gender = gender;
        }
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || contact.trim().isEmpty()) {
            System.out.println("Invalid contact! Contact cannot be empty.");
        } else {
            this.contact = contact;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact: " + contact);
    }
}