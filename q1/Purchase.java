package _26453.q1;

public class Purchase extends StockItem {
    private String purchaseDate;
    private int purchasedQuantity;
    private String purchaseSupplierName;

    public Purchase(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    String purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        setPurchaseDate(purchaseDate);
        setPurchasedQuantity(purchasedQuantity);
        setPurchaseSupplierName(purchaseSupplierName);
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        if (purchaseDate == null || purchaseDate.trim().isEmpty()) {
            System.out.println("Invalid purchase date! Date cannot be null or empty.");
        } else {
            this.purchaseDate = purchaseDate;
        }
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) {
            System.out.println("Invalid purchased quantity! Quantity must be greater than 0.");
        } else {
            this.purchasedQuantity = purchasedQuantity;
        }
    }

    public String getPurchaseSupplierName() {
        return purchaseSupplierName;
    }

    public void setPurchaseSupplierName(String purchaseSupplierName) {
        if (purchaseSupplierName == null || purchaseSupplierName.trim().isEmpty()) {
            System.out.println("Invalid purchase supplier name! Name cannot be empty.");
        } else {
            this.purchaseSupplierName = purchaseSupplierName;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Purchased Quantity: " + purchasedQuantity);
        System.out.println("Purchase Supplier: " + purchaseSupplierName);
    }
}
