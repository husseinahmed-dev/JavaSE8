package Fall_2015.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * Created by Hussein on 7/25/15.
 */
public class ButtonFrame extends JFrame {
    private final JButton button1;
    private final JButton button2;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        button1 = new JButton("Plain Button");
        add(button1);

        Icon bug1 = new ImageIcon(getClass().getResource("engine.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("engine2.png"));
        button2 = new JButton("Fancy Button", bug1);
        button2.setRolloverIcon(bug2);
        add(button2);

        ButtonHandler handler = new ButtonHandler();
        ButtonHandler2 handler2 = new ButtonHandler2();
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button1.addKeyListener(handler2);
        button2.addKeyListener(handler2);
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", e.getActionCommand()));
        }
    }

    private class ButtonHandler2 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == 10)
                JOptionPane.showMessageDialog(ButtonFrame.this, "Worked");
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
