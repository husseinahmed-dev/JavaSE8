package ITS350;
import java.util.Scanner;

/**
 * Created by Hussein on 3/1/16.
 */
public class BinarySearch {
    private static int nElems = 0;
    private static int[] array = new int[100];

    public static void main(String[] args) {
        array[0] = 1;
        array[1] = 2;
        array[2] = 5;
        array[3] = 9;
        array[4] = 15;
        array[5] = 16;
        array[6] = 19;
        array[7] = 20;
        array[8] = 27;
        array[9] = 33;
        array[10] = 90;

        nElems = 11;

        System.out.print("Enter number to find: ");
        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();

        if (search(userNumber) < nElems) {
            System.out.println("Found it at " + search(userNumber));
        } else {
            System.out.println("Couldn't find it");
        }
    }

    public static int search(long searchKey) {
        int lowerband = 0;
        int upperband = nElems - 1;
        int current;

        while(true) {
            current = (lowerband + upperband) / 2;
            if (array[current] == searchKey)
                return current;
            else if (lowerband > upperband)
                return nElems;
            else {
                if(array[current] < searchKey)
                    lowerband = current + 1;
                else
                    upperband = current - 1;
            }
        }

    }
}
