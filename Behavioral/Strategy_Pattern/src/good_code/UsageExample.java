package good_code;

import java.math.BigDecimal;

public class UsageExample {
    public static void main(String[] args) {

        String userType = "VIP"; // imagine this comes from DB

        Discount discount;

        // selecting strategy
        if (userType.equals("VIP")) {
            discount = new PercentageDiscount(BigDecimal.valueOf(20));
        } else if (userType.equals("REGULAR")) {
            discount = new FixedDiscount(BigDecimal.valueOf(10));
        } else {
            discount = new NoDiscount();
        }

        PriceCalculator calculator = new PriceCalculator(discount);

        BigDecimal finalPrice = calculator.calculate(BigDecimal.valueOf(100));

        System.out.println("Final price: " + finalPrice);
    }
}
