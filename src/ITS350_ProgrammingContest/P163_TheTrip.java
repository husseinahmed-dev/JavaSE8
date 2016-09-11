package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 4/16/16.
 */
public class P163_TheTrip {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N;      // number of students
        double[] students;

        N = userInput.nextInt();
        students = new double[N];
        for (int i = 0; i < N; i++) {
            students[i] = userInput.nextDouble();
        }
        displayArray(students);
        double average = average(students);
        double difference = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] > average) {
                difference += students[i] - average;
            }
        }
        double cents = 0;
        for (int i = 0; i < students.length; i++) {
            cents += (students[i] * 100) % 100;
        }

        System.out.println(difference - cents/100);
    }

    // display array
    public static void displayArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // find trip average
    public static double average(double[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
