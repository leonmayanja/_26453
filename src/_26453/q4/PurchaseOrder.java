package _26453.q4;

public class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String createdDate, String updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, String orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity);
        setPoNumber(poNumber);
        setOrderDate(orderDate);
        setTotalAmount(totalAmount);
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        if (poNumber == null || poNumber.trim().isEmpty()) {
            System.out.println("Invalid PO number! PO number cannot be empty.");
        } else {
            this.poNumber = poNumber;
        }
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        if (orderDate == null || orderDate.trim().isEmpty()) {
            System.out.println("Invalid order date! Date cannot be empty.");
        } else {
            this.orderDate = orderDate;
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) {
            System.out.println("Invalid total amount! Amount must be greater than 0.");
        } else {
            this.totalAmount = totalAmount;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("PO Number: " + poNumber);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: RWF" + totalAmount);
    }
}