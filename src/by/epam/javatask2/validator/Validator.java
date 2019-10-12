package by.epam.javatask2.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean validate(String taxiDescriptionString) {
        if (taxiDescriptionString.toLowerCase().contains(RegExps.TYPEOFCAR[0])) {
            Pattern pattern = Pattern.compile(RegExps.REGEXPFORMINIBUS);
            Matcher matcher = pattern.matcher(taxiDescriptionString.toLowerCase());
            return matcher.matches();
        } else if (taxiDescriptionString.toLowerCase().contains(RegExps.TYPEOFCAR[1])) {
            Pattern pattern = Pattern.compile(RegExps.REGEXPFORFREIGHTTAXI);
            Matcher matcher = pattern.matcher(taxiDescriptionString.toLowerCase());
            return matcher.matches();
        } else if (taxiDescriptionString.toLowerCase().contains(RegExps.TYPEOFCAR[2])) {
            Pattern pattern = Pattern.compile(RegExps.REGEXPFORPASSENGERTAXI);
            Matcher matcher = pattern.matcher(taxiDescriptionString.toLowerCase());
            return matcher.matches();
        }
        return false;
    }
}