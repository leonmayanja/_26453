package _26453.q5;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate,
                      String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        setDepartmentName(departmentName);
        setDepartmentHead(departmentHead);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.trim().isEmpty()) {
            System.out.println("Invalid department name! Name cannot be empty.");
        } else {
            this.departmentName = departmentName;
        }
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        if (departmentHead == null || departmentHead.trim().isEmpty()) {
            System.out.println("Invalid department head! Name cannot be empty.");
        } else {
            this.departmentHead = departmentHead;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Head: " + departmentHead);
    }
}