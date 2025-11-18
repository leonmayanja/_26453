package _26453.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Invalid ID! ID must be greater than 0.");
        } else {
            this.id = id;
        }
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        if (createdDate == null || createdDate.trim().isEmpty()) {
            System.out.println("Invalid created date! Date cannot be null or empty.");
        } else {
            this.createdDate = createdDate;
        }
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            System.out.println("Invalid updated date! Date cannot be null or empty.");
        } else {
            this.updatedDate = updatedDate;
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Created Date: " + createdDate);
        System.out.println("Updated Date: " + updatedDate);
    }
}