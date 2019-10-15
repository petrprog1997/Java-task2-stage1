package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.Minibus;

import java.util.Comparator;

public class PassengerCapacityComparatorForMinibus implements Comparator<Minibus> {


    @Override
    public int compare(Minibus o1, Minibus o2) {
        return o1.getPassengerCapacity()-o2.getPassengerCapacity();
    }
}
