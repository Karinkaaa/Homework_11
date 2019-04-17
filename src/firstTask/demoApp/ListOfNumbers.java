package firstTask.demoApp;

import firstTask.myExceptions.FileIsEmptyException;
import firstTask.myExceptions.FileIsNotFoundException;

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

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        for (Integer integer : list) {
            bw.write(integer + "\n");
        }
        bw.flush();
        bw.close();
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
