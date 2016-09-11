package Fall_2015.package1;

import java.util.Scanner;

/**
 * Created by Hussein on 7/23/15.
 */
public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int number = input.nextInt();

        assert (number >= 1 && number <= 10) : "bad number: " + number;

        System.out.printf("Number %d", number);
    }
}
