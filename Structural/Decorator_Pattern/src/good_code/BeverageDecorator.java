package good_code;

// 👉 The abstract decorator:
//      - IS-A Beverage  (so it fits anywhere a Beverage fits)
//      - HAS-A Beverage (the one being wrapped)
public abstract class BeverageDecorator implements Beverage {

    protected final Beverage wrapped;

    protected BeverageDecorator(Beverage wrapped) {
        this.wrapped = wrapped;
    }
}
