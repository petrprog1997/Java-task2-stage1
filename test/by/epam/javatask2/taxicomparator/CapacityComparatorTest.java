package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.FreightTaxi;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CapacityComparatorTest {

   private CapacityComparator capacityComparator = new CapacityComparator();

    @Test
    public void testCompare() {
        FreightTaxi freightTaxi1 = new FreightTaxi();
        freightTaxi1.setCurringCapacityInTons(4);
        FreightTaxi freightTaxi2 = new FreightTaxi();
        freightTaxi2.setCurringCapacityInTons(3);
        int expectedDifference = 1;
        int actualDifference = capacityComparator.compare(freightTaxi1,freightTaxi2);
        assertEquals(expectedDifference,actualDifference);
    }
}