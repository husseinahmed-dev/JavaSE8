package Fall_2015.package2;
import java.util.Scanner;

/**
 * Created by Hussein on 9/21/15.
 */
public class MenuCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\t%s\t%s\t%s\t%s%n", "1- Addition", "2- Subtraction", "3- Multiplication", "4- Divsion",
                "5- Quit");
        int userChoice = input.nextInt();

        while (userChoice != 5) {
            System.out.print("Enter first integer: ");
            int number1 = input.nextInt();
            System.out.print("Enter second integer: ");
            int number2 = input.nextInt();
            int result;

            if (userChoice == 1) {
                result = number1 + number2;
                System.out.printf("%d + %d = %d%n", number1, number2, result);
            } else if (userChoice == 2) {
                result = number1 - number2;
                System.out.printf("%d - %d = %d%n", number1, number2, result);
            } else if (userChoice == 3) {
                result = number1 * number2;
                System.out.printf("%d * %d = %d%n", number1, number2, result);
            } else if (userChoice == 4) {
                result = number1 * number2;
                System.out.printf("%d / %d = %d%n", number1, number2, result);
            }

            System.out.printf("%s\t%s\t%s\t%s\t%s%n", "1- Addition", "2- Subtraction", "3- Multiplication", "4- Divsion",
                    "5- Quit");
            userChoice = input.nextInt();
        }

        System.out.println("Thanks for using the program. Good Bye!");
    }
}
