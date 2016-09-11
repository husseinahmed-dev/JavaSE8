package Fall_2015.GUI;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Created by Hussein on 8/4/15.
 */
public class MouseTrackerFrame extends JFrame {
    private final JPanel mousePanel;    // panel in which mouse events occur
    private final JLabel statusBar;     // displays event information

    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    // can implement MouseInputListener instead
    private class MouseHandler implements MouseListener, MouseMotionListener {

        // MouseListener event handlers
        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Entered at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse Outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }


        // MouseMotionListener event handlers
        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));
        }
    }
}
