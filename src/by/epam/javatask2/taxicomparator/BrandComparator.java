package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.Taxi;

import java.util.Comparator;

public class BrandComparator implements Comparator<Taxi> {

    public int compare(Taxi obj1, Taxi obj2) {
        return obj1.getBrand().compareTo(obj2.getBrand());
    }
}
