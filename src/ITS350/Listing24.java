package ITS350;

/**
 * Created by Hussein on 3/6/16.
 */
public class Listing24 {    // class OrdArray
    private long[] array;
    private int nElems;

    public Listing24(int max) {
        array = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerband = 0;
        int upperband = nElems - 1;
        int currentPos;

        while(true) {
            currentPos = (upperband + lowerband) / 2;
            if (array[currentPos] == searchKey)
                return currentPos;
            else if (lowerband > upperband)
                return nElems;
            else {
                if (array[currentPos] < searchKey)
                    lowerband = currentPos + 1;
                else
                    upperband = currentPos - 1;
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] > value)
                break;
        }
        for (int k = nElems; k > j; k--) {
            array[k] = array[k-1];
        }
        array[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j==nElems)
            return false;
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

class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        Listing24 arr;
        arr = new Listing24(maxSize);

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

        int searchKey = 55;
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}

