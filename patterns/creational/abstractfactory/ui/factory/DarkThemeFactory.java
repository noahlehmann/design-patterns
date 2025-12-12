package creational.abstractfactory.ui.factory;

import creational.abstractfactory.ui.IGuiFactory;
import creational.abstractfactory.ui.elements.IButton;
import creational.abstractfactory.ui.elements.ICheckBox;
import creational.abstractfactory.ui.elements.button.DarkButton;
import creational.abstractfactory.ui.elements.checkbox.DarkCheckBox;

public class DarkThemeFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new DarkButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
