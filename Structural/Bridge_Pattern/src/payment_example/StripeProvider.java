package payment_example;

public class StripeProvider implements PaymentProvider {

    public void processPayment(double amount) {
        System.out.println("STRIPE PAYMENT: " + amount);
    }
}
