package payment_example.bad_code;

public class PaymentService {

    private final OneTimePaypalPayment oneTimePaypalPayment;
    private final OneTimeStripePayment oneTimeStripePayment;
    private final SubscriptionPaypalPayment subscriptionPaypalPayment;
    private final SubscriptionStripePayment subscriptionStripePayment;

    public PaymentService(
            OneTimePaypalPayment oneTimePaypalPayment,
            OneTimeStripePayment oneTimeStripePayment,
            SubscriptionPaypalPayment subscriptionPaypalPayment,
            SubscriptionStripePayment subscriptionStripePayment
    ) {
        this.oneTimePaypalPayment = oneTimePaypalPayment;
        this.oneTimeStripePayment = oneTimeStripePayment;
        this.subscriptionPaypalPayment = subscriptionPaypalPayment;
        this.subscriptionStripePayment = subscriptionStripePayment;
    }

    public void pay(String type, String provider, double amount) {

        if (type.equals("ONE_TIME") && provider.equals("STRIPE")) {
            oneTimeStripePayment.pay(amount);

        } else if (type.equals("ONE_TIME") && provider.equals("PAYPAL")) {
            oneTimePaypalPayment.pay(amount);

        } else if (type.equals("SUBSCRIPTION") && provider.equals("STRIPE")) {
            subscriptionStripePayment.pay(amount);

        } else if (type.equals("SUBSCRIPTION") && provider.equals("PAYPAL")) {
            subscriptionPaypalPayment.pay(amount);
        }
    }
}
/*
❌ giant if-else
❌ impossible to scale
❌ violates Open/Closed
❌ unreadable quickly
*/

