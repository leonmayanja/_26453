package _26453.q1;

public class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       String saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue);
        setReportDate(reportDate);
        setRemarks(remarks);
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.trim().isEmpty()) {
            System.out.println("Invalid report date! Date cannot be empty.");
        } else {
            this.reportDate = reportDate;
        }
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        if (remarks == null || remarks.trim().isEmpty()) {
            System.out.println("Invalid remarks! Remarks cannot be empty.");
        } else {
            this.remarks = remarks;
        }
    }

    /**
     * Generates a comprehensive stock report summarizing total stock and sales
     */
    public void generateReport() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("                    STOCK MANAGEMENT REPORT");
        System.out.println("=".repeat(70));
        System.out.println("Report Date: " + reportDate);
        System.out.println("Report ID: " + getId());
        System.out.println("-".repeat(70));

        System.out.println("\n--- WAREHOUSE INFORMATION ---");
        System.out.println("Warehouse: " + getWarehouseName());
        System.out.println("Location: " + getLocation());
        System.out.println("Contact: " + getContactNumber());

        System.out.println("\n--- PRODUCT DETAILS ---");
        System.out.println("Category: " + getCategoryName() + " (" + getCategoryCode() + ")");
        System.out.println("Product Name: " + getProductName());
        System.out.println("Unit Price: RWF" + getUnitPrice());
        System.out.println("Stock Limit: " + getStockLimit());

        System.out.println("\n--- SUPPLIER INFORMATION ---");
        System.out.println("Supplier: " + getSupplierName());
        System.out.println("Email: " + getSupplierEmail());
        System.out.println("Phone: " + getSupplierPhone());

        System.out.println("\n--- STOCK STATUS ---");
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Reorder Level: " + getReorderLevel());

        // Check if reorder is needed
        if (getQuantityAvailable() <= getReorderLevel()) {
            System.out.println("*** REORDER ALERT: Stock below reorder level! ***");
        }

        System.out.println("\n--- PURCHASE HISTORY ---");
        System.out.println("Last Purchase Date: " + getPurchaseDate());
        System.out.println("Purchased Quantity: " + getPurchasedQuantity());
        System.out.println("Purchase Supplier: " + getPurchaseSupplierName());
        System.out.println("Purchase Value: RWF" + (getPurchasedQuantity() * getUnitPrice()));

        System.out.println("\n--- SALES HISTORY ---");
        System.out.println("Last Sale Date: " + getSaleDate());
        System.out.println("Sold Quantity: " + getSoldQuantity());
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Sale Value: RWF" + (getSoldQuantity() * getUnitPrice()));

        System.out.println("\n--- INVENTORY SUMMARY ---");
        System.out.println("Total Items in Stock: " + getTotalItems());
        System.out.println("Total Stock Value: RWF" + getStockValue());
        System.out.println("Average Item Value: RWF" + (getTotalItems() > 0 ? getStockValue() / getTotalItems() : 0));

        // Calculate turnover
        System.out.println("\n--- ANALYSIS ---");
        System.out.println("Stock Turnover Rate: " +
                (getQuantityAvailable() > 0 ? (getSoldQuantity() * 100.0 / (getQuantityAvailable() + getSoldQuantity())) : 0) + "%");
        System.out.println("Remaining Stock Capacity: " + (getStockLimit() - getQuantityAvailable()) + " units");

        System.out.println("\n--- REMARKS ---");
        System.out.println(remarks);

        System.out.println("\n" + "=".repeat(70));
        System.out.println("Report Generated: " + reportDate);
        System.out.println("=".repeat(70));
    }

    @Override
    public void displayInfo() {
        generateReport();
    }
}
