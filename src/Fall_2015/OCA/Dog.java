package Fall_2015.OCA;

/**
 * Created by Hussein on 11/23/15.
 */
public class Dog extends Animal {
    int noOfLegs;

    public Dog() {
        super();
        noOfLegs = 4;
    }


    public void sound() {
        System.out.println("Woof! Woof!");
    }
}
