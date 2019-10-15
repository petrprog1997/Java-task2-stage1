package by.epam.javatask2.factory;

import by.epam.javatask2.models.FreightTaxi;
import by.epam.javatask2.models.Minibus;
import by.epam.javatask2.models.PassengerTaxi;
import by.epam.javatask2.models.Taxi;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class TaxiFactoryTest {

  private TaxiFactory taxiFactory = new TaxiFactory();

    @Test
    public void testFactoringNewMinibusShouldReturnTrue() {
        List<String> minibusList = new ArrayList<>(List.of("minibus", "Mercedes", "3434FE-1", "24344", "14", "LUX"));
        Taxi outputMinibus = taxiFactory.getFactory(minibusList);
        Taxi expectedMinibus = new Minibus("MERCEDES", "3434FE-1", 24344, 14, "LUX");
        assertEquals(outputMinibus,expectedMinibus);
    }

    @Test
    public void testFactoringNewFreightTaxiShouldReturnTrue() {
        List<String> freightList = new ArrayList<>(List.of("FreightTaxi", "Scania", "4897AF-3", "75330", "7"));
        Taxi outputFreightTaxi = taxiFactory.getFactory(freightList);
        Taxi expectedFreightTaxi = new FreightTaxi("SCANIA", "4897AF-3", 75330, 7);
        assertEquals(outputFreightTaxi,expectedFreightTaxi);
    }

    @Test
    public void testFactoringNewPassengerTaxiShouldReturn() {
        List<String> passengerTaxiList = new ArrayList<>(List.of("passengerTaxi", "lexus","2477GR-3", "234448", "2", "Economy", "coupe"));
        Taxi outputPassengerTaxi = taxiFactory.getFactory(passengerTaxiList);
        Taxi expectedPassengerTaxi = new PassengerTaxi("LEXUS", "2477GR-3", 234448, 2, "ECONOMY", "COUPE");
        assertEquals(outputPassengerTaxi,expectedPassengerTaxi);
    }
}