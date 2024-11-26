//Author:Thomas
//Name:RandomSentence
//Date:nov25
//Purpose:print a random button, change by click

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomSentence extends JPanel implements ActionListener{
    private static JButton button1 = new JButton("The");
    private static JButton button2 = new JButton("Beautiful");
    private static JButton button3 = new JButton("Dragon");
    private static JButton button4 = new JButton("Crawled");
    private static JButton button5 = new JButton("Form");
    private static JButton button6 = new JButton("The");
    private static JButton button7 = new JButton("Crooked");
    private static JButton button8 = new JButton("Trunk");
    public RandomSentence() {
        setBackground(Color.white);
        JLabel title = new JLabel("Random Sentence");
        JLabel txt = new JLabel("Press the buttons to randomize a sentence");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setOpaque(true);
        button1.addActionListener(this);
        button1.setActionCommand("button1");

        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.YELLOW);
        button2.setOpaque(true);
        button2.addActionListener(this);
        button2.setActionCommand("button2");

        button3.setBackground(Color.GREEN);
        button3.setForeground(Color.RED);
        button3.setOpaque(true);
        button3.addActionListener(this);
        button3.setActionCommand("button3");

        button4.setBackground(Color.BLUE);
        button4.setForeground(Color.WHITE);
        button4.setOpaque(true);
        button4.addActionListener(this);
        button4.setActionCommand("button4");

        button5.setBackground(Color.PINK);
        button5.setForeground(Color.YELLOW);
        button5.setOpaque(true);
        button5.addActionListener(this);
        button5.setActionCommand("button5");

        button6.setBackground(Color.GRAY);
        button6.setForeground(Color.CYAN);
        button6.setOpaque(true);
        button6.addActionListener(this);
        button6.setActionCommand("button6");

        button7.setBackground(Color.ORANGE);
        button7.setForeground(Color.BLUE);
        button7.setOpaque(true);
        button7.addActionListener(this);
        button7.setActionCommand("button7");

        button8.setBackground(Color.RED);
        button8.setForeground(Color.BLUE);
        button8.setOpaque(true);
        button8.addActionListener(this);
        button8.setActionCommand("button8");
        add(title);
        add(txt);
        add(button1);
        button1.setPreferredSize(new Dimension (250, 38));
        add(button2);
        button2.setPreferredSize(new Dimension (250, 38));
        add(button3);
        button3.setPreferredSize(new Dimension (250, 38));
        add(button4);
        button4.setPreferredSize(new Dimension (250, 38));
        add(button5);
        button5.setPreferredSize(new Dimension (250, 38));
        add(button6);
        button6.setPreferredSize(new Dimension (250, 38));
        add(button7);
        button7.setPreferredSize(new Dimension (250, 38));
        add(button8);
        button8.setPreferredSize(new Dimension (250, 38));

    //constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand ().equals ("button1")){
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                button1.setText ("The");
            else if (rand == 1)
                button1.setText ("A");
            else
                button1.setText ("This");
        }
        if (e.getActionCommand ().equals ("button2")){
            int rand = (int)(Math.random() * 5);
            if (rand == 0)
                button2.setText ("Tall");
            else if (rand == 1)
                button2.setText ("Green");
            else if (rand == 2)
                button2.setText ("Silent");
            else if (rand == 3)
                button2.setText ("Old");
            else
                button2.setText ("Expensive");
        }
        if (e.getActionCommand ().equals ("button3")){
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                button3.setText ("Boy");
            else if (rand == 1)
                button3.setText ("Wheat");
            else
                button3.setText ("Policy");
        }
        if (e.getActionCommand ().equals ("button4")){
            int rand = (int)(Math.random() * 5);
            if (rand == 0)
                button4.setText ("Arrived");
            else if (rand == 1)
                button4.setText ("Slithered");
            else if (rand == 2)
                button4.setText ("Bounced");
            else if (rand == 3)
                button4.setText ("Dashed");
            else
                button4.setText ("Flew");
        }
        if (e.getActionCommand ().equals ("button5")){
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                button5.setText ("By");
            else if (rand == 1)
                button5.setText ("To");
            else
                button5.setText ("Near");
        }
        if (e.getActionCommand ().equals ("button6")){
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                button6.setText ("The");
            else if (rand == 1)
                button6.setText ("A");
            else
                button6.setText ("This");
        }
        if (e.getActionCommand ().equals ("button7")){
            int rand = (int)(Math.random() * 4);
            if (rand == 0)
                button7.setText ("Stunning");
            else if (rand == 1)
                button7.setText ("Wonderful");
            else if (rand == 2)
                button4.setText ("Dreadful");
            else
                button7.setText ("Dingy");
        }
        if (e.getActionCommand ().equals ("button8")){
            int rand = (int)(Math.random() * 6);
            if (rand == 0)
                button8.setText ("Cave");
            else if (rand == 1)
                button8.setText ("Rock");
            else if (rand == 2)
                button4.setText ("Skyscraper");
            else if (rand == 3)
                button4.setText ("Fence");
            else if (rand == 4)
                button4.setText ("Baseball");
            else
                button8.setText ("Diamond");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = RandomSentence.class.getResource(path);

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
        frame.setSize(260, 430);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomSentence panel = new RandomSentence();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}