package Fall_2015.GUI;

import javax.swing.JFrame;

/**
 * Created by Hussein on 8/4/15.
 */
public class MouseTrackerTest extends JFrame {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
}
