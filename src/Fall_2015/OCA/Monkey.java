package Fall_2015.OCA;

/**
 * Created by Hussein on 11/30/15.
 */
public class Monkey extends Animal {
    int noOfLegs;

    public Monkey() {
        super("Mammal");
        noOfLegs = 2;
    }

    public void sound() {
        System.out.println("Am a goddamn monkey!");
    }
}
