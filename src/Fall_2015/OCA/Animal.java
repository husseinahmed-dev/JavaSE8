package Fall_2015.OCA;

/**
 * Created by Hussein on 11/23/15.
 */
public abstract class Animal {
    String type;
    String color;
    double height;
    double weight;

    public Animal() {

    }

    public Animal(String type) {
        this.type = type;
    }

    public void drink() {
        System.out.println("Drinking whisky!");
    }

    public abstract void sound();
}
