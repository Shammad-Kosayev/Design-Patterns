package payment_example;

public class OneTimePayment extends Payment {

    public OneTimePayment(PaymentProvider provider) {
        super(provider);
    }

    public void pay(double amount) {
        provider.processPayment(amount);
    }
}
