package payment_example;

public class MainClass {
    public static void main(String[] args) {
        Payment oneTimePayment = new OneTimePayment(new StripeProvider());

        oneTimePayment.pay(10);
    }
}
