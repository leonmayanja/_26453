package _26453.q6;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double tax, double otherDeductions,
                   double overtimePay, double bonus, double otherAllowances) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                rssbContribution, tax, otherDeductions, overtimePay, bonus, otherAllowances);
        calculatePayroll();
    }

    private void calculatePayroll() {
        // Calculate gross salary
        this.grossSalary = getBasicPay() + getTransportAllowance() + getHousingAllowance()
                + getOvertimePay() + getBonus() + getOtherAllowances();

        // Calculate total deductions
        this.totalDeductions = getRssbContribution() + getTax() + getOtherDeductions();

        // Calculate net salary
        this.netSalary = grossSalary - totalDeductions;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n=== PAYROLL CALCULATION ===");
        System.out.println("Gross Salary: RWF " + grossSalary);
        System.out.println("Total Deductions: RWF " + totalDeductions);
        System.out.println("Net Salary: RWF " + netSalary);
    }
}