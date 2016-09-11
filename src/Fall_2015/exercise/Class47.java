package Fall_2015.exercise;

/**
 * Created by Hussein on 10/25/15.
 */
public class Class47 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }

        for (int[] array1 : array) {
            for (int number : array1)
                System.out.printf("%2d ", number);
            System.out.println();
        }
    }
}
