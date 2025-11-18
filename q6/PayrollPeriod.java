package _26453.q6;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String createdDate, String updatedDate,
                         String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, String startDate, String endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        setMonth(month);
        setYear(year);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Month must be between 1 and 12.");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2000) {
            System.out.println("Invalid year! Year must be 2000 or later.");
        } else {
            this.year = year;
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (startDate == null || startDate.trim().isEmpty()) {
            System.out.println("Invalid start date! Date cannot be null or empty.");
        } else {
            this.startDate = startDate;
        }
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        if (endDate == null || endDate.trim().isEmpty()) {
            System.out.println("Invalid end date! Date cannot be null or empty.");
        } else {
            this.endDate = endDate;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payroll Month: " + month);
        System.out.println("Payroll Year: " + year);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}