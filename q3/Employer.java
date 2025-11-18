package _26453.q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address);
        setEmployerName(employerName);
        setEmployerTIN(employerTIN);
        setContact(contact);
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        if (employerName == null || employerName.trim().isEmpty()) {
            System.out.println("Invalid employer name! Name cannot be empty.");
        } else {
            this.employerName = employerName;
        }
    }

    public String getEmployerTIN() {
        return employerTIN;
    }

    public void setEmployerTIN(String employerTIN) {
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) {
            System.out.println("Invalid employer TIN! TIN must be exactly 9 digits.");
        } else {
            this.employerTIN = employerTIN;
        }
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || !contact.matches("\\d{10}")) {
            System.out.println("Invalid contact! Phone must be exactly 10 digits.");
        } else {
            this.contact = contact;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employer Name: " + employerName);
        System.out.println("Employer TIN: " + employerTIN);
        System.out.println("Contact: " + contact);
    }
}