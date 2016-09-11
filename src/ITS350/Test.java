package ITS350;

/**
 * Created by Hussein on 2/21/16.
 */
public class Test {
    private static int nElems = 0;
    public static void main(String[] args) {
        int[] array =new int[100];
        array[0] = 1;
        array[1] = 2;
        array[2] = 5;
        array[3] = 8;
        array[4] = 15;
        array[5] = 75;
        array[6] = 40;
        nElems = 7;

        insertArray(array, 16);
        displayArray(array);
    }

    public static void insertArray(int[] array, int value) {
        for (int i = 0; i < nElems; i++) {
            if (value < array[i]) {
                System.out.println(i);
                for (int j = nElems-1; j <= i; j--) {
                    array[j] = array[j-1];

                    if(j == i) {
                        array[j] = value;
                        break;
                    }
                }
            }
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }


}
