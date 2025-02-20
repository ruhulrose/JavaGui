package InputDialogue;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String fName=JOptionPane.showInputDialog(null, "Enter your first name","First Name", JOptionPane.QUESTION_MESSAGE);
        String lName= JOptionPane.showInputDialog(null, "Enter your last name", "Last Name", JOptionPane.QUESTION_MESSAGE);
        String name= fName+ " "+ lName;
        JOptionPane.showMessageDialog(null, "Welcome "+name+" to my program", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
