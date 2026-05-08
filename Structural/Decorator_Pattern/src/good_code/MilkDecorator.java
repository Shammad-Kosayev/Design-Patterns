package good_code;

public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public double cost() {
        return wrapped.cost() + 0.5;
    }

    @Override
    public String describe() {
        return wrapped.describe() + " + milk";
    }
}
