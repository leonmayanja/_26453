package _26453.q6;

public class Employee extends Department {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName);
        setEmployeeID(employeeID);
        setFullName(fullName);
        setPosition(position);
        setBaseSalary(baseSalary);
        setRssbRegistered(rssbRegistered);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID < 1000) {
            System.out.println("Invalid employee ID! Employee ID must be at least 1000.");
        } else {
            this.employeeID = employeeID;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            System.out.println("Invalid full name! Name cannot be empty.");
        } else {
            this.fullName = fullName;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            System.out.println("Invalid position! Position cannot be empty.");
        } else {
            this.position = position;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("Invalid base salary! Salary must be greater than 0.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public boolean isRssbRegistered() {
        return rssbRegistered;
    }

    public void setRssbRegistered(boolean rssbRegistered) {
        this.rssbRegistered = rssbRegistered;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Base Salary: RWF " + baseSalary);
        System.out.println("RSSB Registered: " + (rssbRegistered ? "Yes" : "No"));
    }
}