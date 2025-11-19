package _26453.q5;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String createdDate, String updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        setInstitutionName(institutionName);
        setCode(code);
        setAddress(address);
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        if (institutionName == null || institutionName.trim().isEmpty()) {
            System.out.println("Invalid institution name! Name cannot be empty.");
        } else {
            this.institutionName = institutionName;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || code.length() < 3) {
            System.out.println("Invalid code! Code must be at least 3 characters.");
        } else {
            this.code = code;
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

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
    }
}