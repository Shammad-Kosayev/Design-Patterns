package bad_code;

// Third-party response shape.
public class StripeChargeResponse {

    private final String chargeId;
    private final boolean succeeded;

    public StripeChargeResponse(String chargeId, boolean succeeded) {
        this.chargeId = chargeId;
        this.succeeded = succeeded;
    }

    public String getChargeId() { return chargeId; }
    public boolean isSucceeded() { return succeeded; }
}
