package bad_code;

import java.math.BigDecimal;

public class UsageExample {
    public static void main(String[] args) {

        PriceCalculator calculator = new PriceCalculator();

        BigDecimal result = calculator.calculate(
                BigDecimal.valueOf(100),
                "PERCENTAGE",
                BigDecimal.valueOf(20)
        );

        System.out.println("Final price: " + result);
    }
}
