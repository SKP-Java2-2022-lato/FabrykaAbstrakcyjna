package org.example.factories;

import org.example.products.buttons.Button;
import org.example.products.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
