package introduction.records;


//DTO
public record User(String name, String role, boolean isActive) {

    public User(String name, String role) {
        this(name, role, true);
    }

    public User(String name) {
        this(name, "ADMIN", true);
    }
}
