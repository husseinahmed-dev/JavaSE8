package Fall_2015.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;      // returned by Fall_2015.GUI components
import java.awt.event.ActionListener;   // interface extended by event-handler inner-class
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


/**
 * Created by Hussein on 7/24/15.
 */
public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Hassona");
        add(textField2);

        textField3 = new JTextField("Scorpion Security", 20);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Pa$$w0rd");
        add(passwordField);

        // Register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    // Event handler
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String message = "";

            if (event.getSource() == textField1)
                message = String.format("textField1: %s", event.getActionCommand());

            else if (event.getSource() == textField2)
                message = String.format("textField2: %s", event.getActionCommand());

            else if (event.getSource() == textField3)
                message = String.format("textField3: %s", event.getActionCommand());

            else if (event.getSource() == passwordField)
                message = String.format("passwordField: %s", event.getActionCommand());


            // display JTextField content
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
