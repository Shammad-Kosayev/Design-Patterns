package bad_code;

// Your in-house payment processor. Simple and clean shape.
public class LocalPaymentProcessor {

    public boolean pay(double dollars, String customerId) {
        System.out.println("Local payment of $" + dollars + " for " + customerId);
        return true;
    }
}
