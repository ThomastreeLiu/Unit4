import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomSentence {
    public RandomSentence() {
        JLabel title = new JLabel("Random Sentence");
        JLabel txt = new JLabel("Press the buttons to randomize a sentence");
        JButton button1 = new JButton("The");
        if (button1.getActionCommand ().equals ("1")){
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                button1.setText ("The");
            else if (rand == 1)
                button1.setText ("A");
            else
                button1.setText ("This");
        }


//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = GUIBasicN.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("RandomSentence");
        frame.setSize(470, 350);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUIBasicN panel = new GUIBasicN();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
