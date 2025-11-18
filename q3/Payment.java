package _26453.q3;

public class Payment extends TaxAssessment {
    private String paymentDate;
    private double paymentAmount;

    public Payment(int id, String createdDate, String updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   String assessmentDate, double assessedTax,
                   String paymentDate, double paymentAmount) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome, assessmentDate, assessedTax);
        setPaymentDate(paymentDate);
        setPaymentAmount(paymentAmount);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            System.out.println("Invalid payment date! Date cannot be empty.");
        } else {
            this.paymentDate = paymentDate;
        }
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        if (paymentAmount <= 0) {
            System.out.println("Invalid payment amount! Amount must be greater than 0.");
        } else {
            this.paymentAmount = paymentAmount;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Amount: RWF" + paymentAmount);
    }
}