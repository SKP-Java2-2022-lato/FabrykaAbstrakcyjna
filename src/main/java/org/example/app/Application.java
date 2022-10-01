package org.example.app;

import org.example.factories.GUIFactory;
import org.example.products.buttons.Button;
import org.example.products.checkboxes.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
