package Fall_2015.GUI;

import javax.swing.JFrame;

/**
 * Created by Hussein on 8/4/15.
 */
public class MouseDetails extends JFrame {
    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150);
        mouseDetailsFrame.setVisible(true);
    }
}
