//Author:Thomas
//Name:cardnxtcard
//Date:nov26
//Purpose:Click to create a random side of dice

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChickenChicken extends JPanel implements ActionListener{
    JLabel card = new JLabel(createImageIcon("Chicken0.png"));
    JButton nxtcard = new JButton("Next Card");
    JButton check = new JButton("Check Egg");
    JLabel intro = new JLabel();
    int egg = 0;
    int hen = 0;
    int dog = 0;
    public ChickenChicken() {
        JLabel title = new JLabel("How many egg are in play?");
        nxtcard.setBackground(Color.RED);
        nxtcard.setForeground(Color.WHITE);
        nxtcard.setOpaque(true);
        nxtcard.addActionListener(this);
        nxtcard.setActionCommand("next");
        check.setBackground(Color.RED);
        check.setForeground(Color.WHITE);
        check.setOpaque(true);
        check.addActionListener(this);
        check.setActionCommand("check");
        add(card);
        add(intro);
        add(title);
        add(nxtcard);
        add(check);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("check"))
            JOptionPane.showMessageDialog(null,"Eggs:"+egg+
                    "\nHen:"+hen+"\nDogs:"+dog);
        if (e.getActionCommand ().equals ("next")){
            int rand = (int)(Math.random() * 10);
            if (rand == 0) {
                card.setIcon(createImageIcon("Chicken1.png"));
                intro.setText("Hens sit on one egg, if there is an egg.");
            }
            else if (rand == 1) {
                card.setIcon(createImageIcon("Chicken2.png"));
                intro.setText("You are counting eggs. Count one for this card.");
            }
            else if (rand == 2) {
                card.setIcon(createImageIcon("Chicken3.png"));
                intro.setText("A fox frightens away one hen, if there is a hen. ");
            }
            else if (rand == 3) {
                card.setIcon(createImageIcon("Chicken4.png"));
                intro.setText("Rooster does nothing to the egg or hen count. However, it says: ");
            }
            else if (rand == 4) {
                card.setIcon(createImageIcon("Chicken5.png"));
                intro.setText("Adds 2 to the egg count. ");
            }
            else if (rand == 5) {
                card.setIcon(createImageIcon("Chicken6.png"));
                intro.setText("If there is a hen, it is distracted. ");
            }
            else if (rand == 6) {
                card.setIcon(createImageIcon("Chicken7.png"));
                intro.setText("Duck does nothing to the egg or hen count. However, it says: ");
            }
            else if (rand == 7) {
                card.setIcon(createImageIcon("Chicken8.png"));
                intro.setText("Farmer collects all of the eggs. " +
                        "The hens go away because they have nothing to sit on. ");
            }
            else if (rand == 8) {
                card.setIcon(createImageIcon("Chicken9.png"));
                intro.setText("The dog chase the next fox to come.");
            }
            else {
                card.setIcon(createImageIcon("Chicken10.png"));
                intro.setText("The disguised fox works just like a fox except");
            }
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
        JFrame frame = new JFrame("ChickenChicken");
        frame.setSize(250, 440);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChickenChicken panel = new ChickenChicken();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}