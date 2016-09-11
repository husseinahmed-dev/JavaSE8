package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 3/14/16.
 */
public class BestPeriodTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N;
        int M;
        int[] p = new int[0];
        N = userInput.nextInt();
        System.out.println();
        for (int i = 0; i < N; i++) {
            M = userInput.nextInt();
            p = new int[M];
            for (int j = 0; j < M; j++) {
                p[j] = userInput.nextInt();
            }
            // do calculations
            System.out.println();
        }
        displayArray(p);
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
