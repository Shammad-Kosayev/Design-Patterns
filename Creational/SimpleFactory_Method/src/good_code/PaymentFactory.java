package simple_factory.good_code;

public class PaymentFactory {

    public static Payment create(String type) {

        if (type.equals("CARD")) {
            return new CardPayment();
        } else if (type.equals("PAYPAL")) {
            return new PaypalPayment();
        }

        throw new RuntimeException("Unknown type");
    }
}
