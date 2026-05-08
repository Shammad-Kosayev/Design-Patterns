package good_code;

// A concrete beverage. No add-ons known to it.
public class Espresso implements Beverage {

    @Override
    public double cost() {
        return 3.0;
    }

    @Override
    public String describe() {
        return "Espresso";
    }
}
