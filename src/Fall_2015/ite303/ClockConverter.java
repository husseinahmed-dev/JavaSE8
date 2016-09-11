package Fall_2015.ite303;
import java.util.Scanner;
/**
 * Hussein Ahmed
 * ID: 13-00312
 * Grade: 100/100
 */
public class ClockConverter {
    public static void main(String[] args) {
        int time = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.printf("1- 12 hours to 24 hours conversion%n2- 24 hours to 12 hours conversion%n");
        System.out.print("Enter your choice: ");
        int userChoice = userInput.nextInt();

        if (userChoice == 1 || userChoice == 2) {

            // 12 hours to 24 hours
            if (userChoice == 1) {
                System.out.print("Enter hours (1-12): ");
                int userTime = userInput.nextInt();

                if (userTime >= 1 && userTime <= 12) {
                    System.out.print("Enter 1 for AM OR 2 for PM: ");
                    int meridian = userInput.nextInt();

                    if (meridian == 1 || meridian == 2) {
                        if (meridian == 1) {
                            if (userTime == 12) time = userTime - 12;
                            else time = userTime;
                        }
                        if (meridian == 2) {
                            if (userTime >= 1 && userTime <= 11) time = userTime + 12;
                            else time = userTime;
                        }
                        System.out.printf("%dhrs", time);
                    } else System.out.println("Invalid time am/pm. Please enter 1 for AM and 2 for PM only");
                } else System.out.println("Invalid hour. Please enter between 1 and 12 only");
            }

            // 24 hours to 12 hours
            if (userChoice == 2) {
                System.out.print("Enter hours (0-23): ");
                int userTime = userInput.nextInt();

                if (userTime >= 0 && userTime <= 23) {
                    String meridian;

                    if (userTime == 12) {
                        time = userTime;
                        meridian = "PM";
                    } else if (userTime == 0) {
                        time = userTime + 12;
                        meridian = "AM";
                    } else if (userTime > 12) {
                        time = userTime - 12;
                        meridian = "PM";
                    } else {
                        time = userTime;
                        meridian = "AM";
                    }

                    System.out.printf("%d%s", time, meridian);

                } else System.out.println("Invalid hour. Please enter between 0 and 23 only");
            }

        } else System.out.println("Invalid option. Please run the program again and select 1 or 2 only.");
    }
}
