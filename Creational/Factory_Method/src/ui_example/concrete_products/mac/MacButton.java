package ui_example.concrete_products.mac;

import ui_example.products.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button clicked!");
    }
}
