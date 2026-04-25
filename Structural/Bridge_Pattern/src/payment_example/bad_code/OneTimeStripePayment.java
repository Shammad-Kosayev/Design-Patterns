package payment_example.bad_code;

public class OneTimeStripePayment {

    public void pay(double amount) {
        // stripe api call
        // log
        System.out.println("One-time payment via Stripe: " + amount);
    }
}