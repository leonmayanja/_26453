package _26453.q4;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        setSupplierName(supplierName);
        setSupplierTIN(supplierTIN);
        setContact(contact);
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) {
            System.out.println("Invalid supplier name! Name cannot be empty.");
        } else {
            this.supplierName = supplierName;
        }
    }

    public String getSupplierTIN() {
        return supplierTIN;
    }

    public void setSupplierTIN(String supplierTIN) {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) {
            System.out.println("Invalid supplier TIN! TIN must be exactly 9 digits.");
        } else {
            this.supplierTIN = supplierTIN;
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
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier TIN: " + supplierTIN);
        System.out.println("Contact: " + contact);
    }
}