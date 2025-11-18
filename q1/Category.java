package _26453.q1;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        setCategoryName(categoryName);
        setCategoryCode(categoryCode);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            System.out.println("Invalid category name! Name cannot be empty.");
        } else {
            this.categoryName = categoryName;
        }
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || !categoryCode.matches("[a-zA-Z0-9]+") || categoryCode.length() < 3) {
            System.out.println("Invalid category code! Code must be alphanumeric and at least 3 characters.");
        } else {
            this.categoryCode = categoryCode;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Code: " + categoryCode);
    }
}
