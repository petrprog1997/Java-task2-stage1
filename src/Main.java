import by.epam.javatask2.factory.TaxiFactory;
import by.epam.javatask2.models.Taxi;
import by.epam.javatask2.stringparser.StringParser;
import by.epam.javatask2.taxicomparator.PriceComparator;
import by.epam.javatask2.txtreader.TxtFileReader;
import by.epam.javatask2.validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String path = ".\\resources\\ReadFromThisFil";
        TxtFileReader txtFileReader = new TxtFileReader();
        List<String> list = txtFileReader.readFromFile(path);
        System.out.println(list);

        Validator validator = new Validator();
        List<String> validList = new ArrayList<>();
        for(String s : list) {
            if(validator.validate(s)){
                validList.add(s);
            }
        }
        System.out.println(validList);

        StringParser stringParser = new StringParser();
        for (String value : validList) {
            List<String> list1 = new ArrayList<>(stringParser.parse(value));
            System.out.println(list1);
        }

        TaxiFactory taxiFactory = new TaxiFactory();
        List<Taxi> taxi = new ArrayList<>();
        for (String s : list) {
            if (validator.validate(s)) {
                taxi.add(taxiFactory.getFactory(stringParser.parse(s)));
            }
        }
        for(Taxi s : taxi) {
            System.out.println(s);
            System.out.println(s.getPrice());
        }

        PriceComparator priceComparator = new PriceComparator();
        TreeSet<Taxi> sortedByPrice = new TreeSet<>(priceComparator);
        sortedByPrice.addAll(taxi);

        System.out.println(sortedByPrice);

    }
}
