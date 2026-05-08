package good_code;

public class ExampleUsage {
    public static void main(String[] args) {

        // Espresso + milk + caramel
        Beverage order1 = new CaramelDecorator(new MilkDecorator(new Espresso()));
        System.out.println(order1.describe() + " = $" + order1.cost());

        // Latte + caramel + whipped cream — different base, same add-ons reused ✅
        Beverage order2 = new WhippedCreamDecorator(new CaramelDecorator(new Latte()));
        System.out.println(order2.describe() + " = $" + order2.cost());

        // 🎯 Real customers DO order double sugar — and now we CAN model it.
        Beverage order3 = new SugarDecorator(new SugarDecorator(new Espresso()));
        System.out.println(order3.describe() + " = $" + order3.cost());
    }
}
