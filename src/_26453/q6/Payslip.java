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

    /**
     * Generates a formatted payslip with all salary details
     * Computes net salary and RSSB deductions
     */
    public void generatePayslip() {
        String sid = "26453 ";
        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "                         EMPLOYEE PAYSLIP");
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + "Payslip Number: " + payslipNumber);
        System.out.println(sid + "Payment Date: " + paymentDate);
        System.out.println(sid + "Payment Method: " + paymentMethod);
        System.out.println(sid + "-".repeat(70));

        System.out.println(sid);
        System.out.println(sid + "--- EMPLOYEE INFORMATION ---");
        System.out.println(sid + "Employee ID: " + getEmployeeID());
        System.out.println(sid + "Name: " + getFullName());
        System.out.println(sid + "Position: " + getPosition());
        System.out.println(sid + "Department: " + getDeptName());
        System.out.println(sid + "RSSB Registered: " + (isRssbRegistered() ? "Yes" : "No"));

        System.out.println(sid);
        System.out.println(sid + "--- PAYROLL PERIOD ---");
        System.out.println(sid + "Month: " + getMonth() + "/" + getYear());
        System.out.println(sid + "Period: " + getStartDate() + " to " + getEndDate());

        System.out.println(sid);
        System.out.println(sid + "--- EARNINGS ---");
        System.out.println(sid + String.format("Basic Pay:              RWF %,.2f", getBasicPay()));
        System.out.println(sid + String.format("Transport Allowance:    RWF %,.2f", getTransportAllowance()));
        System.out.println(sid + String.format("Housing Allowance:      RWF %,.2f", getHousingAllowance()));
        System.out.println(sid + String.format("Overtime Pay:           RWF %,.2f", getOvertimePay()));
        System.out.println(sid + String.format("Bonus:                  RWF %,.2f", getBonus()));
        System.out.println(sid + String.format("Other Allowances:       RWF %,.2f", getOtherAllowances()));
        System.out.println(sid + "-".repeat(70));
        System.out.println(sid + String.format("GROSS SALARY:           RWF %,.2f", getGrossSalary()));

        System.out.println(sid);
        System.out.println(sid + "--- DEDUCTIONS ---");
        System.out.println(sid + String.format("RSSB Contribution (3%%): RWF %,.2f", getRssbContribution()));
        System.out.println(sid + String.format("Income Tax:             RWF %,.2f", getTax()));
        System.out.println(sid + String.format("Other Deductions:       RWF %,.2f", getOtherDeductions()));
        System.out.println(sid + "-".repeat(70));
        System.out.println(sid + String.format("TOTAL DEDUCTIONS:       RWF %,.2f", getTotalDeductions()));

        System.out.println(sid);
        System.out.println(sid + "=".repeat(70));
        System.out.println(sid + String.format("NET SALARY:             RWF %,.2f", getNetSalary()));
        System.out.println(sid + "=".repeat(70));

        System.out.println(sid);
        System.out.println(sid + "Organization: " + getOrgName());
        //System.out.println(sid + "RSSB Number: " + getRssbNumber());
        System.out.println(sid);
        System.out.println(sid + "This is a computer-generated payslip.");
    }

    @Override
    public void displayInfo() {
        generatePayslip();
    }
}