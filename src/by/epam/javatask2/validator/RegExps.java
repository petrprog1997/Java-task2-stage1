package by.epam.javatask2.validator;

public abstract class RegExps {
    public static final String[] TYPEOFCAR = {"minibus", "freighttaxi", "passengertaxi"};
    public static final String REGEXPFORMINIBUS =
                    "\\s*\\w+\\s*(\\:|\\,*)" +
                    "\\s*\\w+\\s*\\,*" +
                    "\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*" +
                    "\\s*[0-9]{3,8}\\s*\\,*" +
                    "\\s*[1-2][0-9]\\s*\\,*" +
                    "\\s*\\w+\\s*" ;
    public static final String REGEXPFORFREIGHTTAXI =
                    "\\s*\\w+\\s*(\\:|\\,*)" +
                    "\\s*\\w+\\s*\\,*" +
                    "\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*" +
                    "\\s*[0-9]{3,8}\\s*\\,*" +
                    "\\s*\\d" +
                    "\\s*\\,*\\s*";
    public static final String REGEXPFORPASSENGERTAXI =
                    "\\s*\\w+\\s*(\\:|\\,*)" +
                    "\\s*\\w+\\s*\\,*" +
                    "\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*" +
                    "\\s*[0-9]{3,8}\\s*\\,*" +
                    "\\s*\\d" +
                    "\\s*\\,*" +
                    "\\s*\\w+\\s*\\,*" +
                    "\\s*\\w+\\s*";
}