package creational.abstractfactory.ui.elements.checkbox;

import creational.abstractfactory.ui.elements.ICheckBox;

public class LightCheckBox implements ICheckBox {
    @Override
    public void toggle() {
        System.out.println("LIGHT checkbox toggled");
    }

    @Override
    public void render() {
        System.out.println("LIGHT checkbox rendered");
    }
}
