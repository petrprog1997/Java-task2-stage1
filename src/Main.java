import by.epam.javatask2.models.Taxi;
import by.epam.javatask2.factorypattern.TaxiFactory;
import by.epam.javatask2.stringparser.StringParser;
import by.epam.javatask2.taxicomparator.PriceComparator;
import by.epam.javatask2.txtreader.TxtFileReader;
import by.epam.javatask2.validator.Validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String path = ".\\resources\\ReadFromThisFile";
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


        for(int i = 0; i<validList.size(); i++) {
            List<String> list1 = new ArrayList<>(stringParser.parse(validList.get(i)));
            System.out.println(list1);
        }
        TaxiFactory taxiFactory = new TaxiFactory();
        List<Taxi> taxi = new ArrayList<>();

        for (String s : list) {
            if (validator.validate(s)) {
                taxi.add(taxiFactory.factoring(stringParser.parse(s)));
            }
        }
        for(Taxi s : taxi) {
            System.out.println(s.getPrice());
        }

        PriceComparator priceComparator = new PriceComparator();
        TreeSet<Taxi> sortedByPrice = new TreeSet<>(priceComparator);
        sortedByPrice.addAll(taxi);

        System.out.println(sortedByPrice);
    }
}
