package good_code;

import java.util.List;

public class ExampleUsage2 {
    public static void main(String[] args) {

        // Imagine these come from a request: ["MILK", "CARAMEL", "SUGAR"]
        List<String> selectedAddOns = List.of("MILK", "CARAMEL", "SUGAR");

        Beverage drink = new Latte();

        // Apply add-ons dynamically — pure decorator power 🔥
        for (String addOn : selectedAddOns) {
            drink = switch (addOn) {
                case "MILK"          -> new MilkDecorator(drink);
                case "SUGAR"         -> new SugarDecorator(drink);
                case "CARAMEL"       -> new CaramelDecorator(drink);
                case "WHIPPED_CREAM" -> new WhippedCreamDecorator(drink);
                default -> throw new IllegalArgumentException("Unknown add-on: " + addOn);
            };
        }

        System.out.println(drink.describe() + " = $" + drink.cost());
    }
}
