package good_code;

public class ValidationHandler extends Handler {

    public void handle(Request request) {

        if (!request.isValid()) {
            throw new RuntimeException("Invalid request");
        }

        System.out.println("Validation passed");

        if (next != null) next.handle(request);
    }
}
