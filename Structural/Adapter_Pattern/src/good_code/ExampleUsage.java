package good_code;

public class ExampleUsage {
    public static void main(String[] args) {

        // Local — already implements YOUR interface natively
        CheckoutService localCheckout = new CheckoutService(new LocalPaymentProcessor());
        localCheckout.checkout(50.0, "cust_1");

        // Stripe — wrap the foreign SDK in your adapter
        CheckoutService stripeCheckout = new CheckoutService(
                new StripePaymentAdapter(new StripeClient())
        );
        stripeCheckout.checkout(99.99, "cust_2");

        // 🎯 CheckoutService doesn't know (or care) which one is the third-party.
    }
}
