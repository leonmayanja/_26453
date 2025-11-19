package _26453.q3;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, String createdDate, String updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        setDeclarationMonth(declarationMonth);
        setTotalIncome(totalIncome);
    }

    public String getDeclarationMonth() {
        return declarationMonth;
    }

    public void setDeclarationMonth(String declarationMonth) {
        if (declarationMonth == null || declarationMonth.trim().isEmpty()) {
            System.out.println("Invalid declaration month! Month cannot be empty.");
        } else {
            this.declarationMonth = declarationMonth;
        }
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        if (totalIncome < 0) {
            System.out.println("Invalid total income! Income cannot be negative.");
        } else {
            this.totalIncome = totalIncome;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Declaration Month: " + declarationMonth);
        System.out.println("Total Income: RWF" + totalIncome);
    }
}