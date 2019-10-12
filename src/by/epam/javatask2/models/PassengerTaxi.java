package by.epam.javatask2.models;

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
}
