package good_code;

// Concrete handler
public class AuthHandler extends Handler {

    @Override
    public void handle(Request request) {
        if (!request.isAuthenticated()) {
            throw new RuntimeException("Not authenticated");
        }

        System.out.println("Auth passed");

        if (next != null) next.handle(request);
    }
}
