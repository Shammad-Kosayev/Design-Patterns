package good_code;

// Same third-party SDK class — UNCHANGED.
// The whole point of Adapter: we don't (and can't) modify foreign code.
public class StripeClient {

    public StripeChargeResponse charge(StripeChargeRequest request) {
        System.out.println("[Stripe SDK] charging "
                + request.getAmountInCents()
                + " cents for customer "
                + request.getCustomerId());

        return new StripeChargeResponse("ch_" + System.currentTimeMillis(), true);
    }
}
