package good_code;

public class RoleHandler extends Handler {

    public void handle(Request request) {

        if (!request.hasRole("ADMIN")) {
            throw new RuntimeException("Not authorized");
        }

        System.out.println("Role check passed");

        if (next != null) next.handle(request);
    }
}
