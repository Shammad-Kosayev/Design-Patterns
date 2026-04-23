package simple_factory.good_code;

public class PaymentService {

    public void makePayment(String type) {
        Payment payment = PaymentFactory.create(type);
        payment.pay();
    }
}
