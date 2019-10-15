package by.epam.javatask2.models;

import java.util.Objects;

public  abstract class Taxi {

    private String number;
    private String brand;
    private int price;

    public Taxi(){}

    public Taxi(String brand, String number, int price) {
        this.brand = brand;
        this.number = number;
        this.price = price;
    }

    public void setBrand(String brand) { this.brand = brand; }

    public String getBrand() { return brand; }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return price == taxi.price &&
                Objects.equals(number, taxi.number) &&
                Objects.equals(brand, taxi.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, brand, price);
    }
}