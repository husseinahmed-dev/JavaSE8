/**
 * Created by Hussein on 4/14/16.
 */
public class Recursion4 {
    private static boolean isStart = false;
    public static void main(String[] args) {
        divide("abc(abeffcd)efghi");

    }

    public static String divide(String word) {
        if (word.length() == 0) return " ";
        else {
            if (word.charAt(0) != '(') {
                return divide(word.substring(1));
            }
            if (word.charAt(word.length()-1) != ')') {
                return divide(word.substring(0, word.length()-2));
            }
            if (word.charAt(0) == '(' && word.charAt(word.length()-1) == ')') {
                return word.substring(0, word.length()-1);
            }

            return "word";
        }
    }
}
