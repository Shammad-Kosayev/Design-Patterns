package bad_code;

// One class with boolean flags for every possible add-on.
// Looks innocent now. Becomes a swamp the moment a 5th add-on appears.
public class Coffee {

    private final boolean addMilk;
    private final boolean addSugar;
    private final boolean addCaramel;
    private final boolean addWhippedCream;

    public Coffee(boolean addMilk, boolean addSugar, boolean addCaramel, boolean addWhippedCream) {
        this.addMilk = addMilk;
        this.addSugar = addSugar;
        this.addCaramel = addCaramel;
        this.addWhippedCream = addWhippedCream;
    }

    public double cost() {
        double cost = 3.0; // base espresso
        if (addMilk)         cost += 0.5;
        if (addSugar)        cost += 0.2;
        if (addCaramel)      cost += 0.7;
        if (addWhippedCream) cost += 0.9;
        return cost;
    }

    public String describe() {
        String s = "Espresso";
        if (addMilk)         s += " + milk";
        if (addSugar)        s += " + sugar";
        if (addCaramel)      s += " + caramel";
        if (addWhippedCream) s += " + whipped cream";
        return s;
    }
}
/*
❌ telescoping constructor
❌ adding "soy milk" = new field + new branch in TWO methods
❌ no way to apply "double sugar"
❌ no way to support a different base drink without copy-paste
*/
