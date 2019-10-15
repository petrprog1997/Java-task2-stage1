package by.epam.javatask2.factory;

import by.epam.javatask2.exception.UnfoundTaxiParameterException;
import by.epam.javatask2.models.*;

import java.util.List;

public class TaxiFactory {

    public Taxi getFactory(List<String> taxiDescriptionList) {
        String type = taxiDescriptionList.get(0).toLowerCase();
        Taxi taxi = null;
            switch (type) {
                case "minibus":
                    taxi = getMinibus(taxiDescriptionList);
                    break;
                case "passengertaxi":
                    taxi = getPassengerTaxi(taxiDescriptionList);
                    break;
                case "freighttaxi":
                    taxi = getFreightTaxi(taxiDescriptionList);
                    break;
                default:
                    throw new UnfoundTaxiParameterException("Такой тип такси не найден :" + taxiDescriptionList.get(0));
            }
            return taxi;
    }


    private FreightTaxi getFreightTaxi(List<String> taxiDescriptionList) {
        FreightTaxi freightTaxi = new FreightTaxi();
        try {
            freightTaxi.setBrand(CarBrand.valueOf(taxiDescriptionList.get(1).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
           throw new UnfoundTaxiParameterException("Не найдено такой марки машины : " + taxiDescriptionList.get(1),e);
        }
        freightTaxi.setNumber(taxiDescriptionList.get(2));
        freightTaxi.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        freightTaxi.setCurringCapacityInTons(Integer.parseInt(taxiDescriptionList.get(4)));
        return freightTaxi;
    }

    private Minibus getMinibus(List<String> taxiDescriptionList) {
        Minibus minibus = new Minibus();
        try {
            minibus.setBrand(CarBrand.valueOf(taxiDescriptionList.get(1).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
            throw new UnfoundTaxiParameterException("Не найдено такой марки машины : " + taxiDescriptionList.get(1),e);
        }
        minibus.setNumber(taxiDescriptionList.get(2));
        minibus.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        minibus.setPassengerCapacity(Integer.parseInt(taxiDescriptionList.get(4)));
        try{
            minibus.setServiceLevel(ServiceLevel.valueOf(taxiDescriptionList.get(5).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
            throw new UnfoundTaxiParameterException("Не найдено такого типа сервиса : " + taxiDescriptionList.get(6),e);
        }
        return minibus;
    }

    private PassengerTaxi getPassengerTaxi(List<String> taxiDescriptionList) {
        PassengerTaxi passengerTaxi = new PassengerTaxi();
        try{
            passengerTaxi.setBrand(CarBrand.valueOf(taxiDescriptionList.get(1).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
            throw new UnfoundTaxiParameterException("Не найдено такой марки машины : " + taxiDescriptionList.get(1),e);
        }
        passengerTaxi.setNumber(taxiDescriptionList.get(2));
        passengerTaxi.setPrice(Integer.parseInt(taxiDescriptionList.get(3)));
        passengerTaxi.setPassengerCapacity(Integer.parseInt(taxiDescriptionList.get(4)));
        try{
            passengerTaxi.setServiceLevel(ServiceLevel.valueOf(taxiDescriptionList.get(5).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
            throw new UnfoundTaxiParameterException("Не найдено такого типа сервиса : " + taxiDescriptionList.get(6), e);
        }
        try {
            passengerTaxi.setCarBodyType(CarBodyType.valueOf(taxiDescriptionList.get(6).toUpperCase()).toString());
        } catch (IllegalArgumentException e) {
            throw new UnfoundTaxiParameterException("Не найдено такого типа кузова : " + taxiDescriptionList.get(6),e);
        }
        return passengerTaxi;
    }
}
