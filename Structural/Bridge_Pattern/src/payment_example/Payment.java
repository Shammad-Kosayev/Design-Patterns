package payment_example;

public abstract class Payment {

    protected PaymentProvider provider;

    public Payment(PaymentProvider provider) {
        this.provider = provider;
    }

    public abstract void pay(double amount);
}
