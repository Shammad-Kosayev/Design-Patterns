package bad_code;

import java.math.BigDecimal;

public class PriceCalculator {

    public BigDecimal calculate(BigDecimal price, String discountType, BigDecimal value) {

        if (discountType.equals("PERCENTAGE")) {

            BigDecimal discountAmount = price
                    .multiply(value)
                    .divide(BigDecimal.valueOf(100), BigDecimal.ROUND_HALF_UP);

            BigDecimal result = price.subtract(discountAmount);

            if (result.compareTo(BigDecimal.ZERO) < 0) {
                return BigDecimal.ZERO;
            }

            return result;

        } else if (discountType.equals("FIXED")) {

            BigDecimal result = price.subtract(value);

            if (result.compareTo(BigDecimal.ZERO) < 0) {
                return BigDecimal.ZERO;
            }

            return result;

        } else if (discountType.equals("NONE")) {

            return price;
        }

        throw new IllegalArgumentException("Unknown discount type");
    }
}