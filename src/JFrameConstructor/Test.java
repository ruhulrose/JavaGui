package JFrameConstructor;

import javax.swing.*;

public class Test extends JFrame {
    Test(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 500);
        setTitle("Welcome");
    }
    public static void main(String[] args) {
        Test frame= new Test();
        frame.setVisible(true);
    }
}
