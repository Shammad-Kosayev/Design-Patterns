public class Service {
    private final PaymentProcessor paymentProcessor;

    public Service(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean payForItem(int amount) {
        paymentProcessor.pay(amount);

        return true;
    }
}
