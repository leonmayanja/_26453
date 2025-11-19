package _26453.q1;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String createdDate, String updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setStockLimit(stockLimit);
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

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0) {
            System.out.println("Invalid stock limit! Limit cannot be negative.");
        } else {
            this.stockLimit = stockLimit;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: RWF" + unitPrice);
        System.out.println("Stock Limit: " + stockLimit);
    }
}
