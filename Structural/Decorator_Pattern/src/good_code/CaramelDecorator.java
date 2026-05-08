package good_code;

public class CaramelDecorator extends BeverageDecorator {

    public CaramelDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public double cost() {
        return wrapped.cost() + 0.7;
    }

    @Override
    public String describe() {
        return wrapped.describe() + " + caramel";
    }
}
