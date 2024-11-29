//Author:Thomas
//Name:SnowmanJumble
//Date:nov29
//Purpose:Count the number of snowman

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowmanJumble extends JPanel implements ActionListener {
    JTextField number = new JTextField(5);
    JButton guess = new JButton("Guess!");
    public SnowmanJumble() {
        setBackground(Color.BLUE);
        JLabel pic = new JLabel(createImageIcon("SnowmanJumble.jpg"));
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
            if (num==16)
                JOptionPane.showMessageDialog(null,"Correct!");
            else if (num>12&&num<20)
                JOptionPane.showMessageDialog(null,"Very close!");
            else
                JOptionPane.showMessageDialog(null,"Wrong!");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SnowmanJumble.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        }
        else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("EyeballBlizzard");
        frame.setSize(360, 470);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnowmanJumble panel = new SnowmanJumble();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}