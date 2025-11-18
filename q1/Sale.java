package _26453.q1;

public class Sale extends Purchase {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                String saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName);
        setSaleDate(saleDate);
        setSoldQuantity(soldQuantity);
        setCustomerName(customerName);
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        if (saleDate == null || saleDate.trim().isEmpty()) {
            System.out.println("Invalid sale date! Date cannot be null or empty.");
        } else {
            this.saleDate = saleDate;
        }
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) {
            System.out.println("Invalid sold quantity! Quantity must be greater than 0.");
        } else {
            this.soldQuantity = soldQuantity;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            System.out.println("Invalid customer name! Name cannot be empty.");
        } else {
            this.customerName = customerName;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sale Date: " + saleDate);
        System.out.println("Sold Quantity: " + soldQuantity);
        System.out.println("Customer Name: " + customerName);
    }
}
