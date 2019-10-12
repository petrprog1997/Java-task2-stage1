package by.epam.javatask2.factorypattern;

import by.epam.javatask2.models.FreightTaxi;
import by.epam.javatask2.models.Minibus;
import by.epam.javatask2.models.PassengerTaxi;
import by.epam.javatask2.models.Taxi;
import java.util.List;

public class TaxiFactory {

    public Taxi factoring(List<String> taxiDescriptionList) {
        String type = taxiDescriptionList.get(0).toLowerCase();
        Taxi taxi = null;
        switch (type) {
            case "minibus":
                taxi = minibus(taxiDescriptionList);
                return taxi;
            case "passengertaxi":
                taxi = passengerTaxi(taxiDescriptionList);
                return taxi;
            case "freighttaxi":
                taxi = freightTaxi(taxiDescriptionList);
                return taxi;
        }
        return null;
    }

    private FreightTaxi freightTaxi(List<String> taxiDescriptionList) {
        FreightTaxi freightTaxi = new FreightTaxi();
        freightTaxi.setBrand(taxiDescriptionList.get(1));
        freightTaxi.setNumber(taxiDescriptionList.get(2));
        freightTaxi.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        freightTaxi.setCurringCapacityInTons(Integer.parseInt(taxiDescriptionList.get(4)));
        return freightTaxi;
    }

    private Minibus minibus(List<String> taxiDescriptionList) {
        Minibus minibus = new Minibus();
        minibus.setBrand(taxiDescriptionList.get(1));
        minibus.setNumber(taxiDescriptionList.get(2));
        minibus.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        minibus.setPassengerCapacity(Integer.parseInt(taxiDescriptionList.get(4)));
        minibus.setServiceLevel(taxiDescriptionList.get(5));
        return minibus;
    }

    private PassengerTaxi passengerTaxi(List<String> taxiDescriptionList) {
        PassengerTaxi passengerTaxi = new PassengerTaxi();
        passengerTaxi.setBrand(taxiDescriptionList.get(1));
        passengerTaxi.setNumber(taxiDescriptionList.get(2));
        passengerTaxi.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        passengerTaxi.setPassengerCapacity(Integer.parseInt(taxiDescriptionList.get(4)));
        passengerTaxi.setServiceLevel(taxiDescriptionList.get(5));
        passengerTaxi.setCarBodyType(taxiDescriptionList.get(6));
        return passengerTaxi;
    }
}
