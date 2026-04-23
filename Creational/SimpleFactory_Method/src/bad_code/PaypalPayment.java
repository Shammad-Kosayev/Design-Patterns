package simple_factory.bad_code;

public class PaypalPayment implements Payment {
    public void pay() {
        System.out.println("PayPal payment");
    }
}
