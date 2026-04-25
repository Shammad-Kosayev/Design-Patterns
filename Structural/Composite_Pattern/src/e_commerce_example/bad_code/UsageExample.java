package e_commerce_example.bad_code;

public class UsageExample {

    public static void main(String[] args) {
        Bundle systemBlock = new Bundle();
        systemBlock.addProduct(new Product("Case", 200));
        systemBlock.addProduct(new Product("MotherBoard", 400));
        systemBlock.addProduct(new Product("CPU", 320));
        systemBlock.addProduct(new Product("GPU", 600));
        systemBlock.addProduct(new Product("Cooler", 120));
        systemBlock.addProduct(new Product("Power Supply Unit", 700));

        Bundle fullDesktopPc = new Bundle();
        fullDesktopPc.addBundle(systemBlock);
        fullDesktopPc.addProduct(new Product("Monitor", 300));
        fullDesktopPc.addProduct(new Product("Keyboard", 80));

        System.out.println(fullDesktopPc.getPrice());
    }

    // specific methods has to be used
}
