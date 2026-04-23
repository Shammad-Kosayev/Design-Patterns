package bad_code;

public class RequestHandler {

    public void handle(Request request) {

        if (!request.isAuthenticated()) {
            throw new RuntimeException("Not authenticated");
        }

        if (!request.hasRole("ADMIN")) {
            throw new RuntimeException("Not authorized");
        }

        if (!request.isValid()) {
            throw new RuntimeException("Invalid request");
        }

        System.out.println("good_code.Request processed");
    }
}
