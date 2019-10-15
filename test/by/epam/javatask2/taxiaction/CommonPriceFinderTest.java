package by.epam.javatask2.taxiaction;

import by.epam.javatask2.models.FreightTaxi;
import by.epam.javatask2.models.Minibus;
import by.epam.javatask2.models.PassengerTaxi;
import by.epam.javatask2.models.Taxi;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CommonPriceFinderTest {

    private CommonPriceFinder commonPriceFinder = new CommonPriceFinder();

    @Test
    public void testShouldFindCommonPrice() {
        List<Taxi> list = new ArrayList<>(3);
        Taxi minibus = new Minibus();
        minibus.setPrice(23312);
        Taxi freightTaxi = new FreightTaxi();
        freightTaxi.setPrice(43244);
        Taxi passengerTaxi = new PassengerTaxi();
        passengerTaxi.setPrice(90777);
        list.add(minibus);
        list.add(freightTaxi);
        list.add(passengerTaxi);

        Integer outputCommonPrice = commonPriceFinder.findCommonPrice(list);
        Integer expectedCommonPrice = 157333;
        assertEquals(outputCommonPrice, expectedCommonPrice);
    }
}