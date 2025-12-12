package creational.abstractfactory.ui.elements.button;

import creational.abstractfactory.ui.elements.IButton;

public class DarkButton implements IButton {
    @Override
    public void click() {
        System.out.println("DARK button clicked");
    }

    @Override
    public void render() {
        System.out.println("DARK button rendered");
    }
}
