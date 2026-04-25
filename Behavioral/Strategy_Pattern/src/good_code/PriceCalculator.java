package good_code;

import java.math.BigDecimal;

public class PriceCalculator {

    private Discount discountStrategy;

    public PriceCalculator(Discount discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal calculate(BigDecimal price) {
        return discountStrategy.applyDiscount(price);
    }
}
