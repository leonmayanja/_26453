package _26453.q4;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;

    public Inspection(int id, String createdDate, String updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, String orderDate, double totalAmount,
                      String deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy);
        setInspectorName(inspectorName);
        setStatus(status);
        setRemarks(remarks);
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        if (inspectorName == null || inspectorName.trim().isEmpty()) {
            System.out.println("Invalid inspector name! Name cannot be empty.");
        } else {
            this.inspectorName = inspectorName;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || (!status.equalsIgnoreCase("Passed") && !status.equalsIgnoreCase("Failed"))) {
            System.out.println("Invalid status! Status must be 'Passed' or 'Failed'.");
        } else {
            this.status = status;
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

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Inspector Name: " + inspectorName);
        System.out.println("Inspection Status: " + status);
        System.out.println("Remarks: " + remarks);
    }
}