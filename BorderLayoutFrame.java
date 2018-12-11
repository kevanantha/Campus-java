import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {
  public BorderLayoutFrame() {
  super();
  setTitle("Border Layout Frame");
    setSize(300, 300);
    setLayout(new BorderLayout());
    add(new JButton("North"), BorderLayout.NORTH);
    add(new JButton("South"), BorderLayout.SOUTH);
    add(new JButton("East"), BorderLayout.EAST);
    add(new JButton("West"), BorderLayout.WEST);
    add(new JButton("Center"), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    BorderLayoutFrame bl = new BorderLayoutFrame();
    bl.setVisible(true);
  }
}
