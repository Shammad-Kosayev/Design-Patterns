package good_code;

// Third-party request shape — unchanged.
public class StripeChargeRequest {

    private final long amountInCents;
    private final String currency;
    private final String customerId;

    public StripeChargeRequest(long amountInCents, String currency, String customerId) {
        this.amountInCents = amountInCents;
        this.currency = currency;
        this.customerId = customerId;
    }

    public long getAmountInCents() { return amountInCents; }
    public String getCurrency()    { return currency; }
    public String getCustomerId()  { return customerId; }
}
