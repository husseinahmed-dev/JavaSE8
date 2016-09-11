package Fall_2015.exercise;

/**
 * Created by Hussein on 10/25/15.
 */
public class Class42 {
    public static void main(String[] args) {
        int[] first = {1,2,1};
        boolean status = false;

        if (first.length > 0) {
            if (first[0] == first[first.length - 1]) status = true;
            else status = false;    // optional
        } else status = false;      // optional

        System.out.println(status);
    }
}
