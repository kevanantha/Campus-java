import javax.swing.*;

public class guiswing {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    JButton button = new JButton("Click");
    button.setBounds(130, 100, 100, 40);


    JLabel label = new JLabel("Welcome to the jungle", JLabel.CENTER);
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);

    frame.setLayout(null);
    frame.setVisible(true);
    FlowLayoutFrame flf = new FlowLayoutFrame();
    flf.setVisible(true);
  }
}
