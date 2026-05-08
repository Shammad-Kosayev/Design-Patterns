package good_code;

// YOUR interface — every payment way in your app speaks this language.
public interface PaymentProcessor {
    boolean pay(double dollars, String customerId);
}
