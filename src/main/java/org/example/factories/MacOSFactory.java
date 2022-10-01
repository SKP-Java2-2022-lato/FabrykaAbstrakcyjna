package org.example.factories;

import org.example.products.buttons.Button;
import org.example.products.buttons.MacOSbutton;
import org.example.products.checkboxes.Checkbox;
import org.example.products.checkboxes.MacOSCheckbox;


public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSbutton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
