package payment_example;

public class SubscriptionPayment extends Payment {

    public SubscriptionPayment(PaymentProvider provider) {
        super(provider);
    }

    public void pay(double amount) {
        provider.processPayment(amount);
    }
}
