package _26453.q6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setOrgCode(orgCode);
        setRssbNumber(rssbNumber);
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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        if (orgCode == null || orgCode.length() < 3) {
            System.out.println("Invalid organization code! Code must be at least 3 characters.");
        } else {
            this.orgCode = orgCode;
        }
    }

    public String getRssbNumber() {
        return rssbNumber;
    }

    public void setRssbNumber(String rssbNumber) {
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) {
            System.out.println("Invalid RSSB number! RSSB number must be exactly 8 digits.");
        } else {
            this.rssbNumber = rssbNumber;
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
        System.out.println("Organization Code: " + orgCode);
        System.out.println("RSSB Number: " + rssbNumber);
        System.out.println("Contact Email: " + contactEmail);
    }
}