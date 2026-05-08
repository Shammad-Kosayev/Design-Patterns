package bad_code;

public class CheckoutService {

    private final LocalPaymentProcessor localProcessor;
    private final StripeClient stripeClient;

    public CheckoutService(LocalPaymentProcessor localProcessor, StripeClient stripeClient) {
        this.localProcessor = localProcessor;
        this.stripeClient = stripeClient;
    }

    public boolean checkout(String provider, double dollars, String customerId) {

        if (provider.equals("LOCAL")) {
            return localProcessor.pay(dollars, customerId);

        } else if (provider.equals("STRIPE")) {
            // ❌ translation logic is leaking INTO the service
            long cents = (long) (dollars * 100);
            StripeChargeRequest request = new StripeChargeRequest(cents, "USD", customerId);
            StripeChargeResponse response = stripeClient.charge(request);
            return response.isSucceeded();
        }

        throw new IllegalArgumentException("Unknown provider: " + provider);
    }
}
/*
❌ service speaks two different "languages"
❌ if-else grows with every new provider
❌ violates Open/Closed
❌ tightly coupled to Stripe's SDK shape
*/
