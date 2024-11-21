//Author:Thomas
//Name:girl
//Date:nov.20
//Purpose:print 5 picture and 2 lable in the screen

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Girl extends JPanel implements ActionListener {


    public Girl() {
        setBackground(Color.yellow);
        JLabel title = new JLabel("Swimming picture");
        title.setFont(new Font("Zilla Slab", Font.ITALIC, 35));
        JLabel txt = new JLabel("Click on the piece that completes the picture.");
        txt.setFont(new Font("Arial", Font.BOLD, 25));
        JLabel pic = new JLabel(createImageIcon("swimmming.jpg"));
        JButton pic1 = new JButton(createImageIcon("swimmming1.jpg"));
        JButton pic2 = new JButton(createImageIcon("swimmming2.jpg"));
        JButton pic3 = new JButton(createImageIcon("swimmming3.jpg"));
        JButton pic4 = new JButton(createImageIcon("swimmming4.jpg"));
//constructor with initializing code in here
        add(title);
        add(txt);
        add(pic);
        add(pic1);
        add(pic2);
        add(pic3);
        add(pic4);
    }
    public void actionPerformed(ActionEvent e) {

    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Girl.class.getResource(path);

        if (imgURL != null) {

            return new ImageIcon(imgURL);

        } else {

            System.err.println("Couldn't find file: " + path);

            return null;

        }

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Girl");
        frame.setSize(570, 570);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Girl panel = new Girl();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}