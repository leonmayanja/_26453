package _26453.q4;

public class Delivery extends PurchaseOrder {
    private String deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, String orderDate, double totalAmount,
                    String deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        setDeliveryDate(deliveryDate);
        setDeliveredBy(deliveredBy);
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        if (deliveryDate == null || deliveryDate.trim().isEmpty()) {
            System.out.println("Invalid delivery date! Date cannot be null or empty.");
        } else {
            this.deliveryDate = deliveryDate;
        }
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        if (deliveredBy == null || deliveredBy.trim().isEmpty()) {
            System.out.println("Invalid delivered by! Name cannot be null or empty.");
        } else {
            this.deliveredBy = deliveredBy;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Delivered By: " + deliveredBy);
    }
}