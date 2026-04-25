    package payment_example.bad_code;

    public class SubscriptionStripePayment {

        public void pay(double amount) {
            // paypal api call
            // log
            System.out.println("Subscription payment via Stripe: " + amount);
        }
    }