package Fall_2015.package1;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Created by Hussein on 6/11/15.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double $number1 = userInput.nextDouble();

        System.out.print("Enter second number: ");
        double $number2 = userInput.nextDouble();

        BigDecimal number1 = BigDecimal.valueOf($number1);
        BigDecimal number2 = BigDecimal.valueOf($number2);

        BigDecimal number3 = number1.add(number2); // Evaluated
        // from left to right

        System.out.printf("%nFirst Number: %f%n", number1);
        System.out.printf("Second Number: %f%n", number2);
        System.out.printf("Third Number: %f%n", number3);
        System.out.printf("Number Format: %s", NumberFormat.getCurrencyInstance(Locale.US).format(number3));
    }
}
