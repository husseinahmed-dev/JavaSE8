import java.util.Scanner;
import java.util.Random;
public class WordGuess {
	
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		String guess;
		String words[]={"geography", "cat", "yesterday", "java", "truck", "opportunity", "fish", 
			"token", "transportation", "bottom", "apple", "cake", "remote", "boots", "terminology", "arm", 
			"cranberry", "tool", "caterpillar", "spoon", "watermelon", "laptop", "toe", "toad", "fundamental",
			"capitol", "garbage", "anticipate", "spooky" };
		
		
		System.out.println("Enter your guess: ");
		guess=input.next();
		
		
	}

	public static String shuffle(String words){
		
		int random;
		char string;
		char[] letters = words.toCharArray();
		  
		for (int i = 0; i < letters.length; i++) {
		        random = (int)(Math.random()*letters.length);
		       	string = letters[i];
		        letters[i] = letters[random];
		        letters[random] = string;
		    }
		    return new String(letters);

	
	}
	public static boolean checkWinner(String[] secretWord, String[] playersInput){
		
		boolean x=false; 
		
		for(int i=0; i<playersInput.length; i++) 
		{
			if(secretWord[i]==playersInput[i])
			{
				x = true;
				System.out.println("You guessed correctly. The word was "+secretWord);
				
			}
			else
			{
				x = false;
				System.out.println("Oops! "+playersInput+" is incorrect.");
			}	
			}
	
		return x;
	}
		
		
	}
	


