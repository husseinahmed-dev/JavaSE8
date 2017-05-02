package ite409;

/**
 * Created by Hussein on 2/19/17.
 */
public class Tire {
    private String brand;
    private int size;
    private double currentPressure;

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public double getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(double pressure) {
        currentPressure = pressure;
    }
}
