package by.epam.javatask2.models;

import java.util.Objects;

public class Minibus extends Taxi {

    private int passengerCapacity;
    private String serviceLevel;

    public Minibus(){}

    public Minibus(String brand, String number, int price, int passengerCapacity, String serviceLevel) {
        super(brand, number, price);
        this.passengerCapacity = passengerCapacity;
        this.serviceLevel = serviceLevel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String toString() {
        return "Car brand : " + this.getBrand() +
                "; Car number : " + this.getNumber() +
                "; Car price : " + this.getPrice() + "" +
                "; Car passenger capacity : " + this.getPassengerCapacity() +
                "; Car service level : " + this.getServiceLevel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minibus minibus = (Minibus) o;
        return passengerCapacity == minibus.passengerCapacity &&
                Objects.equals(serviceLevel, minibus.serviceLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity, serviceLevel);
    }
}
