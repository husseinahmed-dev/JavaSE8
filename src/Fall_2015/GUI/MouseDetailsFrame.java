package Fall_2015.GUI;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by Hussein on 8/4/15.
 */
public class MouseDetailsFrame extends JFrame {
    private String details;             // String displayed in the statusBar
    private final JLabel statusBar;     // JLabel at bottom of window

    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int xPos = e.getX();
            int yPos = e.getY();

            details = String.format("Clicked %d time(s)", e.getClickCount());

            if (e.isMetaDown())     // right mouse button, CMD + Left
                details += " with right mouse button";
            else if (e.isAltDown())     // middle mouse button, Alt + Left
                details += " with center mouse button";
            else    // left mouse button
                details += " with left mouse button";

            statusBar.setText(details);
        }
    }
}
