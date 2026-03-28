import e_commerce_example.Bundle;
import e_commerce_example.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Product laptop = new Product("Laptop", 1000);
        Product mouse = new Product("Mouse", 50);

        Bundle bundle = new Bundle();
        bundle.add(laptop);
        bundle.add(mouse);

        Bundle megaBundle = new Bundle();
        megaBundle.add(bundle);
        megaBundle.add(new Product("Keyboard", 100));

        System.out.println();
    }
}