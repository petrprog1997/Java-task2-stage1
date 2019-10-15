package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.PassengerTaxi;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PassengerCapacityComparatorForPassengerTaxiTest {

    private PassengerCapacityComparatorForPassengerTaxi passengerCapacityComparatorForPassengerTaxi = new PassengerCapacityComparatorForPassengerTaxi();

    @Test
    public void testCompare() {
        PassengerTaxi passTaxi1 = new PassengerTaxi();
        passTaxi1.setPassengerCapacity(7);
        PassengerTaxi passTaxi2 = new PassengerTaxi();
        passTaxi2.setPassengerCapacity(5);
        int actualDifference = passengerCapacityComparatorForPassengerTaxi.compare(passTaxi1,passTaxi2);
        int expectedDifference = 2;
        assertEquals(actualDifference,expectedDifference);
    }
}