package good_code;

public class Request {

    boolean authenticated;
    boolean valid;
    String role;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean hasRole(String role) {
        return this.role.equals(role);
    }
}
