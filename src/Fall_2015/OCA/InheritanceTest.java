package Fall_2015.OCA;

import java.util.Random;

/**
 * Created by Hussein on 11/23/15.
 */
public class InheritanceTest {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.drink();
//        d1.sound();
//
//        System.out.println();
//
//        Cat c1 = new Cat();
//        c1.drink();
//        c1.sound();
//
//        System.out.println();
//
//        Animal a1 = new Cat();
//        a1.sound();
//
//        Dog[] dog = new Dog[100];
//        dog[i] = new Dog();

//        for (int i = 0; i < 100; i++) {
//
//            int number = (int) (Math.random() * 11);
//            System.out.println(number);
//
//        }
//
//        Animal dog = new Dog();
//        dog.sound();

        Animal[] zoo = new Animal[50];
        Random rand = new Random();

        for (int i = 0; i < zoo.length; i++) {
            int randomAnimal = rand.nextInt(3);

            if (randomAnimal == 0) {
                zoo[i] = new Dog();
            } else if (randomAnimal == 1) {
                zoo[i] = new Cat();
            } else {
                zoo[i] = new Monkey();
            }
        }

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].sound();
        }




    }
}
