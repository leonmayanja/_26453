package _26453.q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        setWarehouseName(warehouseName);
        setLocation(location);
        setContactNumber(contactNumber);
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.trim().isEmpty()) {
            System.out.println("Invalid warehouse name! Name cannot be empty.");
        } else {
            this.warehouseName = warehouseName;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            System.out.println("Invalid phone number! Phone must be exactly 10 digits.");
        } else {
            this.contactNumber = contactNumber;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warehouse Name: " + warehouseName);
        System.out.println("Location: " + location);
        System.out.println("Contact Number: " + contactNumber);
    }
}
