package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.PassengerTaxi;

import java.util.Comparator;

public class PassengerCapacityComparatorForPassengerTaxi implements Comparator<PassengerTaxi> {

    @Override
    public int compare(PassengerTaxi o1, PassengerTaxi o2) {
        return o1.getPassengerCapacity()-o2.getPassengerCapacity();
    }
}
