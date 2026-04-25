package payment_example.good_code;

public class PayPalProvider implements PaymentProvider {

    public void processPayment(double amount) {
        // paypal api call
        // log
        System.out.println("Payment of $" + amount + " is paid via PayPal");
    }
}
