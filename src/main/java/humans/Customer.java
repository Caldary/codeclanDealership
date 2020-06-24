package humans;

import behaviors.IVehicleCollection;
import vehicles.FordMustang;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer extends Human implements IVehicleCollection {

    private ArrayList vehicleList;
    public Customer(String name, int age, int money) {
        super(name, age, money);
        this.vehicleList = new ArrayList();
    }

    public ArrayList getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle, Dealer dealer) {
        if (vehicle.getPrice() < getMoney()) {
            addVehicle(vehicle);
            dealer.getVehicleList().remove(vehicle);
            if (vehicle.isDamaged()) {
                this.money -= vehicle.getPrice() / 2;
            }
            else { this.money -= vehicle.getPrice();
            }
        }
    }
}
