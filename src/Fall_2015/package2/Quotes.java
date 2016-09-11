package Fall_2015.package2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("src/Fall_2015.package2/file.txt");

		Scanner read = null;

		ArrayList<String> quotes = new ArrayList<String>();

		try{
			read = new Scanner(file);
			while(read.hasNext()){

				quotes.add(read.nextLine());
			}

			int randomQuote = (int)(Math.random()*quotes.size());
			System.out.println(quotes.get(randomQuote));

		} catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
