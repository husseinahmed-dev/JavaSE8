//import java.util.Random;
//import java.util.Scanner;
//
//
//import java.util.ArrayList;
//
//import java.io.File;
//
////import org.apache.commons.io.FileUtils;
//
//
//
//    public class Hangman
//    {
//
//        public static void main(String [] args)
//        {
//
//            String [] hangmanList = {"accelerate", "achieve", "able", "microscope",
//                    "thumb", "wonderful", "yard", "wood", "lemon", "favorite", "decide", "circular",
//                    "broke", "elephant", "funny", "hamburger", "leg", "job", "lighthouse", "mother",
//                    "notebook", "puzzle"};
//
//            int allowedGuesses = 7;
//
//            hangmanList = readWordList("wordlist.txt");
//
//            String secretWord=pickRandomWord(hangmanList);
//
//
//
//            char[] correctGuesses;
//            correctGuesses = new char[secretWord.length()];
//
//            boolean finish=true;
//
//            for(int i=0; i<correctGuesses.length;i++)
//            {
//                correctGuesses[i]='-';
//
//            }
//
//
//            char[] incorrectGuesses =new char[7];
//
//
//
//            int mistakeCount = 0;
//            Scanner input = new Scanner(System.in);
//
//            while(finish && mistakeCount<7) {
//
//                printGallows(mistakeCount);
//
//                System.out.printf("%nCorrect Guesses: ");
//                for (int i = 0; i < correctGuesses.length; i++) {
//                    System.out.printf("%s", correctGuesses[i]);
//                }
//
//                System.out.print("\nWrong guesses: ");
//                for (int i = 0; i < incorrectGuesses.length; i++) {
//                    System.out.printf("%s ", incorrectGuesses[i]);
//                }
//
//                System.out.print("\nPlease guess a letter: ");
//
//                char enteredGuess = input.next().charAt(0);
//                System.out.println(enteredGuess);
//
//
//
//                boolean letterFound = false;
//                letterFound = matchFound(enteredGuess, secretWord);
//
//
//
//                if (letterFound) {
//                    setLetter(enteredGuess, secretWord, correctGuesses);
//                    System.out.println("-== correct guess! ==-");
//                    finish = !checkWinner(correctGuesses);
//                }
//                else {
//                    incorrectGuesses[mistakeCount] = enteredGuess;
//
//                    mistakeCount++;
//
//                    System.out.println(":(:(:( Oops! that is incorrect...");
//                }
//
//            }
//
//            System.out.println("\n********************************************");
//            System.out.println("The secret word was: " + secretWord);
//
//            if (checkWinner(correctGuesses)) {
//                System.out.println("Congratulations, you won!");
//            }
//            else {
//                System.out.println("Better luck next time!!!");
//                printGallows(mistakeCount);
//            }
//
//            displayHighScore();
//
//
//        }
//
//
//        private static boolean checkWinner(char[] correctGuesses)
//        {
//
//            for (int i = 0; i < correctGuesses.length; i++) {
//                if (correctGuesses[i] == '-') return false;
//            }
//
//            return true;
//
//
//        }
//
//
//        public static boolean matchFound(char guess,String secretWord)
//        {
//            char[] secretCharacters;
//            secretCharacters = secretWord.toCharArray();
//
//            for (int i = 0; i < secretCharacters.length; i++) {
//                if (secretCharacters[i] == guess) {
//                    return true;
//                }
//            }
//
//            return false;
//
//        }
//
//
//        public static boolean setLetter(char guess,String secretWord, char[] correctGuesses)
//
//        {
//            char[] secretCharacters;
//            secretCharacters = secretWord.toCharArray();
//            boolean isSet = false;
//
//            for (int i = 0; i < secretCharacters.length; i++) {
//                if (guess == secretCharacters[i]) {
//                    isSet = true;
//                    correctGuesses[i] = guess;
//                }
//            }
//
//
//
//            return isSet;
//        }
//
//        private static void printGallows(int mistakeCount)
//
//
//        {
//
//            if(mistakeCount==0)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//
//
//                 }
//
//            if(mistakeCount==1)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//            }
//
//            if(mistakeCount==2)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  |  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//
//                      }
//
//            if(mistakeCount==3)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  | \\|");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//                     }
//
//            if(mistakeCount==4)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  | \\|/");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//
//                 }
//
//            if(mistakeCount==5)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  | \\|/");
//                System.out.println("  |  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//
//                 }
//
//            if(mistakeCount==6)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  | \\|/");
//                System.out.println("  |  |");
//                System.out.println("  | /");
//                System.out.println("  |");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//
//                     }
//
//            if(mistakeCount==7)
//            {
//                System.out.println("  ____");
//                System.out.println("  |  |");
//                System.out.println("  |  |");
//                System.out.println("  |  |");
//                System.out.println("  |  O");
//                System.out.println("  | \\|/");
//                System.out.println("  |  |");
//                System.out.println("  | / \\");
//                System.out.println("  |");
//                System.out.println("__|__");
//
//
//        }
//
//        }
//
// private static String pickRandomWord(String[] wordlist)
//    {
//            String secretWord;
//            Random r = new Random();
//
//            secretWord = wordlist[r.nextInt(wordlist.length)];
//
//            return secretWord;
//        }
//
//
//
//
//
//
// public static boolean checkHighScore(int score)
//    {
//
//
//        File file = new File("text/highscore.txt");
//        ArrayList<String> lines = new ArrayList<String>();
//
//
//        lines = (ArrayList<String>) FileUtils.readLines(file);
//
//
//        for (int i=0;i<10;i++)
//    	{
//    		String[ ] line = lines.get(i).split(",");
//    		if(Integer.parseInt(line[1]) < score)
//    		{
//    			return true;
//        }
//    }
//
//    	return false;
//
//    }
//
//
//
//
//
//  public static int score(String word, int number)
//
//
//         {
//
//
//    	return (word.length() -number)* 26;
//       }
//
//
//
//
//
//
//public static void displayHighScore()
//    {
//
//
//        File file = new File("text/highscore.txt");
//
//        ArrayList<String> lines = new ArrayList<String>();
//        lines = (ArrayList<String>) FileUtils.readLines(file);
//
//
//        for(int i=0; i<lines.size(); i++)
//
//
//        {
//            System.out.print(lines.get(i));
//    }
//
//    }
//
//
//
//public static String[ ] readWordList(String name)
//        {
//
//
//            File file = new File(name);
//            ArrayList<String> lines = new ArrayList<String>();
//
//
//
//        lines = (ArrayList<String>) FileUtils.readLines(file);
//
//
//        String[ ] hangman = new String[lines.size()];
//
//    	for (int i = 0; i < lines.size(); i++){
//        hangman[i] = lines.get(i);
//
//    }
//
//    	return hangman;
//        }
//
//
//public static void recordHighScore(String name, int score)
//        {
//
//
//
//
//            File file = new File("text/highscore.txt");
//            ArrayList<String> lines = new ArrayList<String>();
//
//
//        lines=(ArrayList<String>)  FileUtils.readLines(file);
//
//        lines.add(readHighScore(score), name+score);
//
//        FileUtils.writeLines(file, lines);
//
//        }
//
//
//public static int readHighScore(int score)
//
//        {
//        int j;
//
//            File file = new File("text/highscore.txt");
//
//            ArrayList<String> lines = new ArrayList<String>();
//
//        lines = (ArrayList<String>) FileUtils.readLines(file);
//
//
//        for (j=0; j<lines.size(); j++)
//        {
//            String[ ] line = lines.get(j).split(",");
//
//
//
//    }
//    }
//
//
//    }
