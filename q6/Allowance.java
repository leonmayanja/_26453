package _26453.q6;

public class Allowance extends Deduction {
    private double overtimePay;
    private double bonus;
    private double otherAllowances;

    public Allowance(int id, String createdDate, String updatedDate,
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
                rssbContribution, tax, otherDeductions);
        setOvertimePay(overtimePay);
        setBonus(bonus);
        setOtherAllowances(otherAllowances);
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        if (overtimePay < 0) {
            System.out.println("Invalid overtime pay! Overtime pay cannot be negative.");
        } else {
            this.overtimePay = overtimePay;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Invalid bonus! Bonus cannot be negative.");
        } else {
            this.bonus = bonus;
        }
    }

    public double getOtherAllowances() {
        return otherAllowances;
    }

    public void setOtherAllowances(double otherAllowances) {
        if (otherAllowances < 0) {
            System.out.println("Invalid other allowances! Allowances cannot be negative.");
        } else {
            this.otherAllowances = otherAllowances;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overtime Pay: RWF " + overtimePay);
        System.out.println("Bonus: RWF " + bonus);
        System.out.println("Other Allowances: RWF " + otherAllowances);
    }
}