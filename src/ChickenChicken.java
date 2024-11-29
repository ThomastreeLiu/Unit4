//Author:Thomas
//Name:DiceRoll
//Date:nov26
//Purpose:Click to create a random side of dice

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChickenChicken extends JPanel implements ActionListener{
    JLabel Dice = new JLabel(createImageIcon("Chicken0.png"));
    JButton Roll = new JButton("Next Card");
    public ChickenChicken() {
        JLabel title = new JLabel("How many egg are in play?");
        Roll.setBackground(Color.RED);
        Roll.setForeground(Color.WHITE);
        Roll.setOpaque(true);
        Roll.addActionListener(this);
        Roll.setActionCommand("next");
        add(title);
        add(Dice);
        add(Roll);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("next")){
            int rand = (int)(Math.random() * 10);
            if (rand == 0)
                Dice.setIcon (createImageIcon("Chicken1.png"));
            else if (rand == 1)
                Dice.setIcon (createImageIcon("Chicken2.png"));
            else if (rand == 2)
                Dice.setIcon (createImageIcon("Chicken3.png"));
            else if (rand == 3)
                Dice.setIcon (createImageIcon("Chicken4.png"));
            else if (rand == 4)
                Dice.setIcon (createImageIcon("Chicken5.png"));
            else if (rand == 5)
                Dice.setIcon (createImageIcon("Chicken6.png"));
            else if (rand == 6)
                Dice.setIcon (createImageIcon("Chicken7.png"));
            else if (rand == 7)
                Dice.setIcon (createImageIcon("Chicken8.png"));
            else if (rand == 8)
                Dice.setIcon (createImageIcon("Chicken9.png"));
            else
                Dice.setIcon (createImageIcon("Chicken10.png"));
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ChickenChicken.class.getResource(path);
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
        JFrame frame = new JFrame("DiceRoll");
        frame.setSize(190, 210);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChickenChicken panel = new ChickenChicken();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}