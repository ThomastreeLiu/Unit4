import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.border.*;

public class Zoo  extends JPanel implements ActionListener {
    private JPanel p_card; // to hold all of the screens
    private JPanel card1, card2, card3, card4, card5, card6, card7, card8,
            card9, card10, card11, card12; // the screens CardLayout
    private CardLayout cdLayout = new CardLayout();

    public Zoo() {

        p_card = new JPanel();
        p_card.setLayout(cdLayout);
        zoogate();
        chooseWhere();
        aviary();
        canadaJay();
        hoatzin();
        smallMammals();
        bilby();
        quoll();
        pangolin();
        outdoorPens();
        zorse();
        honeyBad();
        // frame.setSize(500, 500); //use in main class
        setLayout(new BorderLayout());
        add("Center", p_card);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Zoo");
        frame.setSize(550, 650);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Zoo panel = new Zoo();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void zoogate() {
        // screen 1 is set up.
        card1 = new JPanel();
        card1.setBackground(Color.white);
        JLabel title = new JLabel("Welcome to the zoo!");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("zoogate.jpg"));
        JButton next = new JButton("Enter");
        next.setPreferredSize(new Dimension(400, 50));
        next.setActionCommand("2");
        next.addActionListener(this);
        card1.add(title);
        card1.add(pic);
        card1.add(next);
        p_card.add("1", card1);
    }

    public void chooseWhere() {
        // screen 2 - pick from the options - is set up.
        card2 = new JPanel();
        card2.setBackground(Color.white);
        JLabel title = new JLabel("Where do you want to go?");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("alley.jpg"));
        JButton rept = new JButton("Aviary");
        rept.setActionCommand("3");
        rept.addActionListener(this);
        rept.setPreferredSize(new Dimension(400, 50));
        JButton small = new JButton("Small Mammal House");
        small.setActionCommand("4");
        small.addActionListener(this);
        small.setPreferredSize(new Dimension(400, 50));
        JButton out = new JButton("Outdoor Pens");
        out.setActionCommand("5");
        out.addActionListener(this);
        out.setPreferredSize(new Dimension(400, 50));
        card2.add(title);
        card2.add(pic);
        card2.add(rept);
        card2.add(small);
        card2.add(out);
        p_card.add("2", card2);
    }

    public void aviary() {
        // screen 3- the Aviary - is set up.
        card3 = new JPanel();
        card3.setBackground(Color.white);
        JLabel title = new JLabel("    The Aviary");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("aviary.jpg"));
        JButton canadaJay = new JButton("Canada Jay");
        canadaJay.setActionCommand("6");
        canadaJay.addActionListener(this);
        canadaJay.setPreferredSize(new Dimension(400, 50));
        JButton hoatzin = new JButton("Hoatzin");
        hoatzin.setActionCommand("7");
        hoatzin.addActionListener(this);
        hoatzin.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card3.add(title);
        card3.add(pic);
        card3.add(canadaJay);
        card3.add(hoatzin);
        card3.add(entrance);
        p_card.add("3", card3);
    }

    public void smallMammals() {
        // screen 4 - small Mammal House - is set up.
        card4 = new JPanel();
        card4.setBackground(Color.white);
        JLabel title = new JLabel("Small Mammal House");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("mammals.jpg"));
        JButton bilby = new JButton("Bilby");
        bilby.setActionCommand("8");
        bilby.addActionListener(this);
        bilby.setPreferredSize(new Dimension(400, 50));
        JButton quoll = new JButton("Quoll");
        quoll.setActionCommand("9");
        quoll.addActionListener(this);
        quoll.setPreferredSize(new Dimension(400, 50));
        JButton pangolin = new JButton("Pangolin");
        pangolin.setActionCommand("10");
        pangolin.addActionListener(this);
        pangolin.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card4.add(title);
        card4.add(pic);
        card4.add(bilby);
        card4.add(quoll);
        card4.add(pangolin);
        card4.add(entrance);
        p_card.add("4", card4);
    }

    public void outdoorPens() { // screen 5 - the outdoor Pens - is set up.
        card5 = new JPanel();
        card5.setBackground(Color.white);
        JLabel title = new JLabel("Outdoor Pens");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("outdoorpen.jpg"));
        JButton zorse = new JButton("Zorse");
        zorse.setActionCommand("11");
        zorse.addActionListener(this);
        zorse.setPreferredSize(new Dimension(400, 50));
        JButton honeyBad = new JButton("HoneyBadger");
        honeyBad.setActionCommand("12");
        honeyBad.addActionListener(this);
        honeyBad.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card5.add(title);
        card5.add(pic);
        card5.add(zorse);
        card5.add(honeyBad);
        card5.add(entrance);
        p_card.add("5", card5);
    }

    public void canadaJay() { // screen 6 - Canada Jay - is set up.
        card6 = new JPanel();
        card6.setBackground(Color.white);
        JLabel title = new JLabel("Canada Jay aka Gray Jay");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("Canadajay.jpg"));
        JButton returnBack = new JButton("Return to Aviary");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("3");
        returnBack.addActionListener(this);
        card6.add(title);
        card6.add(pic);
        card6.add(returnBack);
        p_card.add("6", card6);
    }

    public void hoatzin() { // screen 7 - Hoatzin - is set up.
        card7 = new JPanel();
        card7.setBackground(Color.white);
        JLabel title = new JLabel("Living Dinosaur - Hoatzin");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("hoatzin.jpg"));
        JButton returnBack = new JButton("Return to Aviary");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("3");
        returnBack.addActionListener(this);
        card7.add(title);
        card7.add(pic);
        card7.add(returnBack);
        p_card.add("7", card7);
    }

    public void bilby() {
        // screen 8 - Bilby - is set up.
        card8 = new JPanel();
        card8.setBackground(Color.white);
        JLabel title = new JLabel("Cute Little Bilby");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("bilby.jpg"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card8.add(title);
        card8.add(pic);
        card8.add(returnBack);
        p_card.add("8", card8);
    }

    public void quoll() {
        // screen 9 - Quoll - is set up.
        card9 = new JPanel();
        card9.setBackground(Color.white);
        JLabel title = new JLabel("Cat-size Quoll");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("quoll.jpg"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card9.add(title);
        card9.add(pic);
        card9.add(returnBack);
        p_card.add("9", card9);
    }

    public void pangolin() {
        // screen 10 - pangolin - is set up.
        card10 = new JPanel();
        card10.setBackground(Color.white);
        JLabel title = new JLabel("Adorable Pangolin");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("pangolin.jpg"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card10.add(title);
        card10.add(pic);
        card10.add(returnBack);
        p_card.add("10", card10);
    }

    public void zorse() { // screen 11 - zorse - is set up.
        card11 = new JPanel();
        card11.setBackground(Color.white);
        JLabel title = new JLabel("Horse + Zebra = Zorse");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("zorse.jpg"));
        JButton returnBack = new JButton("Return to Outdoor Pens");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("5");
        returnBack.addActionListener(this);
        card11.add(title);
        card11.add(pic);
        card11.add(returnBack);
        p_card.add("11", card11);
    }

    public void honeyBad() { // screen 12 - honeyBadger - is set up.
        card12 = new JPanel();
        card12.setBackground(Color.white);
        JLabel title = new JLabel("Beautiful HoneyBadger");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel pic = new JLabel(createImageIcon("honeybadger.jpg"));
        JButton returnBack = new JButton("Return to Outdoor Pens");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("5");
        returnBack.addActionListener(this);
        card12.add(title);
        card12.add(pic);
        card12.add(returnBack);
        p_card.add("12", card12);
    }

    public void actionPerformed(ActionEvent e) {
        // moves between the screens
        if(e.getActionCommand().equals("1"))
            cdLayout.show(p_card, "1");
        else if(e.getActionCommand().equals("2"))
            cdLayout.show(p_card, "2");
        else if(e.getActionCommand().equals("3"))
            cdLayout.show(p_card, "3");
        else if(e.getActionCommand().equals("4"))
            cdLayout.show(p_card, "4");
        else if(e.getActionCommand().equals("5"))
            cdLayout.show(p_card, "5");
        else if(e.getActionCommand().equals("6"))
            cdLayout.show(p_card, "6");
        else if(e.getActionCommand().equals("7"))
            cdLayout.show(p_card, "7");
        else if(e.getActionCommand().equals("8"))
            cdLayout.show(p_card, "8");
        else if(e.getActionCommand().equals("9"))
            cdLayout.show(p_card, "9");
        else if(e.getActionCommand().equals("10"))
            cdLayout.show(p_card, "10");
        else if(e.getActionCommand().equals("11"))
            cdLayout.show(p_card, "11");
        else if(e.getActionCommand().equals("12"))
            cdLayout.show(p_card, "12");
    }

    protected static ImageIcon createImageIcon(String path) {

        java.net.URL imgURL = Zoo.class.getResource(path);

        if(imgURL != null) {

            return new ImageIcon(imgURL);
        } else {

            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
