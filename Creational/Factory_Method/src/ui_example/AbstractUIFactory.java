package ui_example;

import ui_example.products.Button;
import ui_example.products.CheckBox;

// Doesn't have to be abstract class. It can also be a interface.
public abstract class AbstractUIFactory {

    public void ClickOnButton() {
        Button uiButton = getUIButton();
        uiButton.click();
    }

    public void ClickOnCheckBox() {
        CheckBox uiCheckBox = getUICheckBox();
        uiCheckBox.toggle();
    }

    protected abstract Button getUIButton();
    protected abstract CheckBox getUICheckBox();
}
