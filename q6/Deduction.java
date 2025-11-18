package _26453.q6;

public class Deduction extends SalaryStructure {
    private double rssbContribution;
    private double tax;
    private double otherDeductions;

    public Deduction(int id, String createdDate, String updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, String startDate, String endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double tax, double otherDeductions) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        setRssbContribution(rssbContribution);
        setTax(tax);
        setOtherDeductions(otherDeductions);
    }

    public double getRssbContribution() {
        return rssbContribution;
    }

    public void setRssbContribution(double rssbContribution) {
        if (rssbContribution < 0) {
            System.out.println("Invalid RSSB contribution! Contribution cannot be negative.");
        } else {
            this.rssbContribution = rssbContribution;
        }
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        if (tax < 0) {
            System.out.println("Invalid tax! Tax cannot be negative.");
        } else {
            this.tax = tax;
        }
    }

    public double getOtherDeductions() {
        return otherDeductions;
    }

    public void setOtherDeductions(double otherDeductions) {
        if (otherDeductions < 0) {
            System.out.println("Invalid other deductions! Deductions cannot be negative.");
        } else {
            this.otherDeductions = otherDeductions;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RSSB Contribution: RWF " + rssbContribution);
        System.out.println("Tax: RWF " + tax);
        System.out.println("Other Deductions: RWF " + otherDeductions);
    }
}