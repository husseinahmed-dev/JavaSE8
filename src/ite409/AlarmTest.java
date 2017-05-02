package ite409;

/**
 * Created by Hussein on 2/14/17.
 */
public class AlarmTest {
    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock(new Time(11,2,9), new Time(8,0,0));

        System.out.println(ac);
    }
}
