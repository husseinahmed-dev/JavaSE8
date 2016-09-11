package Tutoring;
import java.util.Scanner;
/**
 * Created by Hussein on 4/14/16.
 */
public class BooleanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isSummer = false;

        while (!isSummer) {
            System.out.print("Enter true for summer and false for winter: ");
            isSummer = input.nextBoolean();
        }
    }
}
