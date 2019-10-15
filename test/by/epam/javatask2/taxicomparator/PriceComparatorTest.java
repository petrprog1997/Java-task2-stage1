package by.epam.javatask2.taxicomparator;

import by.epam.javatask2.models.FreightTaxi;
import by.epam.javatask2.models.Minibus;
import by.epam.javatask2.models.Taxi;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PriceComparatorTest {

   private PriceComparator priceComparator = new PriceComparator();

    @Test
    public void testCompare() {
        Taxi taxi1 = new Minibus();
        taxi1.setPrice(133);
        Taxi taxi2 = new FreightTaxi();
        taxi2.setPrice(142);
        int expectedDifference = -9;
        int actualDifference = priceComparator.compare(taxi1,taxi2);
        assertEquals(expectedDifference,actualDifference);
    }
}