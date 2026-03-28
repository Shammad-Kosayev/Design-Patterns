package ui_example.concrete_products.windows;

import ui_example.products.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button clicked!");
    }
}
