package creational.abstractfactory.ui.elements.button;

import creational.abstractfactory.ui.elements.IButton;

public class LightButton implements IButton {
    @Override
    public void click() {
        System.out.println("LIGHT button clicked");
    }

    @Override
    public void render() {
        System.out.println("LIGHT button rendered");
    }
}
