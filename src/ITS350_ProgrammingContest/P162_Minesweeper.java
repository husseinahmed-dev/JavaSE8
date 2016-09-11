package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 4/15/16.
 */
public class P162_Minesweeper {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int M;      // width
        int N;      // height
        String[][] inputField;
        int[][] outputField;

        M = userInput.nextInt();
        N = userInput.nextInt();
        inputField = new String[M][N];
        outputField = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                inputField[i][j] = userInput.next();
            }
        }
        // input gathered
        findMines(inputField, outputField);
        displayArray(outputField);
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findMines(String[][] inputField, int[][] outputField) {
        for (int i = 0; i < inputField.length; i++) {
            for (int j = 0; j < inputField[i].length; j++) {

                if (inputField[i][j].equals("*")) {
                    // flag the mine
                    outputField[i][j] = -10;

                    // increment right
                    if (j+1 != inputField[i].length) {
                        outputField[i][j+1]++;
                    }
                    // increment bottom-right
                    if (j+1 != inputField[i].length && i+1 != inputField.length) {
                        outputField[i+1][j+1]++;
                    }
                    // increment bottom
                    if (i+1 != inputField.length) {
                        outputField[i+1][j]++;
                    }
                    // increment bottom-left
                    if (i+1 != inputField.length && j-1 != -1) {
                        outputField[i+1][j-1]++;
                    }
                    // increment left
                    if (j-1 != -1) {
                        outputField[i][j-1]++;
                    }
                    // increment top-left
                    if (j-1 != -1 && i-1 != -1) {
                        outputField[i-1][j-1]++;
                    }
                    // increment top
                    if (i-1 != -1) {
                        outputField[i-1][j]++;
                    }
                    // increment top-right
                    if (i-1 != -1 && j+1 != inputField[i].length) {
                        outputField[i-1][j+1]++;
                    }

                }
            }
        }
    }
}
