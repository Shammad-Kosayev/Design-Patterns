package good_code;

public class CheckoutService {

    private final PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean checkout(double dollars, String customerId) {
        return paymentProcessor.pay(dollars, customerId);
    }
}
// ✅ no if-else, no Stripe types, no cents conversion
// ✅ doesn't even know "Stripe" exists
// ✅ adding PayPal later = new adapter, ZERO changes here
