import javax.swing.*;

public class guiswing {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    JLabel label = new JLabel("Welcome to the jungle", JLabel.CENTER);
    frame.getContentPane().add(label);

    frame.setVisible(true);
  }
}
