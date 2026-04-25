package good_code;

import java.math.BigDecimal;

public class UsageExample2 {
    public static void main(String[] args) {
        String couponCode = "SUMMER20"; // from request

        Discount discount = switch (couponCode) {
            case "SUMMER20" -> new PercentageDiscount(BigDecimal.valueOf(20));
            case "FLAT10" -> new FixedDiscount(BigDecimal.valueOf(10));
            default -> new NoDiscount();
        };

        PriceCalculator calculator = new PriceCalculator(discount);

        BigDecimal finalPrice = calculator.calculate(BigDecimal.valueOf(250));

        System.out.println("Final price: " + finalPrice);
    }
}
