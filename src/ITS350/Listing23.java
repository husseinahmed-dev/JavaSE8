package ITS350;

/**
 * Created by Hussein on 3/6/16.
 */
public class Listing23 {    // class HighArray
    private long[] array;
    private int nElems;

    public Listing23(int max) {
        array = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] == searchKey)
                break;
        }
        if (j == nElems) return false;
        else return true;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == array[j])
                break;
        }
        if (j == nElems) return false;
        else {
            for (int k = j; k < nElems; k++) {
                array[k] = array[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        Listing23 arr;
        arr = new Listing23(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 33;
        if (arr.find(searchKey)) System.out.println("Found " + searchKey);
        else System.out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}
