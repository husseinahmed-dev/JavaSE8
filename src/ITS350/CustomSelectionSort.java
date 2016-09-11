package ITS350;

/**
 * Created by Hussein on 3/8/16.
 */
public class CustomSelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 9, 10, 1};
        int i, j, min;
        displayArray(array);

        for (i = 0; i < array.length-1; i++) {
            min = i;
            for (j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        displayArray(array);
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
