import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class order extends JPanel implements ActionListener {


    public order() {
        JLabel welcome = new JLabel("Welcome to the order form");
        JLabel txt1 = new JLabel("Fries @ 1.50$ each");
        JLabel txt2 = new JLabel("Burgers @ 3.50$ each");
        JTextField word1 = new JTextField(10);
        JTextField word2 = new JTextField(10);
        JTextField word3 = new JTextField(10);
        JLabel txt3 = new JLabel("Sodas @ 1.00$ each");
        //JLabel txt4 = new JLabel("Level:");
        JButton enter = new JButton("Done");
        enter.setBackground(Color.gray);
        enter.setForeground(Color.black);
        enter.addActionListener(this);
        enter.setActionCommand("Order Now!");
        add(enter);
        add(welcome);
        add(txt1);
        add(txt2);
        add(word1);
        add(txt3);
        add(word2);
        //add(txt4);
        add(word3);
        add(enter);
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = order.class.getResource(path);

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
        order panel = new order();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}