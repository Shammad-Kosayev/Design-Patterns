package payment_example.good_code;

public abstract class Payment {

    protected PaymentProvider provider;

    public Payment(PaymentProvider provider) {
        this.provider = provider;
    }

    public abstract void pay(double amount);
}
