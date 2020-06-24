package humans;

import behaviors.IVehicleCollection;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealer extends Human implements IVehicleCollection {

    private ArrayList vehicleList;

    public Dealer(String name, int age, int money) {
        super(name, age, money);
        this.vehicleList = new ArrayList();
    }

    public ArrayList getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

}
