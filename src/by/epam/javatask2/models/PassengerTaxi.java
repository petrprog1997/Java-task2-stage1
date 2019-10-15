package by.epam.javatask2.models;

import java.util.Objects;

public class PassengerTaxi extends Taxi {

    private int passengerCapacity;
    private String serviceLevel;
    private String carBodyType;

    public PassengerTaxi(){};

    public PassengerTaxi(String brand, String number, int price, int passengerCapacity, String serviceLevel, String carBodyType)
    {
        super(brand, number, price);
        this.passengerCapacity = passengerCapacity;
        this.serviceLevel = serviceLevel;
        this.carBodyType = carBodyType;
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

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public String toString() {
        return "Car brand : " + this.getBrand() +
                "; Car number : " + this.getNumber() +
                "; Car price : " + this.getPrice() + "" +
                "; Car passenger capacity : " + this.getPassengerCapacity() +
                "; Car service level : " + this.getServiceLevel() +
                "; Car's type of body : " + this.getCarBodyType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerTaxi that = (PassengerTaxi) o;
        return passengerCapacity == that.passengerCapacity &&
                Objects.equals(serviceLevel, that.serviceLevel) &&
                Objects.equals(carBodyType, that.carBodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity, serviceLevel, carBodyType);
    }
}
