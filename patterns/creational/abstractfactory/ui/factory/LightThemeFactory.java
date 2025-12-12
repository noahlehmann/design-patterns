package creational.abstractfactory.ui.factory;

import creational.abstractfactory.ui.IGuiFactory;
import creational.abstractfactory.ui.elements.IButton;
import creational.abstractfactory.ui.elements.ICheckBox;
import creational.abstractfactory.ui.elements.button.LightButton;
import creational.abstractfactory.ui.elements.checkbox.LightCheckBox;

public class LightThemeFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
