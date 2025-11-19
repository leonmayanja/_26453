package _26453.q1;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                     String saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName);
        setTotalItems(totalItems);
        setStockValue(stockValue);
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        if (totalItems < 0) {
            System.out.println("Invalid total items! Total cannot be negative.");
        } else {
            this.totalItems = totalItems;
        }
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        if (stockValue < 0) {
            System.out.println("Invalid stock value! Value cannot be negative.");
        } else {
            this.stockValue = stockValue;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Items in Inventory: " + totalItems);
        System.out.println("Stock Value: RWF" + stockValue);
    }
}
