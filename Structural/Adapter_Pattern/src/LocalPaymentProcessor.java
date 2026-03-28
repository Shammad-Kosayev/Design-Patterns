//concrete class example
public class LocalPaymentProcessor implements PaymentProcessor {

    @Override
    public boolean pay(int amount) {
        System.out.println("Local Payment is about " + amount + ".");
        return true;
    }
}
