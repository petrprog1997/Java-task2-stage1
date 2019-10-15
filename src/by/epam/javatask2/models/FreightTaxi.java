package by.epam.javatask2.models;

import java.util.Objects;

public class FreightTaxi extends Taxi {

    private int curringCapacityInTons;

    public FreightTaxi(){};

    public FreightTaxi(String brand, String number, int price, int curringCapacityInTons) {
        super(brand, number, price);
        this.curringCapacityInTons = curringCapacityInTons;;
    }

    public void setCurringCapacityInTons(int curringCapacityInTons) {
        this.curringCapacityInTons = curringCapacityInTons;
    }

    public int getCurringCapacityInTons() {
        return curringCapacityInTons;
    }

    @Override
    public String toString() {
        return "Car brand : " + this.getBrand() +
                "; Car number : " + this.getNumber() +
                "; Car price : " + this.getPrice() + "" +
                "; Car capacity : " + this.getCurringCapacityInTons();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreightTaxi that = (FreightTaxi) o;
        return curringCapacityInTons == that.curringCapacityInTons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), curringCapacityInTons);
    }
}