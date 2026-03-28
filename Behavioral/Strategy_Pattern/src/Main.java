import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Discount discount = new PercentageDiscount(BigDecimal.TEN);
        PriceCalculator calculator = new PriceCalculator(discount);
        BigDecimal calculated = calculator.calculate(BigDecimal.valueOf(100));
        System.out.println(calculated);
    }
}