package firstTask.demoApp;

import java.io.IOException;

public class ListOfNumbersDemo {
    public static void main(String[] args) throws IOException {

        /* Доработать пример из ДЗ 10 на использование буфферизируемых потоков ввода-вывода. */

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
