package _26453.q3;

public class TaxAssessment extends TaxDeclaration {
    private String assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, String createdDate, String updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         String assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                declarationMonth, totalIncome);
        setAssessmentDate(assessmentDate);
        setAssessedTax(assessedTax);
    }

    public String getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(String assessmentDate) {
        if (assessmentDate == null || assessmentDate.trim().isEmpty()) {
            System.out.println("Invalid assessment date! Date cannot be empty.");
        } else {
            this.assessmentDate = assessmentDate;
        }
    }

    public double getAssessedTax() {
        return assessedTax;
    }

    public void setAssessedTax(double assessedTax) {
        if (assessedTax < 0) {
            System.out.println("Invalid assessed tax! Tax cannot be negative.");
        } else {
            this.assessedTax = assessedTax;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Assessment Date: " + assessmentDate);
        System.out.println("Assessed Tax: RWF" + assessedTax);
    }
}