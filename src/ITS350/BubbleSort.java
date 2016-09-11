package ITS350;

/**
 * Created by Hussein on 3/3/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {17, 7, 8, 4, 1, 12, 15};

        displayArray(array);
        sort(array);
        displayArray(array);

    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array) {
        for (int i = array.length-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
