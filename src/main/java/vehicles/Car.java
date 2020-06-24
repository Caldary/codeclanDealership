package vehicles;

import behaviors.IEngine;

public class Car extends Vehicle implements IEngine {
    public Car(String make, String color, int price) {
        super(make, color, price);
    }

    public String engineName() {
        return null;
    }

    public int engineSpeed() {
        return 0;
    }
}
