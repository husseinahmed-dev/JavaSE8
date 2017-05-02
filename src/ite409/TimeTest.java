package ite409;

/**
 * Created by Hussein on 2/14/17.
 */
public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(12, 0, 0);
        System.out.println(t1);

        Time t2 = new Time(t1);
        System.out.println(t2);
    }
}
