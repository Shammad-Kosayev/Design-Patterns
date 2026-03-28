package ui_example.concrete_products.mac;

import ui_example.products.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void toggle() {
        System.out.println("MAC checkbox toggled!");
    }
}
