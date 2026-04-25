package good_code;

import java.math.BigDecimal;

public class ExampleUsage3 {

    public static void main(String[] args) {

        BigDecimal cartTotal = BigDecimal.valueOf(1000);

        Discount discount;

        if (cartTotal.compareTo(BigDecimal.valueOf(500)) > 0) {
            discount = new PercentageDiscount(BigDecimal.valueOf(10));
        } else {
            discount = new NoDiscount();
        }

        PriceCalculator calculator = new PriceCalculator(discount);

        System.out.println("Final: " + calculator.calculate(cartTotal));
    }
}
