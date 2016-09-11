package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 4/16/16.
 */
public class MoneyCoins {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N;
        int A;
        int M;
        int[] coinsValue;

        N = userInput.nextInt();
        for (int i = 0; i < N; i++) {
            A = userInput.nextInt();
            M = userInput.nextInt();
            coinsValue = new int[M];
            for (int j = 0; j < M; j++) {
                coinsValue[j] = userInput.nextInt();
            }
            // calculate

            displayArray(coinsValue);
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
