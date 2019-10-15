package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.Minibus;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PassengerCapacityComparatorForMinibusTest {

    private PassengerCapacityComparatorForMinibus passengerCapacityComparatorForMinibus = new PassengerCapacityComparatorForMinibus();

    @Test
    public void testCompare() {
        Minibus minibus1 = new Minibus();
        minibus1.setPassengerCapacity(24);
        Minibus minibus2 = new Minibus();
        minibus2.setPassengerCapacity(13);
        int actualDifference = passengerCapacityComparatorForMinibus.compare(minibus1,minibus2);
        int expectedDifference = 11;
        assertEquals(actualDifference,expectedDifference);

    }
}