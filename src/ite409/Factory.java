package ite409;

/**
 * Created by Hussein on 2/19/17.
 */
public class Factory {
    public static Car createCar(String make, String model, int year, Tire[] tires) {
        return new Car(make, model, year, tires);
    }

    public static Tire[] createTires(String brand, int size) {
        Tire[] tires = new Tire[4];
        Tire tire = new Tire(brand, size);

        for (int i = 0; i < tires.length; i++) {
            tires[i] = tire;
        }
        return tires;
    }
}
