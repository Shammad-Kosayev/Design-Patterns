package ui_example.concrete_creators;

import ui_example.AbstractUIFactory;
import ui_example.concrete_products.mac.MacButton;
import ui_example.concrete_products.mac.MacCheckBox;
import ui_example.products.Button;
import ui_example.products.CheckBox;

public class MacUICreator extends AbstractUIFactory {
    @Override
    protected Button getUIButton() {
        return new MacButton();
    }

    @Override
    protected CheckBox getUICheckBox() {
        return new MacCheckBox();
    }
}
