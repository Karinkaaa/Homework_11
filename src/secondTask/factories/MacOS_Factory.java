package secondTask.factories;

import secondTask.entities.IButton;
import secondTask.entities.ICheckbox;
import secondTask.macOS.MacOSButton;
import secondTask.macOS.MacOSCheckbox;

public class MacOS_Factory extends AbstractFactory {

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
