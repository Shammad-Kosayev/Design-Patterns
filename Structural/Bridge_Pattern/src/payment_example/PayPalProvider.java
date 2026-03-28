package payment_example;

public class PayPalProvider implements PaymentProvider {

    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT: " + amount);
    }
}
