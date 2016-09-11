package ITS350;

/**
 * Created by Hussein on 2/27/16.
 */
public class Listing21 {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;     // number of items
        int j;              // loop counter
        long searchKey;     // key of item to search for

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        // Printing arr
        for (j=0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");

        // Searching
        searchKey = 66;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey)
                break;
        }
        if (j == nElems) System.out.println("Can't find " + searchKey);
        else System.out.println("Found " + searchKey + " at " + j);

        // Deletion
        searchKey = 55;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey)
                break;
        }
        for (int k = j; k < nElems; k++) {
            arr[k] = arr[k+1];
        }
        nElems--;

        // Printing arr
        for (j=0; j<nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }
}
