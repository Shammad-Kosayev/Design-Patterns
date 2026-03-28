public class EntityBuilder {

    private String username;
    private String email;
    private String phone;
    private String address;
    private int age;
    private boolean isAdmin;

    public EntityBuilder username(String username) {
        this.username = username;
        return this;
    }
    public EntityBuilder email(String email) {
        this.email = email;
        return this;
    }
    public EntityBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public EntityBuilder address(String address) {
        this.address = address;
        return this;
    }
    public EntityBuilder age(int age) {
        this.age = age;
        return this;
    }
    public EntityBuilder admin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    public Entity build() {
        return new Entity(username, email, phone, address, age, isAdmin);
    }

}
