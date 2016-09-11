package Fall_2015.package2;
import java.util.Scanner;
/**
 * Created by Hussein on 10/19/15.
 */
public class Largest_V1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int counter=0;
        System.out.print("Enter a number (negative to quit): ");
        int userNumber = input.nextInt();

        while (userNumber > -1) {
            if (userNumber > largest) {
                largest = userNumber;
                counter = 1;
            } else if (userNumber == largest) {
                counter++;
            }

            System.out.print("Enter a number (negative to quit): ");
            userNumber = input.nextInt();
        }

        System.out.printf("%n%nThe highest number is %d%nYou entered it %d times", largest, counter);
    }
}
