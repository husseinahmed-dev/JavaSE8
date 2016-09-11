package Fall_2015.ite303;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 * Hussein Ahmed ID:13-00312
 */
public class Lottery {
    public static void main(String[] args) {
        int lotteryNum1 = lotteryNumber(0, 10), lotteryNum2 = lotteryNumber(0, 10), lotteryNum3 = lotteryNumber(0, 10);
        Scanner userInput = new Scanner(System.in);

        // Take user numbers.
        System.out.print("Enter your first number: ");
        int userNum1 = userInput.nextInt();
        System.out.print("Enter your second number: ");
        int userNum2 = userInput.nextInt();
        System.out.print("Enter your third number: ");
        int userNum3 = userInput.nextInt();

        // Display lottery numbers.
        System.out.printf("%n%nLottery numbers are: %d , %d , %d%n%n", lotteryNum1, lotteryNum2, lotteryNum3);

        // Check lottery result.
        if (lotteryNum1 == userNum1 && lotteryNum2 == userNum2 && lotteryNum3 == userNum3)
            System.out.println("Winner!");
        else if (lotteryNum1 == userNum1 && (lotteryNum2 == userNum2 || lotteryNum3 == userNum3) || lotteryNum2 == userNum2 && lotteryNum3 == userNum3)
            System.out.println("Runners up!");
        else if (lotteryNum1 == userNum1 || lotteryNum2 == userNum2 || lotteryNum3 == userNum3)
            System.out.println("Consolation prize.");
        else
            System.out.println("Better luck next time :(");

    }


    private static int lotteryNumber(int minNumber, int maxNumber) {
        SecureRandom secureRandom = new SecureRandom();
        return minNumber + secureRandom.nextInt(maxNumber - minNumber + 1);
    }
}
