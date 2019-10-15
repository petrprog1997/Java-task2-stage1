package by.epam.javatask2.exception;

public class UnfoundTaxiParameterException extends RuntimeException {

    public UnfoundTaxiParameterException(String s){
        super(s);
    }

    public UnfoundTaxiParameterException(String s, Exception e){
        super(s);
    }
}