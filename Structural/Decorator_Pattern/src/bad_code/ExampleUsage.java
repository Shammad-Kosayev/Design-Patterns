package bad_code;

public class ExampleUsage {
    public static void main(String[] args) {

        // espresso + milk + caramel
        Coffee order = new Coffee(true, false, true, false);

        System.out.println(order.describe() + " = $" + order.cost());

        // 💀 try ordering "double sugar" — you can't.
        // 💀 try ordering a Latte instead — you'd need a whole new class.
    }
}
