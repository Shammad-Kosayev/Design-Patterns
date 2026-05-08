package bad_code;

public class ExampleUsage {
    public static void main(String[] args) {

        CheckoutService service = new CheckoutService(
                new LocalPaymentProcessor(),
                new StripeClient()
        );

        service.checkout("LOCAL", 50.0, "cust_1");
        service.checkout("STRIPE", 99.99, "cust_2");

        // imagine adding "PAYPAL", "APPLE_PAY", "GOOGLE_PAY"...
        // every one of them = another else-if + another constructor parameter 💀
    }
}
