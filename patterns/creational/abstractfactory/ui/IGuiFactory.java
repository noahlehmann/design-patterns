package creational.abstractfactory.ui;

import creational.abstractfactory.ui.elements.IButton;
import creational.abstractfactory.ui.elements.ICheckBox;

public interface IGuiFactory {
    IButton createButton();
    ICheckBox createCheckBox();
}
