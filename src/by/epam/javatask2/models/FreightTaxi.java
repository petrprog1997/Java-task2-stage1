package by.epam.javatask2.models;

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
}