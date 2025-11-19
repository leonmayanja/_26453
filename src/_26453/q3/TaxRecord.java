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

    /**
     * Computes tax using formula: (salary × rate) - credits
     * @return computed tax amount
     */
    public double computeTax() {
        double tax = (getSalary() * getRate() / 100) - taxCredits;
        return Math.max(0, tax);  // Ensure tax is not negative
    }

    @Override
    public void displayInfo() {
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=== TAX RECORD REPORT ===");
        System.out.println(sid + "ID: " + getId());
        System.out.println(sid + "Created Date: " + getCreatedDate());
        System.out.println(sid + "Updated Date: " + getUpdatedDate());
        System.out.println(sid + "Authority Name: " + getAuthorityName());
        System.out.println(sid + "Region: " + getRegion());
        System.out.println(sid + "Email: " + getEmail());
        System.out.println(sid + "Category Name: " + getCategoryName());
        System.out.println(sid + "Tax Rate: " + getRate() + "%");
        System.out.println(sid + "Code: " + getCode());
        System.out.println(sid + "TIN: " + getTin());
        System.out.println(sid + "Taxpayer Name: " + getTaxpayerName());
        System.out.println(sid + "Address: " + getAddress());
        System.out.println(sid + "Employer Name: " + getEmployerName());
        System.out.println(sid + "Employer TIN: " + getEmployerTIN());
        System.out.println(sid + "Contact: " + getContact());
        System.out.println(sid + "Employee Name: " + getEmployeeName());
        System.out.println(sid + "Salary: $" + getSalary());
        System.out.println(sid + "Employee TIN: " + getEmployeeTIN());
        System.out.println(sid + "Declaration Month: " + getDeclarationMonth());
        System.out.println(sid + "Total Income: $" + getTotalIncome());
        System.out.println(sid + "Assessment Date: " + getAssessmentDate());
        System.out.println(sid + "Assessed Tax: $" + getAssessedTax());
        System.out.println(sid + "Payment Date: " + getPaymentDate());
        System.out.println(sid + "Payment Amount: $" + getPaymentAmount());
        System.out.println(sid + "Receipt Number: " + receiptNo);
        System.out.println(sid + "Tax Credits: $" + taxCredits);
        System.out.println(sid);
        System.out.println(sid + "=== TAX COMPUTATION ===");
        System.out.println(sid + String.format("Salary: $%.2f", getSalary()));
        System.out.println(sid + String.format("Tax Rate: %.2f%%", getRate()));
        System.out.println(sid + String.format("Gross Tax: $%.2f", (getSalary() * getRate() / 100)));
        System.out.println(sid + String.format("Tax Credits: $%.2f", taxCredits));
        System.out.println(sid + String.format("TOTAL TAX PAYABLE: $%.2f", totalTax));
    }
}