package by.epam.javatask2.txtreader;

import by.epam.javatask2.exception.FileException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;
import java.util.ArrayList;

public class TxtFileReader {
    private static final Logger logger = Logger.getLogger(TxtFileReader.class);

    public ArrayList<String> readFromFile(String path) {
        String log4jConfigFile = String.format("%s\\resources\\log4j.properties", System.getProperty("user.dir"));
        PropertyConfigurator.configure(log4jConfigFile);
        ArrayList<String> arrayList = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            logger.info("Файл " + path + " был найден и открыт");
            String line;
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            logger.error("Файл " + path + " не был найден");
            throw new FileException("Файл не найден",e);
        } catch (IOException e) {
            logger.error("Файл " + path + " не был открыт");
            throw new FileException("Невозможно открыть файл",e);
        }
        logger.info("Чтение из файла " + path + " было выполнено успешно");
        return arrayList;
    }
}
