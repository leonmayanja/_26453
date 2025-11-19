package _26453.q1;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit);
        setQuantityAvailable(quantityAvailable);
        setReorderLevel(reorderLevel);
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) {
            System.out.println("Invalid quantity available! Quantity cannot be negative.");
        } else {
            this.quantityAvailable = quantityAvailable;
        }
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) {
            System.out.println("Invalid reorder level! Level cannot be negative.");
        } else {
            this.reorderLevel = reorderLevel;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Reorder Level: " + reorderLevel);
    }
}
