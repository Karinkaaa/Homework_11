package demoApp;

import myExceptions.FileIsEmptyException;
import myExceptions.FileIsNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers(String fileLocation) {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }

    public void showList() {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public void writeContentToFile(String fileLocation) throws IOException {

        File file = new File(fileLocation);
        if (!file.exists()) {
            file.createNewFile();
        }

        Writer fileWriter = new FileWriter(file, true);
        for (Integer integer : list) {
            fileWriter.write(integer + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public List<Integer> readContentFromFile(String fileLocation) throws IOException {

        File file = new File(fileLocation);
        if (!file.exists()) throw new FileIsNotFoundException("Файла не существует!");
        else if (file.length() == 0) throw new FileIsEmptyException("Файл пустой!");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        br.close();
        return list;
    }
}
