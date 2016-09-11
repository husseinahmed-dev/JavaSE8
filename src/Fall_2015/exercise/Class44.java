package Fall_2015.exercise;

/**
 * Created by Hussein on 10/25/15.
 */
public class Class44 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int firstNumber = first[0];
        int lastNumber = first[first.length-1];
        int largest = firstNumber;

        if (largest < lastNumber) largest = lastNumber;

        for (int i = 0; i < first.length; i++) {
            first[i] = largest;
            System.out.printf("%d ", first[i]);
        }


    }
}
