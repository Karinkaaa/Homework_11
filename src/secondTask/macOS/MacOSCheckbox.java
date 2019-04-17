package secondTask.macOS;

import secondTask.entities.ICheckbox;

public class MacOSCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("Имя компонента: checkbox\nСемейство: MacOS\n");
    }
}
