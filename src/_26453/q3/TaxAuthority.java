package _26453.q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate,
                        String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        setAuthorityName(authorityName);
        setRegion(region);
        setEmail(email);
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        if (authorityName == null || authorityName.trim().isEmpty()) {
            System.out.println("Invalid authority name! Name cannot be empty.");
        } else {
            this.authorityName = authorityName;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region == null || region.trim().isEmpty()) {
            System.out.println("Invalid region! Region cannot be empty.");
        } else {
            this.region = region;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Invalid email! Please enter a valid email address.");
        } else {
            this.email = email;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Authority Name: " + authorityName);
        System.out.println("Region: " + region);
        System.out.println("Email: " + email);
    }
}