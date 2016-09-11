package ITS350;

import java.io.IOException;

/**
 * Created by Hussein on 4/2/16.
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;

        if (nItems==0)                  // if no items,
            queArray[nItems++] = item;  // insert at 0
        else {
            for (j = nItems - 1; j >= 0; j--) {     // start at end
                if (item > queArray[j])             // if new item larger
                    queArray[j+1] = queArray[j];    // shift upward
                else    // if smaller,
                    break;
            }
            queArray[j+1] = item;       // insert it
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }   // remove minimum item

    public long peekMin() {
        return queArray[nItems-1];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
class PriorityQApp {
    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while(!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " ");
        }
    }
}
