package creational.abstractfactory.ui.elements.checkbox;

import creational.abstractfactory.ui.elements.ICheckBox;

public class DarkCheckBox implements ICheckBox {
    @Override
    public void toggle() {
        System.out.println("DARK checkbox toggled");
    }

    @Override
    public void render() {
        System.out.println("DARK checkbox rendered");
    }
}
