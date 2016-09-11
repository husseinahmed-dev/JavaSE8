package Fall_2015.GUI;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Created by Hussein on 8/8/15.
 */
public class KeyDemoFrame extends JFrame implements KeyListener {
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private final JTextArea textArea;

    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);

        addKeyListener(this);   // allow frame to process key events
    }

    // handle press of any key
    @Override
    public void keyTyped(KeyEvent e) {
        line1 = String.format("Key typed: %s", e.getKeyChar());
        setLines2and3(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    // set second and third lines of output
    private void setLines2and3(KeyEvent event) {
        line2 = String.format("This key is %s an action key", (event.isActionKey() ? "" : "not"));
        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
        line3 = String.format("Modifier keys pressed: %s", (temp.equals("") ? "none" : temp));
        textArea.setText(String.format("%S\n%s\n%s\n", line1, line2, line3));
    }
}
