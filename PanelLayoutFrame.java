import javax.swing.*;
import java.awt.*;

public class PanelLayoutFrame extends JFrame {
  public PanelLayoutFrame() {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    setTitle("Panel Layout Frame");
    p1.setLayout(new GridLayout(0, 2, 5, 5));
    p2.setLayout(new FlowLayout());
    p3.setLayout(new GridLayout(2, 0, 5, 5));

    JLabel lblName = new JLabel("Name", JLabel.CENTER);
    JLabel lblAge = new JLabel("Age", JLabel.CENTER);
    JTextField tfName = new JTextField(15); 
    JTextField tfAge = new JTextField(15);  
    JButton btnOk = new JButton("OK");
    JButton btnCancel = new JButton("Cancel");

    p1.add(lblName);
    p1.add(tfName);
    p1.add(lblAge);
    p1.add(tfAge);
    p2.add(btnOk);
    p2.add(btnCancel);
    p3.add(p1);
    p3.add(p2);

    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout(5, 5));
    add(p3, BorderLayout.NORTH);
  }

  public static void main(String[] args) {
    PanelLayoutFrame pl = new PanelLayoutFrame();
    pl.setVisible(true);
  }
}
