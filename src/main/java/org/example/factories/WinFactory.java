package org.example.factories;

import org.example.products.buttons.Button;
import org.example.products.buttons.WinButton;
import org.example.products.checkboxes.Checkbox;
import org.example.products.checkboxes.WinCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
