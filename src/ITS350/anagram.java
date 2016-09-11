package ITS350;
import java.util.Scanner;

/**
 * Created by Hussein on 4/11/16.
 */
public class anagram {
    private static int size;
    private static int count;
    private static char[] arrChar = new char[100];

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = userInput.nextLine();
        size = input.length();
        count = 0;
        for (int j=0; j<size; j++)
            arrChar[j] = input.charAt(j);
        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int j=0; j<newSize; j++) {
            doAnagram(newSize-1);           // anagram remaining
            if (newSize==2)                 // if innermost,
                displayWord();              // display it
            rotate(newSize);                // rotate word
        }
    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for (j=position+1; j<size; j++)
            arrChar[j-1] = arrChar[j];
        arrChar[j-1] = temp;
    }

    public static void displayWord() {
        if (count<99)
            System.out.print(" ");
        if (count<9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for (int j=0; j<size; j++)
            System.out.print(arrChar[j]);
        System.out.print("   ");
        if (count%6 == 0)
            System.out.println();
    }

}
