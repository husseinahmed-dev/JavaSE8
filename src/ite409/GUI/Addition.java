package ite409.GUI;
import javax.swing.JOptionPane;

/**
 * Created by Hussein on 4/4/17.
 */
public class Addition {
    public static void main(String[] args) {
        // obtain user input from JOptionPane input dialogs
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        // convert String inputs to int values for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Title: Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}

/*
Message dialog type
--------------------
ERROR_MESSAGE
INFORMATION_MESSAGE
WARNING_MESSAGE
QUESTION_MESSAGE
PLAIN_MESSAGE
 */