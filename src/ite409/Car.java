package ite409;

/**
 * Created by Hussein on 2/19/17.
 */
public class Car implements ICar {
    private String make;
    private String model;
    private int year;
    private Tire[] tires;

    public Car(String make, String model, int year, Tire[] tires) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.tires = tires;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Tire[] getTires() {
        return tires;
    }
}
