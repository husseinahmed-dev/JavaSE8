package Fall_2015.exercise;
import java.util.Arrays;

/**
 * Created by Hussein on 11/15/15.
 */
public class Class52 {
    public static void main(String[] args) {
        String[] names = {"Akbar", "Tom", "Jack", "Sam", "Bob", "Hyder", "Alam", "Tooba", "Waseem", "Alan"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334};

        System.out.printf("Best time: %s 0.%ds%n%n", names[playerIndex(playerPosition(times), times)], playerPosition(times));

        for (int i = 0; i < times.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
    }

    public static int playerPosition(int[] times) {
        int[] sorted = Arrays.copyOf(times, times.length );
        Arrays.sort(sorted);
        return sorted[0];
    }

    public static int playerIndex(int bestTime, int[] times) {
        int index = -1;
        for (int i = 0; i < times.length; i++) {
            if (times[i] == bestTime) index = i;
        }

        return index;
    }

}
