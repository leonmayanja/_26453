package _26453.q6;

import _26453.q4.Organization;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String managerName, String name) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
        setManagerName(managerName);
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
        if (deptCode == null || deptCode.length() < 3) {
            System.out.println("Invalid department code! Code must be at least 3 characters.");
        } else {
            this.deptCode = deptCode;
        }
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        if (managerName == null || managerName.trim().isEmpty()) {
            System.out.println("Invalid manager name! Name cannot be empty.");
        } else {
            this.managerName = managerName;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Code: " + deptCode);
        System.out.println("Manager Name: " + managerName);
    }
}