package by.epam.javatask2.txtreader;

import by.epam.javatask2.exception.FileException;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TxtFileReader {

    public  ArrayList<String> readFromFile(String path) {
        ArrayList<String> arrayList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileException("Файл не найден",e);
        } catch (IOException e) {
            throw new FileException("Невозможно открыть файл",e);
        }
        return arrayList;
    }
}
