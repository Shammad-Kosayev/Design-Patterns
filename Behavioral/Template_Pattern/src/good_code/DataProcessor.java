package good_code;

//Template
public abstract class DataProcessor {

    // 🔥 TEMPLATE METHOD (final is important)
    public final void process() {
        readFile();
        parse();
        validate();
        save();
    }

    protected void readFile() {
        System.out.println("Reading file...");
    }

    protected abstract void parse();

    protected void validate() {
        System.out.println("Validating...");
    }

    protected void save() {
        System.out.println("Saving to DB...");
    }

}
