package Fall_2015.ite303;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 * Hussein Ahmed ID:13-00312
 */
public class WordGuess {
    private static SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] wordlist = {"geography", "cat", "yesterday", "java", "truck", "opportunity", "fish", "token",
                            "transportation", "bottom", "apple", "cake", "remote", "boots", "terminology",
                            "arm", "cranberry", "tool", "caterpillar", "spoon", "watermelon", "laptop",
                            "toe", "toad", "fundamental", "capitol", "garbage", "anticipate", "spooky"};

        String wordToGuess = wordlist[secureRandom.nextInt(wordlist.length)];
        System.out.println(shuffle(wordToGuess));

        System.out.print("Enter your guess: ");
        String userAnswer = userInput.nextLine();

        System.out.println(checkWinner(wordToGuess, userAnswer) ? "You guessed correctly. The word was " + wordToGuess + "." : "Oops! " + userAnswer + " is incorrect.");
    }

    public static String shuffle(String word) {
        char[] characters = word.toCharArray();
        String shuffled = "";

        for (int i = characters.length - 1; i > 0 ; i--) {
            int random = secureRandom.nextInt(i + 1);
            char temp = characters[random];
            characters[random] = characters[i];
            characters[i] = temp;
        }

        for (char character : characters)
            shuffled += character;

        return shuffled;
    }

    public static boolean checkWinner(String correctAnswer, String userAnswer) {
        if (correctAnswer.equals(userAnswer)) return true;
        return false;
    }
}
