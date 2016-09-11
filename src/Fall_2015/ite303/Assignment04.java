package Fall_2015.ite303;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Hussein Ahmed ID:13-00312
 */
public class Assignment04 {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[4], userNumbers = new int[4];
        Scanner userInput = new Scanner(System.in);

        // Initialize lottery numbers.
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = lotteryNumber(0, 10);
        }

        // Take user numbers.
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("Enter number %d between (0-10) : ", i + 1);
            userNumbers[i] = userInput.nextInt();
        }

        // Display result.
        System.out.printf("%n%n%-18s", "Lottery Numbers - ");
        displayArray(lotteryNumbers);
        System.out.printf("%-18s", "Your Numbers - ");
        displayArray(userNumbers);
        System.out.println(checkWinner(lotteryNumbers, userNumbers) ? "Winner!" : "Better luck next time :(");

    }

    private static boolean checkWinner(int[] lotteryNumbers, int[] userNumbers ) {
        int equalCounter = 0;

        for (int i = 0; i < 4; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) equalCounter++;
        }

        if (equalCounter == 4) return true;
        else return false;
    }

    private static int lotteryNumber(int minNumber, int maxNumber) {
        SecureRandom secureRandom = new SecureRandom();
        return minNumber + secureRandom.nextInt(maxNumber - minNumber + 1);
    }

    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d" + (i+1 < array.length ? " , " : "."), array[i]);
        }
        System.out.println();
    }
}
