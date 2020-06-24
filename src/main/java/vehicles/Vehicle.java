package vehicles;

public abstract class Vehicle {
    private String make;
    private String color;
    private int price;
    private boolean damaged = false;

    public Vehicle(String make, String color, int price, boolean damaged) {
        this.make = make;
        this.color = color;
        this.price = price;
        this.damaged = damaged;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
}
