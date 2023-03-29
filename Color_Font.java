package colors;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Color_Font {

    public static void main(String[] args) {
        // TODO code application logic here
        Color clr = new Color(228, 100, 255);
        Font fnt = new Font("SensSerif", Font.BOLD, 32);

        // TODO code application logic here
        JFrame frame = new JFrame("New Frame");

        // Add button into the frame
        Container container = frame.getContentPane();
        JButton button = new JButton("OK");
        container.add(button);
        button.setBackground(clr);
        button.setFont(fnt);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
