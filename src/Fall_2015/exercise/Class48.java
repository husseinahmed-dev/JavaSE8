package Fall_2015.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hussein on 11/4/15.
 */
public class Class48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();

        while (userNumber > -1) {
            arrayList.add(userNumber);
            System.out.print("Enter a number: ");
            userNumber = input.nextInt();
        }

        for (int number : arrayList)
            System.out.printf("%d ", number);
        System.out.println();

        System.out.printf("Largest number: %d", maxNumInArray(arrayList));
    }

    private static int maxNumInArray(ArrayList<Integer> array) {
        int max = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) max = array.get(i);
        }

        return max;
    }
}
