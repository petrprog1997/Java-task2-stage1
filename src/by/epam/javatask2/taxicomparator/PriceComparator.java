package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.Taxi;

import java.util.Comparator;

public class PriceComparator implements Comparator<Taxi> {
    @Override
    public int compare(Taxi obj1, Taxi obj2) {
        return obj1.getPrice() - obj2.getPrice();
    }
}
