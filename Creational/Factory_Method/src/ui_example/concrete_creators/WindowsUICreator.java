package ui_example.concrete_creators;

import ui_example.AbstractUIFactory;
import ui_example.concrete_products.windows.WindowsButton;
import ui_example.concrete_products.windows.WindowsCheckBox;
import ui_example.products.Button;
import ui_example.products.CheckBox;

public class WindowsUICreator extends AbstractUIFactory {
    @Override
    protected Button getUIButton() {
        return new WindowsButton();
    }

    @Override
    protected CheckBox getUICheckBox() {
        return new WindowsCheckBox();
    }
}
