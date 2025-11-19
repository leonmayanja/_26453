package _26453.q6;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, String createdDate, String updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, String startDate, String endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate);
        setBasicPay(basicPay);
        setTransportAllowance(transportAllowance);
        setHousingAllowance(housingAllowance);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        if (basicPay < 0) {
            System.out.println("Invalid basic pay! Basic pay cannot be negative.");
        } else {
            this.basicPay = basicPay;
        }
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        if (transportAllowance < 0) {
            System.out.println("Invalid transport allowance! Allowance cannot be negative.");
        } else {
            this.transportAllowance = transportAllowance;
        }
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }

    public void setHousingAllowance(double housingAllowance) {
        if (housingAllowance < 0) {
            System.out.println("Invalid housing allowance! Allowance cannot be negative.");
        } else {
            this.housingAllowance = housingAllowance;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Basic Pay: RWF " + basicPay);
        System.out.println("Transport Allowance: RWF " + transportAllowance);
        System.out.println("Housing Allowance: RWF " + housingAllowance);
    }
}