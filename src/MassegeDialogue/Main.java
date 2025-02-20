package MassegeDialogue;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 for 2 parameter");
        System.out.println("2 for 4 parameter");
        System.out.println("3 for 5 parameter");
        TwoParameter();
        FourParameter();
        FiveParameter();
    }
    public static void TwoParameter(){
        JOptionPane.showMessageDialog(null, "2 parameter");
    }
    public static void FourParameter(){
        JOptionPane.showMessageDialog(null, "Four Parameter box", "Warning", JOptionPane.ERROR_MESSAGE);
    }
    public static void FiveParameter(){
        ImageIcon ing = new ImageIcon("pngp.png");
        JOptionPane.showMessageDialog(null, "Five Parameter", "Hello", -1, ing);
    }
}
