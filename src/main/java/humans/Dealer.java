package humans;

import behaviors.IVehicleCollection;

import java.util.ArrayList;

public class Dealer extends Human implements IVehicleCollection {

    private ArrayList vehicleList;

    public Dealer(String name, int age, int money) {
        super(name, age, money);
        this.vehicleList = vehicleList;
    }

    public ArrayList getVehicleList() {
        return vehicleList;
    }

}
