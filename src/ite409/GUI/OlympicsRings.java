//OlympicRingViewer.java - Jimmy Kurian
package ite409.GUI;
import javax.swing.*;

import static javax.swing.JFrame.*;

public class OlympicsRings
{
   public static void main(String args[])
   {
      JFrame frame = new JFrame("Olympics Rings");
      OlympicPanel op = new OlympicPanel();
      frame.add(op);

      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.setSize(570, 320); // set frame size
      frame.setVisible(true); // display frame
   }
}
