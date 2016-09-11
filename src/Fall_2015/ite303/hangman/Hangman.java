//package Fall_2015.ite303.hangman;
//
//import java.util.Scanner;
//import java.security.SecureRandom;
//import org.apache.commons.io.FileUtils;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//
//
///**
// * Hussein Ahmed ID:13-00312
// */
//
//public class Hangman {
//
//    public static void main(String [] args) {
//
//        int allowedGuesses = 7;
//        String secretWord = pickRandomWord(readWordList("wordlist"));
//        char[] correctGuesses = new char[secretWord.length()];
//
//
//        for (int i = 0; i < correctGuesses.length; i++) {
//            correctGuesses[i] = '-';
//        }
//
//
//        char[] incorrectGuesses = new char[allowedGuesses];
//        int mistakeCount = 0;
//        Scanner input = new Scanner(System.in);
//
//
//        while (mistakeCount < 7 && !checkWinner(correctGuesses)) {
//
//            printGallows(mistakeCount);
//
//
//            System.out.print("\nCorrect guesses: ");
//            for (char character : correctGuesses) System.out.print(character);
//
//            System.out.print("\nWrong guesses: ");
//            for (int i = 0; i < mistakeCount; i++) System.out.print(incorrectGuesses[i] + " ");
//
//
//            System.out.print("\nPlease guess a letter: ");
//            String userInput = input.nextLine();
//            char userGuess = userInput.charAt(0);
//
//
//            boolean letterFound = matchFound(userGuess, secretWord);
//            if (letterFound) setLetter(userGuess, secretWord, correctGuesses);
//
//
//            if (letterFound) {
//                System.out.println("-== correct guess! ==-");
//            } else {
//                incorrectGuesses[mistakeCount] = userGuess;
//                mistakeCount++;
//
//                System.out.println(":(:(:( Oops! that is incorrect...");
//            }
//
//
//        } // end of while loop
//
//
//        System.out.println("\n********************************************");
//        System.out.println("The secret word was: " + secretWord);
//
//        if (checkWinner(correctGuesses)) {
//            System.out.println("Congratulations, you won!");
//            int userScore = score(secretWord, mistakeCount);
//            System.out.println("Your score: " + userScore);
//            if (checkHighScore(userScore)) {
//                System.out.print("Please enter your name: ");
//                String userName = input.nextLine();
//                recordHighScore(userName, userScore);
//                System.out.println("\nNew High Score: " + userScore);
//                displayHighScore();
//
//            }
//        } else {
//            System.out.println("Better luck next time!!!");
//            printGallows(mistakeCount);
//            displayHighScore();
//        }
//
//    } // end of main()
//
//
//    private static boolean checkWinner(char[] correctGuesses) {
//        boolean isWinner;
//        int counter = 0;
//
//        for (int i = 0; i < correctGuesses.length; i++) {
//            if (correctGuesses[i] != '-') counter++;
//        }
//
//        if (counter == correctGuesses.length) isWinner = true;
//        else isWinner = false;
//
//        return isWinner;
//    } // end of checkWinner()
//
//
//    public static boolean matchFound(char guess,String secretWord) {
//        char[] secretWordChar = secretWord.toCharArray();
//
//        for (int i = 0; i < secretWordChar.length; i++) {
//            if (secretWordChar[i] == guess) return true;
//        }
//
//
//        return false;
//    } // end of matchFound()
//
//
//    public static boolean setLetter(char guess,String secretWord, char[] correctGuesses) {
//        char[] secretWordChar = secretWord.toCharArray();
//        int counter = 0;
//
//        for (int i = 0; i < secretWordChar.length; i++) {
//            if (secretWordChar[i] == guess && correctGuesses[i] == '-') {
//                correctGuesses[i] = guess;
//                counter++;
//            }
//        }
//
//        if (counter > 0) return true;
//        else return false;
//    } // end of setLetter()
//
//
//
//    private static void printGallows(int mistakeCount) {
//
//        switch(mistakeCount) {
//            case 0:
//                System.out.println("  ____\n  |  |\n  |\n  |\n  |\n  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 1:
//                System.out.println("  ____\n  |  |\n  |  O\n  |\n  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 2:
//                System.out.println("  ____\n  |  |\n  |  O\n  |  |\n  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 3:
//                System.out.println("  ____\n  |  |\n  |  O\n  | \\|\n  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 4:
//                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 5:
//                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |  |\n  |\n  |\n  |\n__|__");
//                break;
//            case 6:
//                System.out.println("  ____\n  |  |\n  |  O\n  | \\|/\n  |  |\n  | /\n  |\n  |\n__|__");
//                break;
//            case 7:
//                System.out.println("  ____\n  |  |\n  |  |\n  |  |\n  |  O\n  | \\|/\n  |  |\n  | / \\\n__|__");
//                break;
//        } // end of switch
//    } // end of printGallows()
//
//
//    private static String pickRandomWord(String[] dictionary) {
//        String secretWord;
//        SecureRandom random = new SecureRandom();
//
//        secretWord = dictionary[random.nextInt(dictionary.length)];
//
//        return secretWord;
//    }
//
//    public static int score(String secretWord, int mistakeCount) {
//        int score;
//        score = (secretWord.length() - mistakeCount) * 26;
//
//        return score;
//    }
//
//    public static boolean checkHighScore(int score) {
//        File highscoreFile = new File("src/Fall_2015.ite303/hangman/highscore.txt");
//        boolean isTopTen = false;
//
//        try {
//            ArrayList<String> highscoreLines = (ArrayList<String>) FileUtils.readLines(highscoreFile);
//
//            for (int i = 0; i < 10; i++) {
//                String line = highscoreLines.get(i);
//                String[] lineSplit = line.split(",");
//                int currentScore = Integer.parseInt(lineSplit[1]);
//                if (score > currentScore) isTopTen = true;
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return isTopTen;
//    }   // end checkHighScore()
//
//    public static int readHighScore(int score) {
//        File highscoreFile = new File("src/Fall_2015.ite303/hangman/highscore.txt");
//        int index = -1;
//
//        try {
//            ArrayList<String> highscoreLines = (ArrayList<String>) FileUtils.readLines(highscoreFile);
//
//            for (int i = 0; i < highscoreLines.size(); i++) {
//                String line = highscoreLines.get(i);
//                String[] lineSplit = line.split(",");
//                int currentScore = Integer.parseInt(lineSplit[1]);
//                if (score > currentScore) {
//                    index = i;
//                    break;
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return index;
//    }   // end of readHighScore()
//
//    public static void recordHighScore(String name, int score) {
//        File highscoreFile = new File("src/Fall_2015.ite303/hangman/highscore.txt");
//        int index = readHighScore(score);
//
//        try {
//            ArrayList<String> highscoreLines = (ArrayList<String>) FileUtils.readLines(highscoreFile);
//            highscoreLines.add(index, String.format("%s,%d", name, score));
//            FileUtils.writeLines(highscoreFile, highscoreLines);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }   // end of recordHighScore()
//
//    public static void displayHighScore() {
//        File highscoreFile = new File("src/Fall_2015.ite303/hangman/highscore.txt");
//
//        try {
//            ArrayList<String> highscoreLines = (ArrayList<String>) FileUtils.readLines(highscoreFile);
//
//            System.out.printf("%-15s%4s%n", "Name", "Score");
//            for (int i = 0; i < 10; i++) {
//                String line = highscoreLines.get(i);
//                String[] lineSplit = line.split(",");
//                String userName = lineSplit[0];
//                String userScore = lineSplit[1];
//                System.out.printf("%-15s%4s%n", userName, userScore);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }   // end of displayHighScore()
//
//    public static String[] readWordList(String filename) {
//        File wordlistFile = new File("src/Fall_2015.ite303/hangman/" + filename + ".txt");
//        String[] hangmanList = new String[0];
//
//        try {
//            ArrayList<String> wordlistLines = (ArrayList<String>) FileUtils.readLines(wordlistFile);
//            hangmanList = new String[wordlistLines.size()];
//
//            for (int i = 0; i < hangmanList.length; i++) {
//                hangmanList[i] = wordlistLines.get(i);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return hangmanList;
//    }   // end of readWordList()
//
//}	// end of Hangman class
//
//
