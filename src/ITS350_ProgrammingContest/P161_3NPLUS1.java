package ITS350_ProgrammingContest;
import java.util.Scanner;

/**
 * Created by Hussein on 4/13/16.
 */
public class P161_3NPLUS1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int i;
        int j;
        int n;
        int counter = 0;    // calculating cycle-length
        int largestCounter = Integer.MIN_VALUE;

        i = userInput.nextInt();
        j = userInput.nextInt();

        // Begin algorithm
        for (int k = i; k <= j; k++) {
            n = k;
            counter = 1;

            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(n);
                    counter++;
                } else {
                    n = n * 3 + 1;
                    System.out.println(n);
                    counter++;
                }
            }
            System.out.println("Counter: " + counter);
            if (largestCounter < counter) largestCounter = counter;
            System.out.println();
        }
        System.out.println("Largest Counter: " + largestCounter);
    }
}
