package JFrameImageSet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }
}

class Frame extends JFrame{
    private ImageIcon icom;
    Frame(){
        initComponenet();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 200, 300, 500);
        setTitle("Welcome");
    }
    public void initComponenet(){
        icom =new ImageIcon(getClass().getResource("windows.png"));
        this.setIconImage(icom.getImage());
    }
}
