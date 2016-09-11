package ITS350;
import java.util.Scanner;
/**
 * Created by Hussein on 4/27/16.
 */
public class RecursionCombinations {
    private static String group = "";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter size of the group: ");
        int n = userInput.nextInt();
        System.out.print("Enter number of people selected: ");
        int k = userInput.nextInt();

        System.out.print("Possible team combinations: ");
        showTeam(n, k, '@', group);
    }

    public static int showTeam(int n, int k, char member , String group) {
        if (k == 0) {
            System.out.print(group + " ");
            return 0;
        }
        if (n < k) {
            return 0;
        } else {
            showTeam(n-1, k-1, member++, group+member);
            showTeam(n-1, k, member++, group);
            return 1;
        }

    }
}
