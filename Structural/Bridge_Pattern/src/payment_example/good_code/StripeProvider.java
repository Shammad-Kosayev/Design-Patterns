package payment_example.good_code;

public class StripeProvider implements PaymentProvider {

    public void processPayment(double amount) {
        // stripe api call
        // log
        System.out.println("Payment of $" + amount + " is paid via Stripe");
    }
}
