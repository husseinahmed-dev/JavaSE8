package ite409;

/**
 * Created by Hussein on 2/19/17.
 */
public class CarTest {
    private static ICar car1;
    public static void main(String[] args) {
        ICar car1 = Factory.createCar("Ford", "Taurus", 2013, Factory.createTires("Michellen", 42));

        System.out.println(car1.getModel());
    }
}
