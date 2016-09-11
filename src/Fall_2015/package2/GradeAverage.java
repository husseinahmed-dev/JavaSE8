package Fall_2015.package2;
import java.util.Scanner;
/**
 * Created by Hussein on 10/19/15.
 */
public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, total = 0;
        System.out.printf("Enter marks #%d (negative to quit): ", counter+1);
        int mark = input.nextInt();

        while (mark > -1) {
            total += mark;
            counter++;

            System.out.printf("Enter marks #%d (negative to quit): ", counter+1);
            mark = input.nextInt();
        }

        if (counter > 1) {
            double average = (double) total / counter;
            System.out.printf("You entered %d marks and the average is %.2f", counter, average);
        } else {
            System.out.println("You haven't entered any grades");
        }
    }
}
