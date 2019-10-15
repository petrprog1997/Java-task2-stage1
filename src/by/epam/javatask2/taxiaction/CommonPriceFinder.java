package by.epam.javatask2.taxiaction;

import by.epam.javatask2.models.Taxi;

import java.util.List;

public class CommonPriceFinder {

    public Integer findCommonPrice(List<Taxi> list) {
        Integer commonPrice = 0;
        for(Taxi taxi : list) {
            commonPrice += taxi.getPrice();
        }
        return commonPrice;
    }
}
