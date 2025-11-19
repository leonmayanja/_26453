package _26453.q1;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode);
        setSupplierName(supplierName);
        setSupplierEmail(supplierEmail);
        setSupplierPhone(supplierPhone);
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

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid supplier email! Please enter a valid email address.");
        } else {
            this.supplierEmail = supplierEmail;
        }
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) {
            System.out.println("Invalid supplier phone number! Phone must be exactly 10 digits.");
        } else {
            this.supplierPhone = supplierPhone;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier Email: " + supplierEmail);
        System.out.println("Supplier Phone: " + supplierPhone);
    }
}
