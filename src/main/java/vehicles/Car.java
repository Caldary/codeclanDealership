package vehicles;

import behaviors.IEngine;

public class Car extends Vehicle implements IEngine {
    private CarType carType;

    public Car(String make, String color, int price, CarType carType) {
        super(make, color, price);
        this.carType = carType;
    }

    public String engineName() {
        return null;
    }

    public int engineSpeed() {
        return 0;
    }

    public CarType getCarType(){
        return this.carType;
    }
}
