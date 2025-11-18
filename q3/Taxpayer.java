package _26453.q3;

public class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        setTin(tin);
        setTaxpayerName(taxpayerName);
        setAddress(address);
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        if (tin == null || !tin.matches("\\d{9}")) {
            System.out.println("Invalid TIN! TIN must be exactly 9 digits.");
        } else {
            this.tin = tin;
        }
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) {
        if (taxpayerName == null || taxpayerName.trim().isEmpty()) {
            System.out.println("Invalid taxpayer name! Name cannot be empty.");
        } else {
            this.taxpayerName = taxpayerName;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            System.out.println("Invalid address! Address cannot be empty.");
        } else {
            this.address = address;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("TIN: " + tin);
        System.out.println("Taxpayer Name: " + taxpayerName);
        System.out.println("Address: " + address);
    }
}