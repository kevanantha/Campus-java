import java.awt.*;
import javax.swing.*;

public class FlowLayoutFrame extends JFrame {
  public FlowLayoutFrame() {
      setTitle ("JFrame with Flow Layout");
      setSize (300, 300);
      setLayout(new FlowLayout());
      JButton btn = new JButton("OK");
      JTextField tf = new JTextField(15);
      JLabel lbl = new JLabel("Name");
      add(lbl);
      add(tf);
      add(btn);
    }
  }
