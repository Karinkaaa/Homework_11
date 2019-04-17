package secondTask.windows;

import secondTask.entities.ICheckbox;

public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("Имя компонента: checkbox\nСемейство: Windows\n");
    }
}
