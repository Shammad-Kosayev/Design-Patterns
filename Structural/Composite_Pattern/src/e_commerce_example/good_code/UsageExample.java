package e_commerce_example.good_code;

public class UsageExample {

    public static void main(String[] args) {
        Bundle systemBlock = new Bundle();
        systemBlock.add(new Product("Case", 200));
        systemBlock.add(new Product("MotherBoard", 400));
        systemBlock.add(new Product("CPU", 320));
        systemBlock.add(new Product("GPU", 600));
        systemBlock.add(new Product("Cooler", 120));
        systemBlock.add(new Product("Power Supply Unit", 700));

        Bundle fullDesktopPc = new Bundle();
        fullDesktopPc.add(systemBlock);
        fullDesktopPc.add(new Product("Monitor", 300));
        fullDesktopPc.add(new Product("Keyboard", 80));

        System.out.println(fullDesktopPc.getPrice());
    }
}
