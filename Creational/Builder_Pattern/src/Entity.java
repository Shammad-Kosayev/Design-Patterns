public class Entity {

    private String username;
    private String email;
    private String phone;
    private String address;
    private int age;
    private boolean isAdmin;

    public Entity(String username, String email, String phone, String address, int age, boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public static EntityBuilder builder() {
        return new EntityBuilder();
    }
}
