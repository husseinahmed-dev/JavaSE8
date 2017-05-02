package ite409;

/**
 * Created by Hussein on 3/9/17.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "; I'm a cat; I go meow....";
    }

    public String toString() {
        return String.format(super.toString() + makeSound());
    }

    @Override
    public String move() {
        return (getName() + " Moved");
    }
}
