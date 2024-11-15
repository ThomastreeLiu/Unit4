import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class GUIBasic extends JPanel implements ActionListener {
    public GUIBasic() {
//constructor with initializing code in here
    }
    public void actionPerformed(ActionEvent e) {
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = GUIBasic.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GuiBasic");
        frame.setSize(1920, 1080);         //resizes JFrame pane size
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUIBasic panel = new GUIBasic();
        panel.setOpaque(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}