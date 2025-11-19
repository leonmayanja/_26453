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
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=== PROCUREMENT REPORT ===");
        System.out.println(sid + "ID: " + getId());
        System.out.println(sid + "Created Date: " + getCreatedDate());
        System.out.println(sid + "Updated Date: " + getUpdatedDate());
        System.out.println(sid + "Organization Name: " + getOrgName());
        //System.out.println(sid + "Organization Code: " + getOrgCode());
        System.out.println(sid + "Contact Email: " + getContactEmail());
        System.out.println(sid + "Department Name: " + getDeptName());
        System.out.println(sid + "Department Code: " + getDeptCode());
        System.out.println(sid + "Supplier Name: " + getSupplierName());
        System.out.println(sid + "Supplier TIN: " + getSupplierTIN());
        System.out.println(sid + "Contact: " + getContact());
        System.out.println(sid + "Product Name: " + getProductName());
        System.out.println(sid + "Unit Price: $" + getUnitPrice());
        System.out.println(sid + "Quantity: " + getQuantity());
        System.out.println(sid + "PO Number: " + getPoNumber());
        System.out.println(sid + "Order Date: " + getOrderDate());
        System.out.println(sid + "Total Amount: $" + getTotalAmount());
        System.out.println(sid + "Delivery Date: " + getDeliveryDate());
        System.out.println(sid + "Delivered By: " + getDeliveredBy());
        System.out.println(sid + "Inspector Name: " + getInspectorName());
        System.out.println(sid + "Inspection Status: " + getStatus());
        System.out.println(sid + "Remarks: " + getRemarks());
        System.out.println(sid + "Invoice Number: " + getInvoiceNo());
        System.out.println(sid + "Invoice Amount: $" + getInvoiceAmount());
        System.out.println(sid + "Report Date: " + reportDate);
        System.out.println(sid + "Summary: " + summary);
        System.out.println(sid);
        System.out.println(sid + "=== TOTAL CALCULATION ===");
        System.out.println(sid + String.format("Total Purchase Amount: $%.2f", calculateTotal()));
    }
}