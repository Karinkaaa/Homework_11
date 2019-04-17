package secondTask.factories;

import secondTask.entities.IButton;
import secondTask.entities.ICheckbox;

public abstract class AbstractFactory {

    public abstract IButton createButton();
    public abstract ICheckbox createCheckbox();
}
