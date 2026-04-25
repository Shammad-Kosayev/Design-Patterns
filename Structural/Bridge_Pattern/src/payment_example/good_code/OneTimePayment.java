package payment_example.good_code;

public class OneTimePayment extends Payment {

    public OneTimePayment(PaymentProvider provider) {
        super(provider);
    }

    public void pay(double amount) {
        provider.processPayment(amount);

        // email invoice logic
    }
}
