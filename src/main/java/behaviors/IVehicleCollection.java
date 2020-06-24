package behaviors;

import humans.Human;
import vehicles.Vehicle;

import java.util.ArrayList;

public interface IVehicleCollection {
    ArrayList getVehicleList();

    void addVehicle(Vehicle vehicle);

}
