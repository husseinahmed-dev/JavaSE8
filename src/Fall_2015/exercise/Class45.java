package Fall_2015.exercise;

/**
 * Created by Hussein on 10/25/15.
 */
public class Class45 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 6};
        int evenCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) evenCounter++;
        }

        System.out.println(evenCounter);
    }
}
