package by.epam.javatask2.stringparser;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    public List<String> parse(String taxiDescriptionString) {
        taxiDescriptionString = taxiDescriptionString.trim().replaceAll("[\\:\\,]"," ").replaceAll("\\s+", " ");
        String[] taxiDescriptionArray = taxiDescriptionString.split(" ");
        List<String> taxiDescriptionList = new ArrayList<>(List.of(taxiDescriptionArray));
        return taxiDescriptionList;
    }
}
