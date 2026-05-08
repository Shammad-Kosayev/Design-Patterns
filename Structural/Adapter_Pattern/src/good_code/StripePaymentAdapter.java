package good_code;

// 👉 THE ADAPTER:
//      - speaks YOUR language outward (implements PaymentProcessor)
//      - speaks STRIPE's language inward (calls StripeClient.charge)
//
// All the translation that used to live inside CheckoutService
// now lives HERE, where it belongs.
public class StripePaymentAdapter implements PaymentProcessor {

    private final StripeClient stripeClient;

    public StripePaymentAdapter(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
    }

    @Override
    public boolean pay(double dollars, String customerId) {

        // 1. unit conversion (dollars → cents)
        long cents = (long) (dollars * 100);

        // 2. shape conversion (your params → Stripe's request object)
        StripeChargeRequest request = new StripeChargeRequest(cents, "USD", customerId);

        // 3. call the foreign API
        StripeChargeResponse response = stripeClient.charge(request);

        // 4. shape conversion back (Stripe's response → your boolean)
        return response.isSucceeded();

        // A real adapter would also:
        //   - catch StripeException and re-throw your own PaymentFailedException
        //   - retry on transient network errors
        //   - log the chargeId for reconciliation
        //   - support multiple currencies (not hard-coded "USD")
        // skipped here to keep the lesson focused on the pattern itself.
    }
}
