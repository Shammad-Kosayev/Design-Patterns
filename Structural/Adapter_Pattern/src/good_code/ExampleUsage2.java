package good_code;

public class ExampleUsage2 {
    public static void main(String[] args) {

        String provider = "STRIPE"; // imagine this comes from config / DB / request

        // selecting the implementation at runtime
        PaymentProcessor processor = switch (provider) {
            case "STRIPE" -> new StripePaymentAdapter(new StripeClient());
            case "LOCAL"  -> new LocalPaymentProcessor();
            default -> throw new IllegalArgumentException("Unknown provider: " + provider);
        };

        CheckoutService service = new CheckoutService(processor);
        service.checkout(120.0, "cust_42");
    }
}
