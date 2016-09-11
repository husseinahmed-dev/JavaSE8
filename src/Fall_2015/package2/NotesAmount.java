package Fall_2015.package2;
import java.util.Scanner;
/**
 * Created by Hussein on 9/25/15.
 */
public class NotesAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total amount of money available: ");
        int money = input.nextInt();

        int _250 = 0, _500 = 0, _1000 = 0, _5000 = 0, _10000 = 0, _25000 = 0;

        _25000 = money / 25000;
        money -= _25000 * 25000;
        _10000 = money / 10000;
        money -= _10000 * 10000;
        _5000 = money / 5000;
        money -= _5000 * 5000;
        _1000 = money / 1000;
        money -= _1000 * 1000;
        _500 = money / 500;
        money -= _500 * 500;
        _250 = money / 250;
        money -= _250 * 250;

        System.out.println("----------------------------------");

        System.out.printf("%nNotes of 25000 IQD: %d%nNotes of 10000 IQD: %d%nNotes of 5000 IQD: %d%nNotes of 1000 IQD: %d%nNotes of 500 IQD: %d%nNotes of 250 IQD: %d%n",
                _25000, _10000, _5000, _1000, _500, _250);
    }
}
