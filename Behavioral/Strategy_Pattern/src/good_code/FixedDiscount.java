package good_code;

import java.math.BigDecimal;

public class FixedDiscount implements Discount {

    private final BigDecimal amount;

    public FixedDiscount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.subtract(amount)
                .max(BigDecimal.ZERO); //protects against negative value
    }
}
