package good_code;

// We wrote this from scratch, so it directly implements YOUR interface.
// No adapter needed for code you already own ✅
public class LocalPaymentProcessor implements PaymentProcessor {

    @Override
    public boolean pay(double dollars, String customerId) {
        System.out.println("Local payment of $" + dollars + " for " + customerId);
        return true;
    }
}
