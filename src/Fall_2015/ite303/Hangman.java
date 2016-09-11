package year_2015.ite303;

import java.util.Random;
import java.util.Scanner;


/**
 * Hussein Ahmed ID:13-00312
 */

public class Hangman {

    public static void main(String [] args) {

        String[] hangmanList = {"accelerate", "achieve", "able", "microscope",
                "thumb", "wonderful", "yard", "wood", "lemon", "favorite", "decide", "circular",
                "broke", "elephant", "funny", "hamburger", "leg", "job", "lighthouse", "mother",
                "notebook", "puzzle"};

        int allowedGuesses = 7;
        String secretWord = pickRandomWord(hangmanList);
        char[] correctGuesses = new char[secretWord.length()];


        for (int i = 0; i < correctGuesses.length; i++) {
            correctGuesses[i] = '-';
        }


        char[] incorrectGuesses = new char[allowedGuesses];
        int mistakeCount = 0;
        Scanner input = new Scanner(System.in);


        while (mistakeCount < 7 && !checkWinner(correctGuesses)) {

            printGallows(mistakeCount);


            System.out.print("\nCorrect guesses: ");
            for (char character : correctGuesses) System.out.print(character);

            System.out.print("\nWrong guesses: ");
            for (int i = 0; i < mistakeCount; i++) System.out.print(incorrectGuesses[i] + " ");


            System.out.print("\nPlease guess a letter: ");
            String userInput = input.nextLine();
            char userGuess = userInput.charAt(0);


            boolean letterFound = matchFound(userGuess, secretWord);
            if (letterFound) setLetter(userGuess, secretWord, correctGuesses);


            if (letterFound) {
                System.out.println("-== correct guess! ==-");
            } else {
                incorrectGuesses[mistakeCount] = userGuess;
                mistakeCount++;

                System.out.println(":(:(:( Oops! that is incorrect...");
            }


        } // end of while loop


        System.out.println("\n********************************************");
        System.out.println("The secret word was: " + secretWord);

        if (checkWinner(correctGuesses)) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Better luck next time!!!");
            printGallows(mistakeCount);
        }

    } // end of main()


    private static boolean checkWinner(char[] correctGuesses) {
    	boolean isWinner;
        int counter = 0;

        for (int i = 0; i < correctGuesses.length; i++) {
            if (correctGuesses[i] != '-') counter++;
        }

        if (counter == correctGuesses.length) isWinner = true;
        else isWinner = false;

        return isWinner;
    } // end of checkWinner()


    public static boolean matchFound(char guess,String secretWord) {
    	char[] secretWordChar = secretWord.toCharArray();

        for (int i = 0; i < secretWordChar.length; i++) {
            if (secretWordChar[i] == guess) return true;
        }


        return false;
    } // end of matchFound()


    public static boolean setLetter(char guess,String secretWord, char[] correctGuesses) {
    	char[] secretWordChar = secretWord.toCharArray();
        int counter = 0;

        for (int i = 0; i < secretWordChar.length; i++) {
            if (secretWordChar[i] == guess && correctGuesses[i] == '-') {
                correctGuesses[i] = guess;
                counter++;
            }
        }

        if (counter > 0) return true;
        else return false;
    } // end of setLetter()



    private static void printGallows(int mistakeCount) {

        switch(mistakeCount) {
            case 0:
                System.out.println("  ____\n  |  |\n  |\n  |\n  |\n  |\n  |\n  |\n  |\n__|__");
                break;
            case 1:
                System.out.println("  ____\n  |  |\n  |  O\n  |\n  |\n  |\n  |\n  |\n__|__");
                break;
            case 2:
                System.out.println("  ____\n  |  |\n  |  O\n  |  |\n  |\n  |\n  |\n  |\n__|__");
                break;
            case 3:
                System.out.println("  ____\n  |  |\n  |  O\n  | \\|\n  |\n  |\n  |\n  |\n__|__");
                break;
            case 4:
                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |\n  |\n  |\n  |\n__|__");
                break;
            case 5:
                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |  |\n  |\n  |\n  |\n__|__");
                break;
            case 6:
                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |  |\n  | /\n  |\n  |\n__|__");
                break;
            case 7:
                System.out.println("  ____\n  |  |\n  |  |\n  |  |\n  |  O\n  | \\|/\n  |  |\n  | / \\\n__|__");
                break;
        } // end of switch
    } // end of printGallows()


    private static String pickRandomWord(String[] dictionary) {
    	String secretWord;
        Random random = new Random();

        secretWord = dictionary[random.nextInt(dictionary.length)];

    	return secretWord;
    }

}	// end of Hangman class


