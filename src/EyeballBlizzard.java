//Author:Thomas
//Name:EyeballBlizzard
//Date:nov27
//Purpose:Guess the number of monster

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EyeballBlizzard extends JPanel implements ActionListener {
    JTextField number = new JTextField(5);
    JButton guess = new JButton("Guess!");
    public EyeballBlizzard() {
        setBackground(Color.BLUE);
        JLabel pic = new JLabel(createImageIcon("EyeballBlizz.jpg"));
        JLabel txt = new JLabel("Enter your guess here:");
        txt.setForeground(Color.WHITE);
        guess.setBackground(Color.WHITE);
        guess.setForeground(Color.BLUE);
        guess.setOpaque(true);
        guess.addActionListener(this);
        guess.setActionCommand("Guess");
        add(pic);
        add(txt);
        add(number);
        add(guess);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("Guess")){
            int num = Integer.parseInt(number.getText());
            if (num==17)
                JOptionPane.showMessageDialog(null,"Correct!");
            else if (num>13&&num<21)
                JOptionPane.showMessageDialog(null,"Very close!");
            else
                JOptionPane.showMessageDialog(null,"Wrong!");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = EyeballBlizzard.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("EyeballBlizzard");
        frame.setSize(410, 430);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EyeballBlizzard panel = new EyeballBlizzard();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
