package secondTask.windows;

import secondTask.entities.IButton;

public class WindowsButton implements IButton {

    @Override
    public void paint() {
        System.out.println("Имя компонента: button\nСемейство: Windows\n");
    }
}
