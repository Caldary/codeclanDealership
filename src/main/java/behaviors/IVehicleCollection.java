package behaviors;

import vehicles.Vehicle;

import java.util.ArrayList;

public interface IVehicleCollection {
    ArrayList getVehicleList();

    void addVehicle(Vehicle vehicle);
}
