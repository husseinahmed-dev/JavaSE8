package Fall_2015.ite303;

/**
 * Hussein Ahmed ID:13-00312
 */
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "2015", "Black", 280);
        car1.printDetails();

        Car car2 = new Car("Chevrolet", "1969", "White", 260);
        car2.printDetails();

        Car car3 = new Car("Chrysler", "2013", "Silver", 240);
        car3.printDetails();
    }
}
