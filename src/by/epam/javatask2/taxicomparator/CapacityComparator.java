package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.FreightTaxi;

import java.util.Comparator;

public class CapacityComparator implements Comparator<FreightTaxi> {

    public int compare(FreightTaxi obj1, FreightTaxi obj2) {
        return obj1.getCurringCapacityInTons() - obj2.getCurringCapacityInTons();
    }
}
