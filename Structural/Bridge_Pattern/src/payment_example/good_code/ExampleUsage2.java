package payment_example.good_code;

public class ExampleUsage2 {
    public static void main(String[] args) {
        boolean isEU = true;

        // Switch Provider Dynamically
        PaymentProvider provider = isEU ? new PayPalProvider() : new StripeProvider();

        Payment payment = new OneTimePayment(provider);
    }
}
