package payment_example.good_code;

public class ExampleUsage {
    public static void main(String[] args) {
        Payment oneTimePayment = new OneTimePayment(new StripeProvider());
        oneTimePayment.pay(10);

        Payment subscriptionPayment = new SubscriptionPayment(new PayPalProvider());
        subscriptionPayment.pay(200);
    }
}
