package good_code;

public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public double cost() {
        return wrapped.cost() + 0.2;
    }

    @Override
    public String describe() {
        return wrapped.describe() + " + sugar";
    }
}
