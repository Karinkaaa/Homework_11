package secondTask.factories;

import secondTask.entities.IButton;
import secondTask.entities.ICheckbox;
import secondTask.windows.WindowsButton;
import secondTask.windows.WindowsCheckbox;

public class WindowsFactory extends AbstractFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
