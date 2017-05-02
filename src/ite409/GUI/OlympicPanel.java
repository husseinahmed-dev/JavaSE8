package ite409.GUI;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

/**
 * Created by Hussein on 4/13/17.
 */

public class OlympicPanel extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("athens-symbol.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int w = img.getWidth(null);
		int h = img.getHeight(null);
		BufferedImage bi = new
				BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics g4 = bi.getGraphics();
		g4.drawImage(img, 0, 0, null);
		float[] scales = { 1f, 1f, 1f, 0.5f };
		float[] offsets = new float[4];
		RescaleOp rop = new RescaleOp(scales, offsets, null);
		g2.drawImage(bi, rop, 0, 0);

		g.setColor(Color.BLACK);
		g.drawOval (200,20,150,150);

		g.setColor(Color.RED);
		g.drawOval (380,20,150,150);

		g.setColor(Color.BLUE);
		g.drawOval (20,20,150,150);

		g.setColor(Color.GREEN);
		g.drawOval (300,100,150,150);

		g.setColor(Color.YELLOW);
		g.drawOval (120,100,150,150);
	}
}
