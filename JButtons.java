package jbutton;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

public class JButtons {
    public static void main(String[] args) {
    // TODO code application logic here
        JFrame frame = new JFrame("New Frame");
        
    // Add button into the frame
        Container container = frame.getContentPane();
        JButton button = new JButton("OK");
        container.add(button);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
