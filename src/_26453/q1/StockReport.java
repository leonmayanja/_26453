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
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "                    STOCK MANAGEMENT REPORT");
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "Report Date: " + reportDate);
        System.out.println(sid + "Report ID: " + getId());
        System.out.println(sid + "-".repeat(70));

        System.out.println(sid);
        System.out.println(sid + "--- WAREHOUSE INFORMATION ---");
        System.out.println(sid + "Warehouse: " + getWarehouseName());
        System.out.println(sid + "Location: " + getLocation());
        System.out.println(sid + "Contact: " + getContactNumber());

        System.out.println(sid);
        System.out.println(sid + "--- PRODUCT DETAILS ---");
        System.out.println(sid + "Category: " + getCategoryName() + " (" + getCategoryCode() + ")");
        System.out.println(sid + "Product Name: " + getProductName());
        System.out.println(sid + "Unit Price: $" + getUnitPrice());
        System.out.println(sid + "Stock Limit: " + getStockLimit());

        System.out.println(sid);
        System.out.println(sid + "--- SUPPLIER INFORMATION ---");
        System.out.println(sid + "Supplier: " + getSupplierName());
        System.out.println(sid + "Email: " + getSupplierEmail());
        System.out.println(sid + "Phone: " + getSupplierPhone());

        System.out.println(sid);
        System.out.println(sid + "--- STOCK STATUS ---");
        System.out.println(sid + "Quantity Available: " + getQuantityAvailable());
        System.out.println(sid + "Reorder Level: " + getReorderLevel());

        // Check if reorder is needed
        if (getQuantityAvailable() <= getReorderLevel()) {
            System.out.println(sid + "*** REORDER ALERT: Stock below reorder level! ***");
        }

        System.out.println(sid);
        System.out.println(sid + "--- PURCHASE HISTORY ---");
        System.out.println(sid + "Last Purchase Date: " + getPurchaseDate());
        System.out.println(sid + "Purchased Quantity: " + getPurchasedQuantity());
        System.out.println(sid + "Purchase Supplier: " + getPurchaseSupplierName());
        System.out.println(sid + "Purchase Value: $" + (getPurchasedQuantity() * getUnitPrice()));

        System.out.println(sid);
        System.out.println(sid + "--- SALES HISTORY ---");
        System.out.println(sid + "Last Sale Date: " + getSaleDate());
        System.out.println(sid + "Sold Quantity: " + getSoldQuantity());
        System.out.println(sid + "Customer: " + getCustomerName());
        System.out.println(sid + "Sale Value: $" + (getSoldQuantity() * getUnitPrice()));

        System.out.println(sid);
        System.out.println(sid + "--- INVENTORY SUMMARY ---");
        System.out.println(sid + "Total Items in Stock: " + getTotalItems());
        System.out.println(sid + "Total Stock Value: $" + getStockValue());
        System.out.println(sid + "Average Item Value: $" + (getTotalItems() > 0 ? getStockValue() / getTotalItems() : 0));

        // Calculate turnover
        System.out.println(sid);
        System.out.println(sid + "--- ANALYSIS ---");
        System.out.println(sid + "Stock Turnover Rate: " +
                (getQuantityAvailable() > 0 ? (getSoldQuantity() * 100.0 / (getQuantityAvailable() + getSoldQuantity())) : 0) + "%");
        System.out.println(sid + "Remaining Stock Capacity: " + (getStockLimit() - getQuantityAvailable()) + " units");

        System.out.println(sid);
        System.out.println(sid + "--- REMARKS ---");
        System.out.println(sid + remarks);

        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "Report Generated: " + reportDate);
        System.out.println(sid + "=".repeat(70));
    }

    @Override
    public void displayInfo() {
        generateReport();
    }
}
