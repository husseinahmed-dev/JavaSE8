package Fall_2015.exercise;

/**
 * Created by Hussein on 10/25/15.
 */
public class Class46 {
    public static void main(String[] args) {
        int[] array = {10, 3, 5, 6};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) largest = array[i];
            if (array[i] < smallest) smallest = array[i];
        }

        System.out.printf("%nLargest is %d%nSmallest is %d%n", largest, smallest);
        System.out.println("Difference is " + (largest - smallest));
    }
}
