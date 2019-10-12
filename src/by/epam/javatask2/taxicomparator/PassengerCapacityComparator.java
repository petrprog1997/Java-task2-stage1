package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.Minibus;
import by.epam.javatask2.models.Taxi;

import java.util.Comparator;

public class PassengerCapacityComparator implements Comparator<Minibus> {

    public int compare(Minibus obj1, Minibus obj2) {
        return obj1.getPassengerCapacity() - obj2.getPassengerCapacity();
    }
}
