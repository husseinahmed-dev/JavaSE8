package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 3/12/16.
 */
public class GondorTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N;      // number of cases
        int B;      // number of ships
        int[][] coordinates;    // ships coordinates

        System.out.print("Enter number of cases: ");
        N = userInput.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number of ships: ");
            B = userInput.nextInt();
            if (B >= 3 && B <= 200) {
                coordinates = new int[B][2];
                for (int j = 0; j < B; j++) {
                    System.out.print("Ship" + (j + 1) + " x-y position: ");
                    coordinates[j][0] = userInput.nextInt();
                    coordinates[j][1] = userInput.nextInt();
                }
                Triangle triangle = new Triangle();
                System.out.print("Maximum battleships that can be destroyed: ");
                System.out.println(triangle.findLargest(coordinates));

                System.out.println();
            } else {
                System.out.println("Number of ships must be (3 <= B <= 200)");
                System.out.println();
            }
        }
    }

}
