package ITS350;

/**
 * Created by Hussein on 2/28/16.
 */
public class Listing22 {
    private long[] a;

    public Listing22(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
        return a[index];
    }
} // end class Listing22 [LowArray]

class LowArrayApp {
    public static void main(String[] args) {
        Listing22 arr;
        arr = new Listing22(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;


        // display items
        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();


        // search for data item
        int searchKey = 26;
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == searchKey)
                break;
        }
        if (j == nElems) System.out.println("Can't find " + searchKey);
        else System.out.println("Found " + searchKey);


        // delete value 55
        for (j=0; j < nElems; j++)
            if (arr.getElem(j) == 55)
                break;
        for (int k = j; k < nElems; k++) {  // higher ones down
            arr.setElem(k, arr.getElem(k+1));
        }
        nElems--;


        // display items
        for (j=0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();
    }
}
