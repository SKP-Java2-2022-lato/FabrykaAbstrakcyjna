package org.example;

import org.example.app.Application;
import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WinFactory;

public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory guiFactory;

        //nazwa systemu operacyjnego
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
            app = new Application(guiFactory);
        }
        else{
            guiFactory = new WinFactory();
            app = new Application(guiFactory);
        }

        app.paint();
    }
}