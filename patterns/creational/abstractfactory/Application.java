package creational.abstractfactory;

import creational.abstractfactory.ui.IGuiFactory;
import creational.abstractfactory.ui.IUiElement;
import creational.abstractfactory.ui.elements.IButton;
import creational.abstractfactory.ui.elements.ICheckBox;

public class Application implements IUiElement {
    private final IButton button;
    private final ICheckBox checkBox;

    public Application(IGuiFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    @Override
    public void render() {
        button.render();
        checkBox.render();
    }
}
