import javax.swing.*;

public class JFrameDemo extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 300);
        frame.setTitle("Ruhul");
    }
}
