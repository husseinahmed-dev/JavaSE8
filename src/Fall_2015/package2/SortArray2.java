package Fall_2015.package2;

/**
 * Created by Hussein on 11/2/15.
 */
public class SortArray2 {
    public static void main(String[] args) {
        int[] array = {5,6,7,2,3};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array[i]; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int current : array) {
            System.out.println(current);
        }
    }
}
