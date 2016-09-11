package ITS350;

/**
 * Created by Hussein on 4/3/16.
 */
public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(power(4));
    }

    public static int power(int n) {
        if (n == 1) return 2;
        else
            return 2 * power(n-1);
    }
}
