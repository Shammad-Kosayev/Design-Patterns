package simple_factory.bad_code;

public class CardPayment implements Payment {
    public void pay() {
        System.out.println("Card payment");
    }
}
