package good_code;

// Another concrete beverage. Drinks vary independently of add-ons. 🎯
public class Latte implements Beverage {

    @Override
    public double cost() {
        return 4.5;
    }

    @Override
    public String describe() {
        return "Latte";
    }
}
