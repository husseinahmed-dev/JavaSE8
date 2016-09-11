package Fall_2015.package2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadFileExample {
	
	public static void main(String[] args) {
		
		
		//1.Provide a reference to to the file
		//Create a 'File' object
		
		
		//For storing it in an array do the below line
		
		ArrayList<String> lines = new ArrayList<String>();
		
		File file = new File("src/Fall_2015.package2/file.txt");
		
		//2. Read using an object of Scanner class
		
		try{
		
		Scanner fileReader = new Scanner(file);
		
		//counting the lines
		int lineCount = 0;
		while(fileReader.hasNextLine()){
			lineCount++;
		}
		
		
		
		while(fileReader.hasNextLine())
		{
			String s = fileReader.nextLine();
			//this line adds each line into the array one at a time
			lines.add(s);
			//System.out.println(s);
			
		}// end of while
		
		Random random = new Random();
		int randomQuote = random.nextInt(lines.size());
		//to get one line randomly at a time
		System.out.println(lines.get((int)(Math.random()*lines.size())));
		System.out.println(lines.get(randomQuote));
		
		}catch(FileNotFoundException e){
			System.out.println("Missing File...");
		}//end of catch
		
		
		
	}

}
