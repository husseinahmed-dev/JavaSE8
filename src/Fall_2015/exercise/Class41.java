package Fall_2015.exercise;

/**
 * Created by Hussein on 11/04/15.
 */
public class Class41 {
    public static void main(String[] args) {
        int[] first = {2, 6, 7};
        boolean hasSix = false;

        if (first[0] == 6 && first[first.length-1] == 6) {
            hasSix = true;
        } else if (first[0] == 6) {
            hasSix = true;
        } else if (first[first.length-1] == 6) {
            hasSix = true;
        }

        System.out.println("Array has 6: " + hasSix);
    }
}
