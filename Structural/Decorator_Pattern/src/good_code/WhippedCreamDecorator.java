package good_code;

public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public double cost() {
        return wrapped.cost() + 0.9;
    }

    @Override
    public String describe() {
        return wrapped.describe() + " + whipped cream";
    }
}
