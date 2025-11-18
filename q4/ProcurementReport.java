package _26453.q4;

public class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;

    public ProcurementReport(int id, String createdDate, String updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, String orderDate, double totalAmount,
                             String deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             String reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy, inspectorName, status, remarks,
                invoiceNo, invoiceAmount);
        setReportDate(reportDate);
        setSummary(summary);
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        if (summary == null || summary.trim().isEmpty()) {
            System.out.println("Invalid summary! Summary cannot be empty.");
        } else {
            this.summary = summary;
        }
    }

    /**
     * Calculates the total purchase amount
     * Formula: sum of all invoice amounts (in this case, the single invoice amount)
     * In a real system, this would sum multiple invoices
     * @return total purchase amount
     */
    public double calculateTotal() {
        // In this implementation, we return the invoice amount
        // In a real system, you'd sum all invoices from a list
        return getInvoiceAmount();
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== PROCUREMENT REPORT ===");
        super.displayInfo();
        System.out.println("Report Date: " + reportDate);
        System.out.println("Summary: " + summary);
        System.out.println("\n=== TOTAL CALCULATION ===");
        System.out.printf("Total Purchase Amount: RWF%.2f%n", calculateTotal());
    }
}