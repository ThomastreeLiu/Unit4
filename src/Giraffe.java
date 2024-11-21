//Author:Thomas
//Name:giraffe
//Date:nov20
//Purpose:print 4 picture and 2 label in the screen

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Giraffe extends JPanel implements ActionListener {


    public Giraffe() {
        setBackground(Color.yellow);
        JLabel title = new JLabel("Tall giraffes");
        title.setFont(new Font("Zilla Slab", Font.ITALIC, 40));
        JLabel txt = new JLabel("Look carefully, click on the tallest giraffe");
        txt.setFont(new Font("Arial", Font.BOLD, 30));
        JButton pic1 = new JButton(createImageIcon("giraffe1.jpg"));
        JButton pic2 = new JButton(createImageIcon("giraffe2.jpg"));
        JButton pic3 = new JButton(createImageIcon("giraffe3.jpg"));
//constructor with initializing code in here
        add(title);
        add(txt);
        add(pic1);
        add(pic2);
        add(pic3);
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Giraffe.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("giraff");
        frame.setSize(650, 450);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Giraffe panel = new Giraffe();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}