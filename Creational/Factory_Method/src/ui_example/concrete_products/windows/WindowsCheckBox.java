package ui_example.concrete_products.windows;

import ui_example.products.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void toggle() {
        System.out.println("Windows CheckBox toggled!");
    }
}
