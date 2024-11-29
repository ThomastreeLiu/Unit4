//Author:Thomas
//Name:SkiLift
//Date:nov29
//Purpose:Determine could lift lean this much people

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkiLift extends JPanel implements ActionListener {
    JButton Yes = new JButton("Yes");
    JButton No = new JButton("No");
    public SkiLift() {
        setBackground(Color.BLUE);
        JLabel pic = new JLabel(createImageIcon("SkiLiftPuzzle.jpg"));
        Yes.setBackground(Color.WHITE);
        Yes.setForeground(Color.BLUE);
        Yes.setOpaque(true);
        Yes.addActionListener(this);
        Yes.setActionCommand("yes");
        No.setBackground(Color.WHITE);
        No.setForeground(Color.BLUE);
        No.setOpaque(true);
        No.addActionListener(this);
        No.setActionCommand("no");
        add(pic);
        add(Yes);
        add(No);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("yes")){
            JOptionPane.showMessageDialog(null,"Try another one");
        }
        else if (e.getActionCommand ().equals ("no")) {
            JOptionPane.showMessageDialog(null,"Correct!");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SkiLift.class.getResource(path);
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
        frame.setSize(610, 400);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SkiLift panel = new SkiLift();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}