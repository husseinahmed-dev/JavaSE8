package ite409;

/**
 * Created by Hussein on 3/9/17.
 */
public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "; I'm a cow; I go moo...";
    }

    public String toString() {
        return String.format(super.toString() + makeSound());
    }

    @Override
    public String move() {
        return (getName() + " Moved");
    }
}
