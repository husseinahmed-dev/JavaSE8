package Fall_2015.GUI;

import javax.swing.JOptionPane;
/**
 * Created by Hussein on 7/24/15.
 */
public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter the first number");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int result = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is " + result, "Hassona Title", JOptionPane.PLAIN_MESSAGE);
    }
}
