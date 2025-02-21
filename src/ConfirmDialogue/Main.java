package ConfirmDialogue;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Option", JOptionPane.YES_NO_OPTION);
        if(choice== JOptionPane.YES_OPTION){
            YesOption();
        }else {
            JOptionPane.showMessageDialog(null, "Thanks you so much.");
        }
    }
    public static void YesOption(){
        String name=JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name+". You are mostly welcome");
    }

}
