import java.math.BigDecimal;

public class PercentageDiscount implements Discount{

    private final BigDecimal percentage; // e.g. 10 for 10%

    public PercentageDiscount(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.subtract(
                                price.multiply(percentage)
                                .divide(BigDecimal.valueOf(100), BigDecimal.ROUND_HALF_UP))
                .max(BigDecimal.ZERO); //protects against negative value
    }
}
