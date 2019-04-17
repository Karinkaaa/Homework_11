package demoApp;

import java.io.IOException;

public class ListOfNumbersDemo {
    public static void main(String[] args) throws IOException {

        /* Создать класс demoApp.ListOfNumbers. В нём создать методы:
         * - writeContentToFile(String fileLocation),
         * который должен записать в файл содержимое списка (каждое значение на новой строке) в файл
         * fileLocation (если файла fileLocation не существует - создать его);
         * - readContentFromFile(String fileLocation), в котором считать из файла данные в список list
         * из файла fileLocation (считать, что в файле fileLocation каждое значение расположено на новой
         * строке). Если файла fileLocation не существует - реализовать собственное исключение и бросить
         * его, если файл пустой - реализовать собственное исключение и бросить его.
         * Создать класс demoApp.ListOfNumbersDemo, где показать пример использования методов demoApp.ListOfNumbers с
         * обработкой всех возможных исключений. */

        String path = "E:\\testDir\\list_of_numbers.txt";
        ListOfNumbers list = new ListOfNumbers(path);

        try {
            list.writeContentToFile(path);
            System.out.println("Запись в файл прошла успешно!");
        } catch (IOException e) {
            System.out.println("Указанного пути не существует!");
        }

        System.out.println("\nLIST:");
        list.showList();
        list.readContentFromFile(path);

        System.out.println("\n\nLIST после считывания массива из файла:");
        list.showList();

    }
}
