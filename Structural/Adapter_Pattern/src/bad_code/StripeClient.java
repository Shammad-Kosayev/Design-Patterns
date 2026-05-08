package bad_code;

// Pretend this class lives inside Stripe's official SDK JAR.
// We CANNOT modify it — it is third-party code.
public class StripeClient {

    public StripeChargeResponse charge(StripeChargeRequest request) {
        // pretend a real HTTPS call to Stripe happens here
        System.out.println("[Stripe SDK] charging "
                + request.getAmountInCents()
                + " cents for customer "
                + request.getCustomerId());

        return new StripeChargeResponse("ch_" + System.currentTimeMillis(), true);
    }
}
