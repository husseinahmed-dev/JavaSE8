package Fall_2015.GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 * Created by Hussein on 7/26/15.
 */
public class RadioButtonFrame extends JFrame {
    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font boldItalicFont;
    private final JRadioButton plainRadioButton;
    private final JRadioButton boldRadioButton;
    private final JRadioButton italicRadioButton;
    private final JRadioButton boldItalicRadioButton;
    private final ButtonGroup radioGroup;   // holds radio buttons


    public RadioButtonFrame() {
        super("JRadioButton Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 25);
        add(textField);

        // create radio buttons
        plainRadioButton = new JRadioButton("Plain", true);
        boldRadioButton = new JRadioButton("Bold", false);
        italicRadioButton = new JRadioButton("Italic", false);
        boldItalicRadioButton = new JRadioButton("Bold & Italic", false);
        add(plainRadioButton);
        add(boldRadioButton);
        add(italicRadioButton);
        add(boldItalicRadioButton);


        // create logical relationship between JRadioButtons
        radioGroup = new ButtonGroup();
        radioGroup.add(plainRadioButton);
        radioGroup.add(boldRadioButton);
        radioGroup.add(italicRadioButton);
        radioGroup.add(boldItalicRadioButton);

        // create font objects
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

        textField.setFont(plainFont);

        // register events for JRadioButtons
        plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

    // handle radio buttons events
    private class RadioButtonHandler implements ItemListener {
        private Font font;

        public RadioButtonHandler(Font font) {
            this.font = font;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(font);
        }
    }
}
