package secondTask.macOS;

import secondTask.entities.IButton;

public class MacOSButton implements IButton {

    @Override
    public void paint() {
        System.out.println("Имя компонента: button\nСемейство: MacOS\n");
    }
}
