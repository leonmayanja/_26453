package _26453.q3;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact);
        setEmployeeName(employeeName);
        setSalary(salary);
        setEmployeeTIN(employeeTIN);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName == null || employeeName.trim().isEmpty()) {
            System.out.println("Invalid employee name! Name cannot be empty.");
        } else {
            this.employeeName = employeeName;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Invalid salary! Salary must be greater than 0.");
        } else {
            this.salary = salary;
        }
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }

    public void setEmployeeTIN(String employeeTIN) {
        if (employeeTIN == null || !employeeTIN.matches("\\d{9}")) {
            System.out.println("Invalid employee TIN! TIN must be exactly 9 digits.");
        } else {
            this.employeeTIN = employeeTIN;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: RWF" + salary);
        System.out.println("Employee TIN: " + employeeTIN);
    }
}