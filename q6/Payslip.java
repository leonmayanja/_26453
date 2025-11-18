package _26453.q6;

public class Payslip extends Payroll {
    private String payslipNumber;
    private String paymentDate;
    private String paymentMethod;

    public Payslip(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double tax, double otherDeductions,
                   double overtimePay, double bonus, double otherAllowances,
                   String payslipNumber, String paymentDate, String paymentMethod) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                rssbContribution, tax, otherDeductions, overtimePay, bonus, otherAllowances);
        setPayslipNumber(payslipNumber);
        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
    }

    public String getPayslipNumber() {
        return payslipNumber;
    }

    public void setPayslipNumber(String payslipNumber) {
        if (payslipNumber == null || payslipNumber.trim().isEmpty()) {
            System.out.println("Invalid payslip number! Number cannot be empty.");
        } else {
            this.payslipNumber = payslipNumber;
        }
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            System.out.println("Invalid payment method! Method cannot be empty.");
        } else {
            this.paymentMethod = paymentMethod;
        }
    }

    // Generate a formatted payslip with all salary details
    public void generatePayslip() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("                         EMPLOYEE PAYSLIP");
        System.out.println("=".repeat(70));
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("-".repeat(70));

        System.out.println("\n--- EMPLOYEE INFORMATION ---");
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Name: " + getFullName());
        System.out.println("Position: " + getPosition());
        System.out.println("Department: " + getDeptName());
        System.out.println("RSSB Registered: " + (isRssbRegistered() ? "Yes" : "No"));

        System.out.println("\n--- PAYROLL PERIOD ---");
        System.out.println("Month: " + getMonth() + "/" + getYear());
        System.out.println("Period: " + getStartDate() + " to " + getEndDate());

        System.out.println("\n--- EARNINGS ---");
        System.out.printf("Basic Pay:              RWF %,.2f%n", getBasicPay());
        System.out.printf("Transport Allowance:    RWF %,.2f%n", getTransportAllowance());
        System.out.printf("Housing Allowance:      RWF %,.2f%n", getHousingAllowance());
        System.out.printf("Overtime Pay:           RWF %,.2f%n", getOvertimePay());
        System.out.printf("Bonus:                  RWF %,.2f%n", getBonus());
        System.out.printf("Other Allowances:       RWF %,.2f%n", getOtherAllowances());
        System.out.println("-".repeat(70));
        System.out.printf("GROSS SALARY:           RWF %,.2f%n", getGrossSalary());

        System.out.println("\n--- DEDUCTIONS ---");
        System.out.printf("RSSB Contribution (3%%): RWF %,.2f%n", getRssbContribution());
        System.out.printf("Income Tax:             RWF %,.2f%n", getTax());
        System.out.printf("Other Deductions:       RWF %,.2f%n", getOtherDeductions());
        System.out.println("-".repeat(70));
        System.out.printf("TOTAL DEDUCTIONS:       RWF %,.2f%n", getTotalDeductions());

        System.out.println("\n" + "=".repeat(70));
        System.out.printf("NET SALARY:             RWF %,.2f%n", getNetSalary());
        System.out.println("=".repeat(70));

        System.out.println("\nOrganization: " + getOrgName());
        //System.out.println("RSSB Number: " + getRssbNumber());
        System.out.println("\nThis is a computer-generated payslip.");
    }

    @Override
    public void displayInfo() {
        generatePayslip();
    }
}