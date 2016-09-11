package Fall_2015.GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

/**
 * Created by Hussein on 7/25/15.
 */
public class CheckBoxFrame extends JFrame {
    private final JTextField textField;
    private final JCheckBox checkBox1;
    private final JCheckBox checkBox2;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        checkBox1 = new JCheckBox("Bold");
        checkBox2 = new JCheckBox("Italic");
        add(checkBox1);
        add(checkBox2);

        // Register listeners for JCheckBox
        CheckBoxHandler handler = new CheckBoxHandler();
        checkBox1.addItemListener(handler);
        checkBox2.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;

            // Determine which CheckBoxes are checked and create font
            if (checkBox1.isSelected() && checkBox2.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (checkBox1.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (checkBox2.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);
        }
    }
}
