package good_code;

public class Main {
    public static void main(String[] args) {
        Handler auth = new AuthHandler();
        Handler role = new RoleHandler();
        Handler validation = new ValidationHandler();

        auth.setNext(role).setNext(validation);

        Request request = new Request();
        request.authenticated = true;
        request.role = "ADMIN";
        request.valid = true;

        auth.handle(request);
    }
}
