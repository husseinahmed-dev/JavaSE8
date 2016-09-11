/**
 * Created by Hussein on 4/5/16.
 */
public class Recursion2 {
    private static int counter = 0;
    public static void main(String[] args) {
        count7(78124775);
        System.out.println(counter);
    }

    public static int count7(int n) {
        if (n == 0) return 0;
        else {
            int n2 = n % 10;
            if (n2 == 7) counter++;
            n /= 10;
            return count7(n);
        }
    }
}
