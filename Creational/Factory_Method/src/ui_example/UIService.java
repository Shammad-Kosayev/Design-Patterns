package ui_example;

import ui_example.concrete_creators.MacUICreator;
import ui_example.concrete_creators.WindowsUICreator;

public class UIService {

    public void display() {
        System.out.println("Displaying UI Service");

        AbstractUIFactory macUi = new MacUICreator();
        macUi.ClickOnCheckBox();
        macUi.ClickOnButton();

        AbstractUIFactory windowsUi = new WindowsUICreator();
        windowsUi.ClickOnCheckBox();
        windowsUi.ClickOnButton();

    }

}
