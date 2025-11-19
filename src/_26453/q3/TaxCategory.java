package _26453.q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        setCategoryName(categoryName);
        setRate(rate);
        setCode(code);
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate <= 0) {
            System.out.println("Invalid tax rate! Rate must be greater than 0.");
        } else {
            this.rate = rate;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || code.length() < 3) {
            System.out.println("Invalid code! Code must be at least 3 characters.");
        } else {
            this.code = code;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category Name: " + categoryName);
        System.out.println("Tax Rate: " + rate + "%");
        System.out.println("Code: " + code);
    }
}