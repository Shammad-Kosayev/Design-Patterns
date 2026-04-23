package simple_factory.bad_code;

public class PaymentService {

    public void pay(String type) {

        Payment payment;

        if (type.equals("CARD")) {
            payment = new CardPayment();
        } else if (type.equals("PAYPAL")) {
            payment = new PaypalPayment();
        } else {
            throw new RuntimeException("Unknown type");
        }

        payment.pay();
    }
}
