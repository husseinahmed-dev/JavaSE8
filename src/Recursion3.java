/**
 * Created by Hussein.
 */
public class Recursion3 {
    private static int counter = 0;
    private static String word = "hussain";
    public static void main(String[] args) {
        System.out.println("2^4 " + power(2,4));
//        countA(word, 0);
//        System.out.println("(a)'s in hussain: " + counter);
//
//        System.out.println(removeA("ayas", 0));
        System.out.println(sumDigits(777));
    }

    public static int power(int a, int b) {
        if (b == 1) return a;
        else
            return a * power(a, b-1);
    }

    public static int countA(String word, int start) {
        if (start == word.length()) return 0;
        else {
            if (word.charAt(start) == 'a') counter++;
            return countA(word, ++start);
        }
    }

    public static String removeA(String word, int start) {
        if (start == word.length()) return word;
        else {
            if (word.charAt(start) == 'a') {
                return removeA(word.substring(++start), ++start);
            } else
                return removeA(word, ++start);
        }
    }

    public static int sumDigits(int n) {
        if (n%10 == 0) return 0;
        else {
            int remainder = n/10;
            int n2 = n%10;
            return n2 + sumDigits(remainder);
        }
    }
}
