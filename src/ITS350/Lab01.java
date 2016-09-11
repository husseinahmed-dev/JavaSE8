package ITS350;

/**
 * Hussein Ahmed: 13-00312
 */
public class Lab01 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, };

        System.out.println("Original Array:");
        displayArray(array);


        // insert 5 at index 3
        System.out.println("Insert value 5 at index 3:");
        insertArray(array, 3, 5);
        displayArray(array);

        // delete index 2 from array
        System.out.println("Delete index 2 from array:");
        deleteArray(array, 2);
        displayArray(array);

        // search for value 2 and return the index
        System.out.println("index of 2 is:");
        System.out.println(searchArray(array, 2));

    }

    // if found return the index, else return -1
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static void insertArray(int[] array, int key, int value) {
        for (int i = array.length-1; i >= key ; i--) {
            array[i] = array[i-1];

            if(i == key) {
                array[i] = value;
                break;
            }
        }
    }

    public static void deleteArray(int[] array, int key) {
        for (int i = key; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
