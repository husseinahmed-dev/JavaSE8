/**
 * Created by Hussein.
 */
public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(sum(15));
        System.out.println(sumCharacters("Ro(ck(N)Roll"));
    }

    public static int fibonacci(int number) {
        if (number == 1) return 1;
        else {
            return number * fibonacci(number-1);
        }
    }

    public static int sum(int number) {
        if (number == 1) return 1;
        else {
            return number + sum(number-1);
        }
    }

    public static String sumCharacters(String word) {
        if (word.charAt(0) == '(' && word.charAt(word.length()-1) == ')') return word;
        else {
            if (word.charAt(0) != '(') {
                return sumCharacters(word.substring(1));
            }
            if (word.charAt(word.length()-1) != ')' ) {
                return sumCharacters(word.substring(0, word.length()-1));
            }
            return word;
        }
    }

}
