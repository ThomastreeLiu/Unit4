import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class welcome extends JPanel implements ActionListener {


    public welcome() {
        JLabel welcome = new JLabel("*****Welcome*****");
        JLabel txt1 = new JLabel("Please enter the following");
        JLabel txt2 = new JLabel("Name:");
        JTextField word1 = new JTextField(10);
        JTextField word2 = new JTextField(10);
        JTextField word3 = new JTextField(10);
        JLabel txt3 = new JLabel("Age:");
        JLabel txt4 = new JLabel("Level:");
        JButton enter = new JButton("Done");
        enter.setBackground(Color.gray);
        enter.setForeground(Color.black);
        enter.addActionListener(this);
        enter.setActionCommand("enter");
        add(enter);
        add(welcome);
        add(txt1);
        add(txt2);
        add(word1);
        add(txt3);
        add(word2);
        add(txt4);
        add(word3);
        add(enter);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = welcome.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("welcome");
        frame.setSize(180, 200);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcome panel = new welcome();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}