package _26453.q3;

public class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    private double taxCredits;

    public TaxRecord(int id, String createdDate, String updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount,
                     String receiptNo, double taxCredits) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome, assessmentDate, assessedTax,
                paymentDate, paymentAmount);
        setReceiptNo(receiptNo);
        setTaxCredits(taxCredits);
        this.totalTax = computeTax();
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        if (receiptNo == null || receiptNo.trim().isEmpty()) {
            System.out.println("Invalid receipt number! Receipt number cannot be empty.");
        } else {
            this.receiptNo = receiptNo;
        }
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getTaxCredits() {
        return taxCredits;
    }

    public void setTaxCredits(double taxCredits) {
        if (taxCredits < 0) {
            System.out.println("Invalid tax credits! Credits cannot be negative.");
        } else {
            this.taxCredits = taxCredits;
        }
    }

    // Compute tax using formula: (salary × rate) - credits
    public double computeTax() {
        double tax = (getSalary() * getRate() / 100) - taxCredits;
        return Math.max(0, tax);  // Ensure tax is not negative
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== TAX RECORD REPORT ===");
        super.displayInfo();
        System.out.println("Receipt Number: " + receiptNo);
        System.out.println("Tax Credits: RWF" + taxCredits);
        System.out.println("\n=== TAX COMPUTATION ===");
        System.out.printf("Salary: RWF%.2f%n", getSalary());
        System.out.printf("Tax Rate: %.2f%%%n", getRate());
        System.out.printf("Gross Tax: RWF%.2f%n", (getSalary() * getRate() / 100));
        System.out.printf("Tax Credits: RWF%.2f%n", taxCredits);
        System.out.printf("TOTAL TAX PAYABLE: RWF%.2f%n", totalTax);
    }
}