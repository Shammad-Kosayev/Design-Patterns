public class PayPalAdapter implements PaymentProcessor{
    private final PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public boolean pay(int amount) {
        payPalAPI.makePayment((double) amount);

        return true;
    }
}
