package creational.abstractfactory;

import creational.abstractfactory.ui.IGuiFactory;
import creational.abstractfactory.ui.factory.DarkThemeFactory;
import creational.abstractfactory.ui.factory.LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        IGuiFactory factory;
        factory = new LightThemeFactory();

        var app = new Application(factory);
        app.render();

        factory = new DarkThemeFactory();
        app = new Application(factory);

        app.render();
    }
}
