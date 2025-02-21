package JFrameBackground;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }

}
class Frame extends JFrame{
    private ImageIcon icon;
    private Container container;
    Frame(){
        initContainer();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 400, 300, 500);
        setTitle("Welcome");
    }
    public void initContainer(){
        icon = new ImageIcon(getClass().getResource("windows.png"));
        this.setIconImage(icon.getImage());
        container = this.getContentPane();
        container.setBackground(Color.BLACK);
    }
}

