package by.epam.javatask2.validator;

public class RegExps {

    public static final String[] TYPEOFCAR = {"minibus", "freighttaxi", "passengertaxi"};
    public static final String REGEXPFORMINIBUS = "\\s*(minibus)\\s*(\\:|\\,*)\\s*(bmw|mercedes|volkswagen)\\s*\\,*\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*\\s*[0-9]{3,8}\\s*\\,*\\s*[1-2][0-9]\\s*\\,*\\s*(economy|comfort|business|lux)\\s*" ;
    public static final String REGEXPFORFREIGHTTAXI = "\\s*(freighttaxi)\\s*(\\:|\\,*)\\s*(isuzu|man|scania)\\s*\\,*\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*\\s*[0-9]{3,8}\\s*\\,*\\s*\\d\\s*\\,*\\s*";
    public static final String REGEXPFORPASSENGERTAXI = "\\s*(passengertaxi)\\s*(\\:|\\,*)\\s*(lexus|bmw|honda|hyundai)\\s*\\,*\\s*[0-9]{4}[a-z]{2}[-]\\d\\s*\\,*\\s*[0-9]{3,8}\\s*\\,*\\s*\\d\\s*\\,*\\s*(economy|comfort|business|lux)\\s*\\,*\\s*(sedan|coupe|cabriolet|universal|pickup)\\s*";

}
