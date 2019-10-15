package by.epam.javatask2.exception;

public class FileException extends RuntimeException {

    public FileException(Exception e){
        e.getMessage();
    }

    public FileException(String s, Exception e){ }
}
