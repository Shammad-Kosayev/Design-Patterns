package payment_example.good_code;

public class SubscriptionPayment extends Payment {

    public SubscriptionPayment(PaymentProvider provider) {
        super(provider);
    }

    public void pay(double amount) {
        provider.processPayment(amount);

        // save to db logic

        // email invoice
    }
}
