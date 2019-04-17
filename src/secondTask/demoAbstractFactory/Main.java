package secondTask.demoAbstractFactory;

import secondTask.entities.IButton;
import secondTask.entities.ICheckbox;
import secondTask.factories.AbstractFactory;
import secondTask.factories.MacOS_Factory;
import secondTask.factories.WindowsFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Даны 2 интерфейса. Реализовать паттерн Абстрактная фабрика для получения конкретных
         * имплементаций этих интерфейсов для семейcтв MacOs, Windows (в самих методах paint просто
         * сделать System.out.println("Имя компонента (button) Семейство (MacOS)")). */

        Scanner scanner = new Scanner(System.in);
        AbstractFactory abstractFactory;

        System.out.println("Enter the type of objects (m - MacOS, w - Windows):");
        String choice = scanner.nextLine();

        switch (choice) {
            case "m":
                abstractFactory = new MacOS_Factory();
                break;
            case "w":
                abstractFactory = new WindowsFactory();
                break;
            default:
                abstractFactory = null;
        }

        if (abstractFactory != null) {
            getInfoAboutFactory(abstractFactory);
        } else {
            System.out.println("Factory is not exists!");
        }

    }

    private static void getInfoAboutFactory(AbstractFactory factory) {

        IButton button = factory.createButton();
        ICheckbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}