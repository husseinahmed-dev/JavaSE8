/**
 * Created by Hussein on 4/4/16.
 */
public class Recursion1 {
    private static int[] array1 = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
//        System.out.println(sum2(5));
        System.out.println("Traversing in Recursion " + traverseArray(0));
        System.out.println("Traversing in Iteration " + checkTraverse());
    }

    public static int sum2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else
            return n + sum2(n-2);
    }

    public static int traverseArray(int n) {
        if (n == array1.length) return 0;
        else {
            System.out.print(array1[n] + " ");
            return traverseArray(n + 1);
        }
    }

    public static int checkTraverse() {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum;
    }
}
