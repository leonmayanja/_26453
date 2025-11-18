package _26453.q4;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, String createdDate, String updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            System.out.println("Invalid product name! Name cannot be empty.");
        } else {
            this.productName = productName;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            System.out.println("Invalid unit price! Price must be greater than 0.");
        } else {
            this.unitPrice = unitPrice;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity! Quantity cannot be negative.");
        } else {
            this.quantity = quantity;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: RWF" + unitPrice);
        System.out.println("Quantity: " + quantity);
    }
}