package _26453.q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        if (orgName == null || orgName.trim().isEmpty()) {
            System.out.println("Invalid organization name! Name cannot be empty.");
        } else {
            this.orgName = orgName;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            System.out.println("Invalid address! Address cannot be empty.");
        } else {
            this.address = address;
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
        System.out.println("Organization Name: " + orgName);
        System.out.println("Address: " + address);
        System.out.println("Contact Email: " + contactEmail);
    }
}