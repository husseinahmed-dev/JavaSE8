package Fall_2015.GUI;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Created by Hussein on 8/8/15.
 */
public class PaintPanel extends JPanel {
    private final ArrayList<Point> points = new ArrayList<>();

    public PaintPanel() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        points.add(e.getPoint());
                        repaint();
                    }
                }
        );
    }

    // draw ovals in a 4 by 4 bounding box at specified locations on window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // clears drawing area

        // draw all points
        for (Point point : points)
            g.fillOval(point.x, point.y, 4, 4);
    }
}
