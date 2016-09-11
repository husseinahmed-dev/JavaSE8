package ITS350;
import java.util.Scanner;
/**
 * Created by Hussein on 3/10/16.
 */
public class stackTest {
    public static void main(String[] args) {
        int maxSize = 10;
        stackDataStructure array = new stackDataStructure(maxSize);
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String userName = userInput.nextLine();

        for (int i = 0; i < userName.length(); i++) {
            array.push(userName.charAt(i));
        }

        for (int i = 0; i < userName.length(); i++) {
            System.out.print(array.pop());
        }
        System.out.println();
    }
}
