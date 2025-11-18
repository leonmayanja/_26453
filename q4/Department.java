package _26453.q4;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        if (deptName == null || deptName.trim().isEmpty()) {
            System.out.println("Invalid department name! Name cannot be empty.");
        } else {
            this.deptName = deptName;
        }
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        if (deptCode == null || !deptCode.matches("[a-zA-Z0-9]+") || deptCode.length() < 3) {
            System.out.println("Invalid department code! Code must be alphanumeric and at least 3 characters.");
        } else {
            this.deptCode = deptCode;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Code: " + deptCode);
    }
}