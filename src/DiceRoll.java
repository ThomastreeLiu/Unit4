import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class DiceRoll extends JPanel implements ActionListener{
    JButton Dice = new JButton("CLICK");
    public DiceRoll() {
        JLabel title = new JLabel("Click to roll the dice");
        Dice.setBackground(Color.WHITE);
        Dice.setForeground(Color.BLACK);
        Dice.setOpaque(true);
        Dice.addActionListener(this);
        Dice.setActionCommand("Click");
        add(title);
        add(Dice);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("Click")){
            int rand = (int)(Math.random() * 6);
            if (rand == 0)
                Dice.setIcon (createImageIcon("dice1.gif"));
            else if (rand == 1)
                Dice.setIcon (createImageIcon("dice2.gif"));
            else if (rand == 2)
                Dice.setIcon (createImageIcon("dice3.gif"));
            else if (rand == 3)
                Dice.setIcon (createImageIcon("dice4.gif"));
            else if (rand == 4)
                Dice.setIcon (createImageIcon("dice5.gif"));
            else
                Dice.setIcon (createImageIcon("dice6.gif"));
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = DiceRoll.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("DiceRoll");
        frame.setSize(190, 190);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DiceRoll panel = new DiceRoll();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
