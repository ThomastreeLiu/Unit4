//Author:Thomas
//Name:girl
//Date:nov20
//Purpose:print 4 picture and 2 lable in the screen

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zebra extends JPanel implements ActionListener {


    public Zebra() {
        setBackground(Color.yellow);
        JLabel title = new JLabel("Many zebras");
        title.setFont(new Font("Zilla Slab", Font.ITALIC, 40));
        JLabel txt = new JLabel("Click zebra that is different");
        txt.setFont(new Font("Arial", Font.BOLD, 30));
        JButton pic1 = new JButton(createImageIcon("zebra1.jpg"));
        JButton pic2 = new JButton(createImageIcon("zebra2.jpg"));
        JButton pic3 = new JButton(createImageIcon("zebra3.jpg"));
        JButton pic4 = new JButton(createImageIcon("zebra4.jpg"));
//constructor with initializing code in here
        add(title);
        add(txt);
        add(pic1);
        add(pic2);
        add(pic3);
        add(pic4);
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Zebra.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Zebra");
        frame.setSize(450, 490);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Zebra panel = new Zebra();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}