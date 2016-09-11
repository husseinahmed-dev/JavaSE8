package Fall_2015.exercise;

/**
 * Created by Hussein on 11/15/15.
 */
public class Class61 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {3, 4};
        int[] result = addList(array3, array2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        percent(10,50);

        System.out.println(factorial(4));
        System.out.println(isEven(4));
        System.out.println(sum(array));

    }

    public static void percent(int numerator, int denominator) {
        System.out.printf("%%%.0f%n", (double) numerator/denominator*100);
    }

    public static int factorial(int number) {
        int result = 1;

        for (int i = number; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static int[] addList(int[] array1, int[] array2) {
        if (array1.length != array2.length) return new int[1];
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            result[i + array2.length] = array2[i];
        }

        return result;
    }
}
